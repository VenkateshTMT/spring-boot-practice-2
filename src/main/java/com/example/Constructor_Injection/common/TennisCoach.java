package com.example.Constructor_Injection.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("This is "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice tennis for 1 hour.";
    }
}
