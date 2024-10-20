package com.example.demo;

import models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.*;

//import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<UserEntity> getAll() {
        return repository.findAll();
    }


    @Override
    public UserEntity getUserById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return repository.save(user);
    }

    @Override
    public UserEntity updateUser(Long id, UserEntity user) {
        UserEntity us = getUserById(id);

        us.setSurname(user.getSurname());
        us.setName(user.getName());
        us.setPatronymic(user.getPatronymic());
        us.setTelephone(user.getTelephone());
        us.setDateofbirth(user.getDateofbirth());

        return repository.save(us);
    }

    @Override
    public void deleteUser(Long id) {
        getUserById(id);
// если да, то удаляем ее
        repository.deleteById(id);

    }
}
