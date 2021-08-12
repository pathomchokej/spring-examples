package com.luv2code.springannotationdemo.fortunes;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements IFortuneService
{
    @Override
    public String getDailyFortune() {
        return "REST fortune service";
    }
}
