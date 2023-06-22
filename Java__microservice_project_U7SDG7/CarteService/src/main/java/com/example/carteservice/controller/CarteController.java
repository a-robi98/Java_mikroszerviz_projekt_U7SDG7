package com.example.carteservice.controller;

import com.example.carteservice.model.Carte;
import com.example.carteservice.service.CarteService;
import com.example.carteservice.service.CarteServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarteController {

    private final CarteServiceImpl carteServiceImpl;

    public CarteController(CarteServiceImpl carteServiceImpl) {
        this.carteServiceImpl = carteServiceImpl;
    }

    @GetMapping("/carte/list")
    public ResponseEntity<List<Carte>> getCarteList() {
        return new ResponseEntity<>(this.carteServiceImpl.getCarteList(), HttpStatus.OK);
    }

    @GetMapping("/carte/id")
    public ResponseEntity<Carte> getCarteById(@RequestParam Long id) {
        return new ResponseEntity<>(this.carteServiceImpl.getCarteById(id), HttpStatus.OK);
    }

    @GetMapping("/carte/name")
    public ResponseEntity<Carte> getCarteByName(@RequestParam String name) {
        return new ResponseEntity<>(this.carteServiceImpl.getCarteByCarteName(name), HttpStatus.OK);
    }

    @PostMapping("/carte/addcarte")
    public ResponseEntity<Carte> addCarte(@RequestBody Carte carte) {
        this.carteServiceImpl.addCarte(carte);
        return new ResponseEntity<>(carte,HttpStatus.CREATED);
    }
}
