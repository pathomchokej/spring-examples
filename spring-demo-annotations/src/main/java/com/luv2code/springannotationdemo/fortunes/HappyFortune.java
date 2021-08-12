package com.luv2code.springannotationdemo.fortunes;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements IFortuneService{
    @Override
    public String getDailyFortune() {
        return "Today is Lucky day";
    }
}
