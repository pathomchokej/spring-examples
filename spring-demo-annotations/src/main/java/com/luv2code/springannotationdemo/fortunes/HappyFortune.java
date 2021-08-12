package com.luv2code.springannotationdemo.fortunes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class HappyFortune implements IFortuneService{

    public HappyFortune(){
        System.out.println("HappyFortune constructor called");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("HappyFortune initialize called");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("HappyFortune destroy called");
    }

    @Override
    public String getDailyFortune() {
        return "Today is Lucky day";
    }
}
