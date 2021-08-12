package com.luv2code.springannotationdemo.coaches;

import com.luv2code.springannotationdemo.fortunes.IFortuneService;

public abstract class BaseCoach implements ICoach, IFortuneService{

    protected IFortuneService fortuneService;

    protected BaseCoach(IFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune(){
        return (null != this.fortuneService)? fortuneService.getDailyFortune() : "No fortune service";
    }
}
