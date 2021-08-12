package com.luv2code.springannotationdemo.fortunes;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements IFortuneService{
    @Override
    public String getDailyFortune() {
        return "Database fortune service";
    }
}
