package com.example.jx.jxspringbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Luis on 2018/6/26.
 */
@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String hello() {
        return "this is " + appName;
    }
}
