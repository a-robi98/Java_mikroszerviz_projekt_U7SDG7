package com.example.crunchservice.controller;

import com.example.crunchservice.model.User;
import com.example.crunchservice.service.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/user/list")
    public ResponseEntity<List<User>> getUserList() {
        return new ResponseEntity<>(this.userServiceImpl.getUserList(), HttpStatus.OK);
    }

    @GetMapping("/user/id")
    public ResponseEntity<User> getUserById(@RequestParam Long id) {
        return new ResponseEntity<>(this.userServiceImpl.getUserById(id), HttpStatus.OK);
    }

    @GetMapping("/user/name")
    public ResponseEntity<User> getUserByName(@RequestParam String name) {
        return new ResponseEntity<>(this.userServiceImpl.getUserByName(name), HttpStatus.OK);
    }

    @PostMapping("/user/addcarteitem")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        this.userServiceImpl.addUser(user);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }
}
