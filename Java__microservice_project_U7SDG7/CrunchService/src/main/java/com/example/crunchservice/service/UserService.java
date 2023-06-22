package com.example.crunchservice.service;

import com.example.crunchservice.model.User;

import java.util.List;

public interface UserService {
    void addUser(User carteItem);
    List<User> getUserList();
    User getUserById(Long id);
    User getUserByName(String name);
}
