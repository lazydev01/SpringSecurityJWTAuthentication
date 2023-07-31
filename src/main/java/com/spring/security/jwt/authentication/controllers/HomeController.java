package com.spring.security.jwt.authentication.controllers;

import com.spring.security.jwt.authentication.models.User;
import com.spring.security.jwt.authentication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("Getting Users");
        return this.userService.getUsers();
    }
}
