package com.luv2code.springdemo;

public abstract class BaseCoach implements ICoach {

    protected IFortuneService fortuneService = null;

    protected BaseCoach(IFortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return (null != this.fortuneService)? this.fortuneService.getFortune() : "No fortune service";
    }
}
