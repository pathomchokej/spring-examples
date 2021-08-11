package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class CricketCoach extends BaseCoach implements DisposableBean {

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

    private void doStart() {
        System.out.println("CricketCoach is initialize!!!");
    }

    private void doCleanUp() {
        System.out.println("CricketCoach is destroy!!!");
    }

    @Override
    public void destroy() throws Exception {
        doCleanUp();
    }
}
