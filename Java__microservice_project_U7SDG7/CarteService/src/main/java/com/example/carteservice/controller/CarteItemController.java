package com.example.carteservice.controller;

import com.example.carteservice.model.CarteItem;
import com.example.carteservice.service.CarteItemServiceImpl;
import com.example.carteservice.service.CarteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<CarteItem> addCarte(@RequestBody CarteItem carteItem) {
        this.carteItemServiceImpl.addCarteItem(carteItem);
        return new ResponseEntity<>(carteItem,HttpStatus.CREATED);
    }
}
