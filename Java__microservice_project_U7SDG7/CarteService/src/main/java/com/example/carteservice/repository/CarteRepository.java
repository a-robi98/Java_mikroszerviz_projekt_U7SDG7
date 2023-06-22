package com.example.carteservice.repository;

import com.example.carteservice.model.Carte;
import com.example.carteservice.model.CarteItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface CarteRepository extends JpaRepository<Carte, Long> {
    Carte findByCarteName(String name);
}
