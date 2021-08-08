package com.luv2code.springdemo;

public class BaseballCoach extends BaseCoach {

    public BaseballCoach(IFortuneService theFortuneService) {
        super(theFortuneService);
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 mins on batting practice";
    }
}
