package com.project.school.user.service;

import com.project.school.user.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(String id);
    User addUser(User user);
    void deleteUser(String id);
}
