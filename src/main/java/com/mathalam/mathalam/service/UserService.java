package com.mathalam.mathalam.service;

import com.mathalam.mathalam.model.User;
import com.mathalam.mathalam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Register new user
    public String registerUser(User user) {

        // Check if username already taken
        if(userRepository.existsByUsername(user.getUsername())) {
            return "Username already exists!";
        }

        // Check if email already taken
        if(userRepository.existsByEmail(user.getEmail())) {
            return "Email already exists!";
        }

        // Encrypt password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Save to database
        userRepository.save(user);

        return "User registered successfully!";
    }

    // Get user by username
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElse(null);
    }
}