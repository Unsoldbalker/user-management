package com.example.usermanagement.application.usecase;

import com.example.usermanagement.domain.model.User;
import com.example.usermanagement.domain.repository.UserRepository;

import java.util.List;

public class GetAllUsersUseCase {

    private final UserRepository userRepository;

    public GetAllUsersUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> execute() {
        return userRepository.findAll();
    }
}
