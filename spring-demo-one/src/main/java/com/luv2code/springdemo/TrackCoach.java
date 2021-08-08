package com.luv2code.springdemo;

public class TrackCoach extends BaseCoach {

    public TrackCoach(IFortuneService theFortuneService) {
        super(theFortuneService);
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
