package com.example.usermanagement.infrastructure.persistence;

import com.example.usermanagement.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {
}
