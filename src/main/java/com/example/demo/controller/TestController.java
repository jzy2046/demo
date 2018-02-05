package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestController {
    @RequestMapping("getuser")
    public User getUser(){
        User user=new User();
        user.setUserName("test");
        return user;
    }
}
