package com.example.security.service;

import com.example.security.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService()
    {
        list.add(new User("rahat", "rahat@gmail.com", "123456"));
        list.add(new User("rahat1", "rahat1@gmail.com", "1234567"));
    }

    //getting all user
    public List<User> getAllUsers(){
        return this.list;
    }

    //getting a single user
    public User findSingleUser(String username)
    {
        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user)
    {
        this.list.add(user);
        return user;
    }
}
