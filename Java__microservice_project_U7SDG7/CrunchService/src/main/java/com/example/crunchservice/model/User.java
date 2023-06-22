package com.example.crunchservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String userRole;
    private LocalDateTime registrationDate;

    @Builder
    public User(String username, String userRole, LocalDateTime registrationDate) {
        this.username = username;
        this.userRole = userRole;
        this.registrationDate = registrationDate;
    }


}
