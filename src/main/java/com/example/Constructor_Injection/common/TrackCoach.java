package com.example.Constructor_Injection.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    public TrackCoach() {
        System.out.println("This is "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Running for 30 min";
    }
}
