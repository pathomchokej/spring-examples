package com.luv2code.springannotationdemo.coaches;

import com.luv2code.springannotationdemo.fortunes.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseCoach implements ICoach, IFortuneService{

    @Autowired
    protected IFortuneService fortuneService;

    /*
    //@Autowired
    public void setFortuneService(IFortuneService service){
        System.out.println(">>Inside setter function");
        this.fortuneService = service;
    }

    @Autowired
    public void MethodFortuneService(IFortuneService service){
        System.out.println(">>Inside any method");
        this.fortuneService = service;
    }

     */

    /*
    protected BaseCoach(IFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
     */

    @Override
    public String getDailyFortune(){
        return (null != this.fortuneService)? fortuneService.getDailyFortune() : "No fortune service";
    }
}
