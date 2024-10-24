package com.example.demo;

import models.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<models.UserEntity> getAll();

    Optional<UserEntity> getUserById(Long id);

    UserEntity createUser(UserEntity user);

    UserEntity updateUser(Long id, UserEntity user);

    void deleteUser(Long id);
}
