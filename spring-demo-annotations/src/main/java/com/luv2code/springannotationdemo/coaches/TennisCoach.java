package com.luv2code.springannotationdemo.coaches;

import com.luv2code.springannotationdemo.coaches.ICoach;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // tennisCoach is default bean id
public class TennisCoach implements ICoach {

    @PostConstruct
    public void initialize(){

    }

    @PreDestroy
    public void destroy(){

    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
