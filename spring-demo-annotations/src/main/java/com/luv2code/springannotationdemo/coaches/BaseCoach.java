package com.luv2code.springannotationdemo.coaches;

import com.luv2code.springannotationdemo.fortunes.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public abstract class BaseCoach implements ICoach, IFortuneService{

    protected IFortuneService fortuneService;

    @Value("${foo.team}")
    protected String team;
    @Value("${foo.email}")
    protected String email;

    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(IFortuneService service) {
        System.out.println(">>Inside setter function");
        if (null == this.fortuneService)
            this.fortuneService = service;
    }

    /*
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

    public String getInfo(){
        return "Team:" + this.team + ", Email:" + this.email;
    }
    @Override
    public String getDailyFortune(){
        return (null != this.fortuneService)? fortuneService.getDailyFortune() : "No fortune service";
    }
}
