package com.luv2code.springannotationdemo.coaches;

public class SwimCoach extends BaseCoach{

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}