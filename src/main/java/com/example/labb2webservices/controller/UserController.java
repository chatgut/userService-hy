package com.example.labb2webservices.controller;

import com.example.labb2webservices.entity.User;
import com.example.labb2webservices.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/createuser")
    ResponseEntity<Void> createUser(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/allusers")
    List<User> userList() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    Optional user(@PathVariable("id") Long id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
    }

    @PatchMapping("/changeuser/{id}")
    ResponseEntity<Void> updateUser(@RequestBody User updatedUser, @PathVariable Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            existingUser.setUserName(updatedUser.getUserName());
            userRepository.save(existingUser);

            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
