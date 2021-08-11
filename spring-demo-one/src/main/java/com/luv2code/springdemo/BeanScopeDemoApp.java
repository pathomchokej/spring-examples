package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        ICoach coach = context.getBean("myCoach", ICoach.class);

        ICoach backUpCoach = context.getBean("myCoach", ICoach.class);

        // Check if they are the same
        boolean isSame = coach == backUpCoach;

        System.out.println("Pointing to the " + ((isSame)? "same" : "different") + " object");
        System.out.println("1st coach is at " + coach);
        System.out.println("2nd coach is at " + backUpCoach);
    }
}
