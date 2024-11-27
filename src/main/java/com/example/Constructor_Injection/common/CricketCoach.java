package com.example.Constructor_Injection.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("This is "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "do fast bowling practice for 15 minutes.Now!!!";
    }
}
