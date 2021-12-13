package com.kry.restapimanager.controller;

import com.kry.restapimanager.model.User;
import com.kry.restapimanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "User added successfully";
    }

    @GetMapping("/get")
    public List<User> getUsers(List<Integer> userIdsList) {
        return userService.getUsers(userIdsList);
    }
}
