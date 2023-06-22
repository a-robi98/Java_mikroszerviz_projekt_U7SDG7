package com.example.carteservice.service;

import com.example.carteservice.model.Carte;
import com.example.carteservice.repository.CarteRepository;
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
        return this.carteRepository.findById(id).get();
    }

    @Override
    public Carte getCarteByCarteName(String name) {
        return this.carteRepository.findByCarteName(name);
    }
}
