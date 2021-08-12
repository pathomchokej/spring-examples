package com.luv2code.springannotationdemo;

import org.springframework.stereotype.Component;

@Component // tennisCoach is default bean id
public class TennisCoach implements ICoach{

    public void initialize(){

    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
