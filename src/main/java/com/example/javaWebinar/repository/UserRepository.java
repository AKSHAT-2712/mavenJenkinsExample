package com.example.javaWebinar.repository;

import com.example.javaWebinar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


//@Query("")// can write any custom query

    public User findByEmailAndName(String email, String name);
}
