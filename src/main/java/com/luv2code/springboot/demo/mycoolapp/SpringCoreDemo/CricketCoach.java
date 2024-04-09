package com.luv2code.springboot.demo.mycoolapp.SpringCoreDemo;

import org.springframework.stereotype.Component;

// component annotation marks the class as spring bean, and makes it available
// for dependancy injection
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
