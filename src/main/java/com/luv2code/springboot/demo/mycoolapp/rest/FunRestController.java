package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FunRestController {

    // inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // Expose new endpoint for teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach Name " + coachName + " Team Name " + teamName;
    }
    

    // Expose '/' that return hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World 3";
    }

    // Expose a new end point for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new end point for fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
    

}
