package com.luv2code.springannotationdemo.coaches;

import com.luv2code.springannotationdemo.fortunes.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach extends BaseCoach{

    /*
    @Autowired
    public FootballCoach(IFortuneService fortuneService) {
        super(fortuneService);
    }
     //*/

    @Override
    public String getDailyWorkout() {
        return "Practice kick 50 hits";
    }
}
