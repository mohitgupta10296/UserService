package com.project.school.user.controller;

import com.project.school.user.dto.User;
import com.project.school.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@Tag(name = "Users API", description = "Endpoints for managing users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

    @GetMapping
    @Operation(summary = "Fetch all users")
    public List<User> all() {
        logger.info("Fetching all users");
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get user by ID")
    public ResponseEntity<User> byId(@PathVariable String id) {
        logger.info("Fetching user with ID: {}", id);
        return service.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new user")
    public User create(@RequestBody User user) {
        logger.info("Creating new user: {}", user);
        return service.addUser(user);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a user by ID")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        logger.info("Deleting user with ID: {}", id);
        service.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
