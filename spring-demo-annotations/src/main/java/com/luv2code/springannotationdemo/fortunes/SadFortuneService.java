package com.luv2code.springannotationdemo.fortunes;

public class SadFortuneService implements IFortuneService{
    @Override
    public String getDailyFortune() {
        return "Today is a sad day TT-TT";
    }
}
