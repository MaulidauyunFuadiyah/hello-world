package com.uyun.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String home() {
        System.out.println(">>> HelloWorldController called <<<");
        return "Hello World";
    }

}
