package com.luv2code.springannotationdemo;

import com.luv2code.springannotationdemo.coaches.BaseCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConstructureInjectDemoApp {
    public static void main(String[] args){
        // read configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean
        BaseCoach coach = context.getBean("footballCoach", BaseCoach.class);

        // call function
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
