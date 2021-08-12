package com.luv2code.springannotationdemo;

import com.luv2code.springannotationdemo.coaches.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args){

        // load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get two prototype beans
        ICoach prototypeCoach1 = context.getBean("baseballCoach", ICoach.class);
        ICoach prototypeCoach2 = context.getBean("baseballCoach", ICoach.class);

        // compare
        System.out.println("prototype coach 1 is " + prototypeCoach1);
        System.out.println("prototype coach 2 is " + prototypeCoach2);
        System.out.println("prototype coach 1 and 2 is " + ((prototypeCoach1 == prototypeCoach2)? "equal" : "not equal"));

        // get two prototype beans
        ICoach staticCoach1 = context.getBean("tennisCoach", ICoach.class);
        ICoach staticCoach2 = context.getBean("tennisCoach", ICoach.class);

        // compare
        System.out.println("static coach 1 is " + staticCoach1);
        System.out.println("static coach 2 is " + staticCoach2);
        System.out.println("static coach 1 and 2 is " + ((staticCoach1 == staticCoach2)? "equal" : "not equal"));

        // close context
        context.close();
    }
}
