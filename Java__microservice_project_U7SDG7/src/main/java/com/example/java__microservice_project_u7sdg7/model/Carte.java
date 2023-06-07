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
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarte;
    private String carteName;
    private String type;
    private String description;

    @Builder
    public Carte(String carteName, String type, String description) {
        this.carteName = carteName;
        this.type = type;
        this.description = description;
    }


}
