package com.example.java__microservice_project_u7sdg7.controller;

import com.example.java__microservice_project_u7sdg7.model.CarteItem;
import com.example.java__microservice_project_u7sdg7.service.CarteItemServiceImpl;
import com.example.java__microservice_project_u7sdg7.service.CarteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarteItemController {

    private final CarteItemServiceImpl carteItemServiceImpl;

    public CarteItemController(CarteItemServiceImpl carteItemServiceImpl) {
        this.carteItemServiceImpl = carteItemServiceImpl;
    }

    @GetMapping("/carteitem/list")
    public ResponseEntity<List<CarteItem>> getCarteList() {
        return new ResponseEntity<>(this.carteItemServiceImpl.getCarteItemList(), HttpStatus.OK);
    }

    @GetMapping("/carteitem/id")
    public ResponseEntity<CarteItem> getCarteById(@RequestParam Long id) {
        return new ResponseEntity<>(this.carteItemServiceImpl.getCarteItemById(id), HttpStatus.OK);
    }

    @GetMapping("/carteitem/name")
    public ResponseEntity<CarteItem> getCarteByName(@RequestParam String name) {
        return new ResponseEntity<>(this.carteItemServiceImpl.getCarteItemByName(name), HttpStatus.OK);
    }

    @PostMapping("/carte/addcarteitem")
    public ResponseEntity<CarteItem> addCarte(@RequestParam CarteItem carteItem) {
        this.carteItemServiceImpl.addCarteItem(carteItem);
        return new ResponseEntity<>(carteItem,HttpStatus.CREATED);
    }
}
