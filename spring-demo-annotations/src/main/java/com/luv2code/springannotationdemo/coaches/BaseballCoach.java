package com.luv2code.springannotationdemo.coaches;

import com.luv2code.springannotationdemo.coaches.ICoach;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class BaseballCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Practice throw ball 500 times";
    }
}
