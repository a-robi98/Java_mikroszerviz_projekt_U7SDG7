package com.example.carteservice.service;

import com.example.carteservice.model.Carte;
import com.example.carteservice.model.CarteItem;

import java.util.List;

public interface CarteService {
    void addCarte(Carte carte);
    List<Carte> getCarteList();
    Carte getCarteById(Long id);
    Carte getCarteByCarteName(String name);
}