package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class controller {

    @GetMapping("/message")
    public String getMessage(){
        System.out.println("This is for test purpose");
        return "Message ";
    }

}
