package fr.hstaedelin.neograph.web.controllers;

import fr.hstaedelin.neograph.model.User;
import fr.hstaedelin.neograph.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAll() {
        return userService.getAll();
    }
}
