package com.example.java__microservice_project_u7sdg7.service;

import com.example.java__microservice_project_u7sdg7.model.CarteItem;

import java.util.List;

public interface CarteItemService {
    void addCarteItem(CarteItem carteItem);
    List<CarteItem> getCarteItemList();
    CarteItem getCarteItemById(Long id);
    CarteItem getCarteItemByName(String name);
}
