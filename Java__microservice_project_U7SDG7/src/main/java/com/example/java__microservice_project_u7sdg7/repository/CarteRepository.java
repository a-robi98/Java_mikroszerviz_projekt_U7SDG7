package com.example.java__microservice_project_u7sdg7.repository;

import com.example.java__microservice_project_u7sdg7.model.Carte;
import com.example.java__microservice_project_u7sdg7.model.CarteItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Long> {
    List<CarteItem> listAllCarte();
    CarteItem getCarteById(Long id);
    void insertCarte(CarteItem carteItem);
}
