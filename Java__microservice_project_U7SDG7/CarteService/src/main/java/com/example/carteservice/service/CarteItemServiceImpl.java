package com.example.carteservice.service;

import com.example.carteservice.model.CarteItem;
import com.example.carteservice.repository.CarteItemRepository;
import com.example.carteservice.repository.CarteRepository;
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
        this.carteItemRepository.save(carteItem);
    }

    @Override
    public List<CarteItem> getCarteItemList() {
        return this.carteItemRepository.findAll();
    }

    @Override
    public CarteItem getCarteItemById(Long id) {
        CarteItem carteItem = new CarteItem();
        carteItem.setIdCarteItem(id);
        return this.carteItemRepository.findById(id).get();
    }

    @Override
    public CarteItem getCarteItemByName(String name) {
        return this.carteItemRepository.findByName(name);
    }
}
