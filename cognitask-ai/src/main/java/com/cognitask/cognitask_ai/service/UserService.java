package com.cognitask.cognitask_ai.service;

import java.util.stream.Collectors;
import com.cognitask.cognitask_ai.security.JwtUtil;
import com.cognitask.cognitask_ai.dto.LoginRequestDTO;
import com.cognitask.cognitask_ai.dto.UserResponseDTO;
import com.cognitask.cognitask_ai.exception.InvalidCredentialsException;
import com.cognitask.cognitask_ai.exception.UserNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cognitask.cognitask_ai.exception.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognitask.cognitask_ai.entity.User;
import com.cognitask.cognitask_ai.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;



    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public User createUser(User user) {

        // 🔐 Encode password
        String encodedPassword =
                passwordEncoder.encode(user.getPassword());

        user.setPassword(encodedPassword);

        // 🔥 Check if first user
        if (userRepository.count() == 0) {
            user.setRole("ROLE_ADMIN");
        } else {
            user.setRole("ROLE_USER");
        }

        return userRepository.save(user);
    }


    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserResponseDTO(
                        user.getId(),
                        user.getName(),
                        user.getEmail()))
                .collect(Collectors.toList());
    }

    public String loginUser(LoginRequestDTO loginRequest) {

        User user = userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(() -> new UserNotFoundException("User not found"));

        if (passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
           String token = jwtUtil.generateToken(user.getEmail(),user.getRole());
            return token;
        } else {
            throw new InvalidCredentialsException("Invalid Credentials");
        }
    }
}