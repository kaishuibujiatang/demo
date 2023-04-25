package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    接口：http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello(){
        return "hello, world";
    }
}
