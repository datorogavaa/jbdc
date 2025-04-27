package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/")
    public String greet(String[] args) {
        return "HELLO JAVA'S WORLD";
    }
}
