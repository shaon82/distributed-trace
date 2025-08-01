package com.shaon.user_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        logger.info("Fetching user with ID {}", id);
        return "User-" + id;
    }

    @PostMapping("/create")
    public String createUser(@RequestParam String name) {
        if (name == null || name.isEmpty()) {
            logger.error("User creation failed: Name cannot be null or empty");
            return "Error: Name cannot be null or empty.";
        }
        logger.info("Creating user with name {}", name);
        return "User " + name + " created.";
    }
}
