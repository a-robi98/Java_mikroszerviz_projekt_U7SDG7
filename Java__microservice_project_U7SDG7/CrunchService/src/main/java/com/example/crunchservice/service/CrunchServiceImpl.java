package com.example.crunchservice.service;

import com.example.crunchservice.model.Crunch;
import com.example.crunchservice.repository.CrunchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrunchServiceImpl implements CrunchService {


    private final CrunchRepository crunchRepository;


    public CrunchServiceImpl(CrunchRepository crunchRepository) {
        this.crunchRepository = crunchRepository;
    }


    @Override
    public void addCrunch(Crunch crunch) {
        this.crunchRepository.save(crunch);
    }

    @Override
    public List<Crunch> getCrunchList() {
        return this.crunchRepository.findAll();
    }

    @Override
    public Crunch getCrunchById(Long id) {
        return this.crunchRepository.findById(id).get();
    }

    @Override
    public Crunch getCrunchByCrunchName(String name) {
        return this.crunchRepository.findByCrunchName(name);
    }
}
