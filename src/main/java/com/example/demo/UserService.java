package com.example.demo;

import models.UserEntity;

import java.util.List;

public interface UserService {
    List<models.UserEntity> getAll();

    UserEntity getUserById(Long id);

    UserEntity createUser(UserEntity user);

    UserEntity updateUser(Long id, UserEntity user);

    void deleteUser(Long id);
}
