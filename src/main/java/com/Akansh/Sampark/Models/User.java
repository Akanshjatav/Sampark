package com.Akansh.Sampark.Models;


import com.Akansh.Sampark.Repository.UserDAO;
import jakarta.persistence.*;
import jakarta.validation.Constraint;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.List;


@Data
@Entity(name = "User")
@Table(name="usern")
    public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    private Long UserID;
    private String username;
    @Column(name="role")
    private UserType role;

    public User(String username, UserType role, String email, String address, String location, String registrationDate) {
        this.username = username;
        this.role = role;
        this.email = email;

    }

    @Column(nullable = false, unique = true)
    @Email
    private String email;
    @Column(nullable = false, length = 64)
    private String password;

    @Column
    @OneToMany(mappedBy = "user")
    private List<Notification> notification;

}

