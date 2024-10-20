package com.example.demo;

import models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService us;

    @Autowired
    public UserController(UserService service) {
        this.us = service;
    }

    @GetMapping("/all")
    public List<UserEntity> getAllUsers(Model model) {
        return us.getAll();
    }
}
