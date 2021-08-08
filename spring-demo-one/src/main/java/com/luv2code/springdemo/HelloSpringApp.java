package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class HelloSpringApp {
    public static void main(String[] args){
        // applicationContext.xml must be keep in resources folder.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ICoach theCoach = context.getBean("baseballCoach", ICoach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
