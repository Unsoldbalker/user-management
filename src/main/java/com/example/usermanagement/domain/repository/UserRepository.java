package com.example.usermanagement.domain.repository;

import com.example.usermanagement.domain.model.User;
import java.util.List;

public interface UserRepository {

    User save(User user);

    List<User> findAll();
}
