package com.luv2code.springdemo;

public class UnLuckyFortuneService implements IFortuneService{
    @Override
    public String getFortune() {
        return "Today is base day";
    }
}
