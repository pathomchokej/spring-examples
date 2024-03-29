package com.luv2code.springannotationdemo;

import com.luv2code.springannotationdemo.coaches.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args){
        // read spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean
        ICoach coach = context.getBean("baseballCoach", ICoach.class);

        // call function
        System.out.println(coach.getDailyWorkout());

        // close context
        context.close();
    }
}
