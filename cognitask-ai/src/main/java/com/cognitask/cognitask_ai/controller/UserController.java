package com.cognitask.cognitask_ai.controller;

import com.cognitask.cognitask_ai.dto.LoginRequestDTO;
import com.cognitask.cognitask_ai.dto.LoginResponseDTO;
import com.cognitask.cognitask_ai.dto.UserResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cognitask.cognitask_ai.entity.User;
import com.cognitask.cognitask_ai.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/all")
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> loginUser(@Valid @RequestBody LoginRequestDTO loginRequest) {
        String token = userService.loginUser(loginRequest);
        return ResponseEntity.ok(new LoginResponseDTO(token));
    }


}