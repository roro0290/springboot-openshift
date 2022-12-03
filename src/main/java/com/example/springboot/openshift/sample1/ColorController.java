package com.example.springboot.openshift.sample1;

import com.example.springboot.openshift.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.random.RandomGenerator;


@RestController
@SpringBootApplication
public class ColorController {

    @GetMapping("/color")
    public String chooseColor(){
        String color = "";
        RandomGenerator rgen = RandomGenerator.getDefault();
        switch(rgen.nextInt(0,3)){
            case 0:
                color = "red";
                break;
            case 1:
                color = "blue";
                break;
            case 2:
                color = "green";
                break;
            default:
                color = "none";
        }
        return color;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColorController.class);
    }

}
