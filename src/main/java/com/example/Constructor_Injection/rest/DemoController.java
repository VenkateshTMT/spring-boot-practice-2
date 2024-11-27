package com.example.Constructor_Injection.rest;

import com.example.Constructor_Injection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach myCoach1;


    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach)
                          /*@Qualifier("cricketCoach") Coach anotherCoach)*/{
        System.out.println("This is "+getClass().getSimpleName());
        myCoach=theCoach;

    }


    /*
    @Autowired
    public void setMyCoach(Coach theCoach){
        myCoach=theCoach;
    }*/



    @GetMapping("/getPlan")
    public String workout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check-scope")
    public String check(){
        return "scope = "+ (myCoach==myCoach1);
    }

}
