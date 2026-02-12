package com.example.usermanagement.api.controller;

import com.example.usermanagement.api.dto.UserRequestDTO;
import com.example.usermanagement.api.dto.UserResponseDTO;
import com.example.usermanagement.application.usecase.CreateUserUseCase;
import com.example.usermanagement.application.usecase.GetAllUsersUseCase;
import com.example.usermanagement.domain.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final GetAllUsersUseCase getAllUsersUseCase;

    public UserController(CreateUserUseCase createUserUseCase,
                          GetAllUsersUseCase getAllUsersUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.getAllUsersUseCase = getAllUsersUseCase;
    }

    @PostMapping
    public UserResponseDTO create(@RequestBody UserRequestDTO dto) {

        User user = new User(dto.id, dto.name, dto.email);

        User saved = createUserUseCase.execute(user);

        return new UserResponseDTO(saved.getId(), saved.getName(), saved.getEmail());
    }

    @GetMapping
    public List<UserResponseDTO> getAll() {

        return getAllUsersUseCase.execute()
                .stream()
                .map(u -> new UserResponseDTO(u.getId(), u.getName(), u.getEmail()))
                .toList();
    }
}

