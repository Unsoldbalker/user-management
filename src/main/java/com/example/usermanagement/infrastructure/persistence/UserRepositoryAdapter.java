package com.example.usermanagement.infrastructure.persistence;

import com.example.usermanagement.domain.model.User;
import com.example.usermanagement.domain.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepositoryAdapter implements UserRepository {

    private final JpaUserRepository jpa;

    public UserRepositoryAdapter(JpaUserRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public User save(User user) {
        return jpa.save(user);
    }

    @Override
    public List<User> findAll() {
        return jpa.findAll();
    }
}
