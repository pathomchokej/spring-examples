package com.luv2code.springdemo;

public class CricketCoach extends BaseCoach{

    private String coachName = "";

    public void setCoachName(String name){
        this.coachName = name + " ";
    }

    public void setFortuneService(IFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        super(null);
    }

    @Override
    public String getDailyWorkout() {
        return this.coachName + "Practice fast bowling for 15 minutes";
    }
}
