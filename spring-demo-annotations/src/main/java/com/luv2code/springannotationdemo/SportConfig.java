package com.luv2code.springannotationdemo;

import com.luv2code.springannotationdemo.coaches.BaseCoach;
import com.luv2code.springannotationdemo.coaches.SwimCoach;
import com.luv2code.springannotationdemo.fortunes.IFortuneService;
import com.luv2code.springannotationdemo.fortunes.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springannotationdemo")
@PropertySource("fortuneData.properties")
@PropertySource("sport.properties")
public class SportConfig {

    @Bean
    public IFortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public BaseCoach swimCoach(){
        SwimCoach coach = new SwimCoach();
        coach.setFortuneService(sadFortuneService());

        return coach;
    }
}
