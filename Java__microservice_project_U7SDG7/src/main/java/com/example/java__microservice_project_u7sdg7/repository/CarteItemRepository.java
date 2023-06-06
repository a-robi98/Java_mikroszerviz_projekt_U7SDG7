package com.example.java__microservice_project_u7sdg7.repository;

import com.example.java__microservice_project_u7sdg7.model.Carte;
import com.example.java__microservice_project_u7sdg7.model.CarteItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarteItemRepository extends JpaRepository<CarteItem,Long> {

    List<CarteItem> listAllCarteItems();
    CarteItem getCarteItemById(Long id);
    void insertCarteItem(CarteItem carteItem);

}