package com.Akansh.Sampark.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Data
@Entity(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer UID;

    @Column(unique = true)
    private String username;
    private String full_name;

    @Email
    private String email;

    private String address;
    private String location;

    @Timestamp
    private String registrationDate;


}
