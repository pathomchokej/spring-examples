package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.LinkedList;
import java.util.List;

public class CustomBeanProcessor implements BeanPostProcessor, DisposableBean, BeanFactoryAware {

    private BeanFactory beanFactory;
    private final List<Object> prototypeBeans = new LinkedList<>();

    @Override
    public void destroy() throws Exception {
        // loop through the prototype beans and call the destroy() method on each one

        synchronized (prototypeBeans) {

            for (Object bean : prototypeBeans) {

                if (bean instanceof DisposableBean) {
                    DisposableBean disposable = (DisposableBean) bean;
                    try {
                        disposable.destroy();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            prototypeBeans.clear();
        }
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        // after start up, keep track of the prototype scoped beans.
        // we will need to know who they are for later destruction

        if (beanFactory.isPrototype(beanName)) {
            synchronized (prototypeBeans) {
                prototypeBeans.add(bean);
            }
        }

        return bean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory= beanFactory;
    }
}
