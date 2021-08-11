package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPrototypeLifeCycleDemoApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanPrototypeLifeCycle-applicationContext.xml");

        ICoach coach = context.getBean("myCoach", ICoach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
