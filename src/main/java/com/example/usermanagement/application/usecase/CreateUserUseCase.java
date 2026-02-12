package com.example.usermanagement.application.usecase;

import com.example.usermanagement.domain.model.User;
import com.example.usermanagement.domain.repository.UserRepository;

public class CreateUserUseCase {

    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(User user) {
        return userRepository.save(user);
    }
}
