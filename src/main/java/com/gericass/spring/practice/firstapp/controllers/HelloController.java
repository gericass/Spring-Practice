package com.gericass.spring.practice.firstapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/")
    private String hello() {
        return "Hello world!!";
    }
}
