package com.example.Constructor_Injection.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

    public BaseBallCoach() {
        System.out.println("This is "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice batting for 30 min";
    }
}
