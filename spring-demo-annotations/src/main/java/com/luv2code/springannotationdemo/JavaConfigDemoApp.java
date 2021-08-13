package com.luv2code.springannotationdemo;

import com.luv2code.springannotationdemo.coaches.BaseCoach;
import com.luv2code.springannotationdemo.coaches.ICoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args){
        // read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get bean
        BaseCoach coach = context.getBean("footballCoach", BaseCoach.class);

        // call function
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
