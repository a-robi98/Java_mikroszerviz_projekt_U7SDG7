package com.example.crunchservice.service;

import com.example.crunchservice.model.Crunch;

import java.util.List;

public interface CrunchService {
    void addCrunch(Crunch crunch);
    List<Crunch> getCrunchList();
    Crunch getCrunchById(Long id);
    Crunch getCrunchByCrunchName(String name);
}