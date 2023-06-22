package com.example.carteservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class CarteItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarteItem;
    private Long carteId;
    private String name;
    private String type;
    private int price;

    @Builder
    public CarteItem(Long carteId, String name, String type, int price)
    {
        this.carteId = carteId;
        this.name = name;
        this.type = type;
        this.price = price;
    }
}
