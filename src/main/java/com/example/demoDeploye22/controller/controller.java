package com.example.demoDeploye22.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    @GetMapping("hello")
    public  String helloworld(){
        return "hello world";
    }
}





