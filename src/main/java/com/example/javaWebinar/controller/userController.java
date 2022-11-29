package com.example.javaWebinar.controller;

import com.example.javaWebinar.dto.UserDto;
import com.example.javaWebinar.model.User;
import com.example.javaWebinar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);



    }
}
