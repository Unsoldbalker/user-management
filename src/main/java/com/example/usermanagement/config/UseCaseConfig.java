package com.example.usermanagement.config;

import com.example.usermanagement.application.usecase.CreateUserUseCase;
import com.example.usermanagement.application.usecase.GetAllUsersUseCase;
import com.example.usermanagement.domain.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserRepository repository) {
        return new CreateUserUseCase(repository);
    }

    @Bean
    public GetAllUsersUseCase getAllUsersUseCase(UserRepository repository) {
        return new GetAllUsersUseCase(repository);
    }
}
