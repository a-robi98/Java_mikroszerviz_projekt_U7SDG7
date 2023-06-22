package com.example.carteservice.repository;

import com.example.carteservice.model.Carte;
import com.example.carteservice.model.CarteItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface CarteItemRepository extends JpaRepository<CarteItem,Long> {

    CarteItem findByName(String name);

}
