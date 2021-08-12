package com.luv2code.springannotationdemo.coaches;

import com.luv2code.springannotationdemo.coaches.ICoach;
import com.luv2code.springannotationdemo.fortunes.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("prototype")
@Component
public class BaseballCoach extends BaseCoach {

    @PostConstruct
    public void initialize(){
        System.out.println(">>> Baseball coach initialize");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(">>> Baseball coach destroy");
    }

    @Autowired
    public BaseballCoach(@Qualifier("happyFortuneService") IFortuneService service){
        System.out.println(">> Baseball Coach constructor called");
        this.fortuneService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice throw ball 500 times";
    }
}
