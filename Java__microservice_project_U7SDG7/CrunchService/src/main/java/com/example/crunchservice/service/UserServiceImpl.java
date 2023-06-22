package com.example.crunchservice.service;

import com.example.crunchservice.model.User;
import com.example.crunchservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void addUser(User carteItem) {
        this.userRepository.save(carteItem);
    }

    @Override
    public List<User> getUserList() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setUserId(id);
        return this.userRepository.findById(id).get();
    }

    @Override
    public User getUserByName(String name) {
        return this.userRepository.findByUsername(name);
    }
}
