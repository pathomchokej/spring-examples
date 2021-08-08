package com.luv2code.springdemo;

public class HockeyCoach extends BaseCoach{

    public HockeyCoach(IFortuneService theFortuneService) {
        super(theFortuneService);
    }

    @Override
    public String getDailyWorkout() {
        return "Play Hockey";
    }
}
