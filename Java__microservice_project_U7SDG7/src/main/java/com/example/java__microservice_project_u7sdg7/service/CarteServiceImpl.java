package com.example.java__microservice_project_u7sdg7.service;

import com.example.java__microservice_project_u7sdg7.model.Carte;
import com.example.java__microservice_project_u7sdg7.repository.CarteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteServiceImpl implements CarteService {


    private final CarteRepository carteRepository;


    public CarteServiceImpl(CarteRepository carteRepository) {
        this.carteRepository = carteRepository;
    }


    @Override
    public void addCarte(Carte carte) {
        this.carteRepository.save(carte);
    }

    @Override
    public List<Carte> getCarteList() {
        return this.carteRepository.findAll();
    }

    @Override
    public Carte getCarteById(Long id) {
        return this.carteRepository.findById(id);
    }

    @Override
    public Carte getCarteByName(String name) {
        return null;
    }
}
