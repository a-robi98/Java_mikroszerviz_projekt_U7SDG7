package com.example.java__microservice_project_u7sdg7.model;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int carteId;
    private String name;
    private String type;
    private int price;

    @Builder
    public CarteItem( String name, String type, int price)
    {
        this.carteId = carteId;
        this.name = name;
        this.type = type;
        this.price = price;
    }
}
