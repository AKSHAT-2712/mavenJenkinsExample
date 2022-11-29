package com.example.javaWebinar.service;

import com.example.javaWebinar.dto.UserDto;
import com.example.javaWebinar.model.User;
import com.example.javaWebinar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(UserDto userDto){


        int count=0;
        User user = new User(count++,userDto.getName(),userDto.getEmail(),userDto.getContactNo());
        return userRepository.save(user);
    }
}
