package com.luv2code.springdemo;

public class MyApp {

    public static void main(String[] args) {
        // create the object
        ICoach theCoach = new TrackCoach(null);
        // use the object
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }
}
