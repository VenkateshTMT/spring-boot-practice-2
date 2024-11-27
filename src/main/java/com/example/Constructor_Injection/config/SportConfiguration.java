package com.example.Constructor_Injection.config;


import com.example.Constructor_Injection.common.Coach;
import com.example.Constructor_Injection.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfiguration {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
