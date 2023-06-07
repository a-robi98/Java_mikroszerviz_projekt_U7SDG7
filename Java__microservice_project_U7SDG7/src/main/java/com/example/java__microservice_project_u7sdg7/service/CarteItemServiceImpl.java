package com.example.java__microservice_project_u7sdg7.service;

import com.example.java__microservice_project_u7sdg7.model.CarteItem;
import com.example.java__microservice_project_u7sdg7.repository.CarteItemRepository;
import com.example.java__microservice_project_u7sdg7.repository.CarteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteItemServiceImpl implements CarteItemService {

    private final CarteItemRepository carteItemRepository;


    public CarteItemServiceImpl(CarteItemRepository carteItemRepository) {
        this.carteItemRepository = carteItemRepository;
    }


    @Override
    public void addCarteItem(CarteItem carteItem) {

    }

    @Override
    public List<CarteItem> getCarteItemList() {
        return this.carteItemRepository.findAll();
    }

    @Override
    public CarteItem getCarteItemById(Long id) {
        CarteItem carteItem = new CarteItem();
        carteItem.setId(id);
        return this.carteItemRepository.findById(id).get();
    }

    @Override
    public CarteItem getCarteItemByName(String name) {
        return null;
    }
}
