package com.example.java__microservice_project_u7sdg7.service;

import com.example.java__microservice_project_u7sdg7.model.Carte;

import java.util.List;

public interface CarteService {
    void addCarte(Carte carteItem);
    List<Carte> getCarteList();
    Carte getCarteById(Long id);
    Carte getCarteByName(String name);
}
