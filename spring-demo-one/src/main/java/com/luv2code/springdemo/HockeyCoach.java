package com.luv2code.springdemo;

public class HockeyCoach extends BaseCoach{

    public HockeyCoach(IFortuneService theFortuneService) {
        super(theFortuneService);
    }

    @Override
    public String getDailyWorkout() {
        return "Play Hockey";
    }

    private void initialize() {
        System.out.println("Hockey is initialize!!!");
    }

    private void destroy() {
        System.out.println("Hockey is destroy!!!");
    }
}
