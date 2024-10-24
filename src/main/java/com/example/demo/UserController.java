package com.example.demo;

//import models.User;
import models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
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

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> findById(@PathVariable Long id) {
        Optional<UserEntity> user = us.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserEntity save(@RequestBody UserEntity user) {
        return us.createUser(user);
    }

    @PutMapping("/{id}")
    public UserEntity update(@RequestBody UserEntity user, @PathVariable Long id) {
        return us.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        us.deleteUser(id);
    }
}
