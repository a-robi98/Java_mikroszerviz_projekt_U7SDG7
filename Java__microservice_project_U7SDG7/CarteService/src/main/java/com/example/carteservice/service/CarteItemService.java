package com.example.carteservice.service;

import com.example.carteservice.model.CarteItem;

import java.util.List;

public interface CarteItemService {
    void addCarteItem(CarteItem carteItem);
    List<CarteItem> getCarteItemList();
    CarteItem getCarteItemById(Long id);
    CarteItem getCarteItemByName(String name);
}
