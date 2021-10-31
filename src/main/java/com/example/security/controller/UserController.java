package com.example.security.controller;

import com.example.security.model.User;
import com.example.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("getall")
    public List<User> GetAll()
    {
       return userService.getAllUsers();
    }

    @GetMapping("findone/{username}")
    public User findOne(@PathVariable("username") String username)
    {
       return userService.findSingleUser(username);
    }

    @PostMapping("add")
    public User addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }
}
