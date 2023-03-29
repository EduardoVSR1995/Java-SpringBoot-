package com.api.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hellocontroler {

    @GetMapping("")
    public String hello(){
      
        return "Olá Spring";  
    }
}
