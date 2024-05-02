package com.example.labb2webservices.controller;

import com.example.labb2webservices.entity.User;
import com.example.labb2webservices.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/allusers")
    List<User> userList() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    Optional user(@PathVariable("id") Long id) {
        return userRepository.findById(id);
    }



}
