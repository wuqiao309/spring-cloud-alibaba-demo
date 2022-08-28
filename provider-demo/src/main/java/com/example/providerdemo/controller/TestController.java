package com.example.providerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wuqiao
 * Created on 2022-08-28
 */
@RestController
public class TestController {
    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
