package com.example.crunchservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Crunch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCrunch;
    private Long userId;
    private String crunchName;
    private int quantity;
    private int price;

    private LocalDateTime pickUpStartDate;
    private LocalDateTime pickUpEndDate;

    @Builder
    public Crunch(Long userId, String crunchName, int quantity, int price, LocalDateTime pickUpStartDate, LocalDateTime pickUpEndDate) {
        this.userId = userId;
        this.crunchName = crunchName;
        this.quantity = quantity;
        this.price = price;
        this.pickUpStartDate = pickUpStartDate;
        this.pickUpEndDate = pickUpEndDate;
    }
}
