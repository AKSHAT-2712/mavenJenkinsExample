package com.example.javaWebinar.model;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="webinarUsers")
public class User {
    @Id

    private int id;



    private String name;
    private String email;
    private long contactNo;

    public User(){}

    public User(int id,String name, String email, long contactNo) {
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
    }
}
