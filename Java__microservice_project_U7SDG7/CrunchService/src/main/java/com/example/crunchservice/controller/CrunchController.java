package com.example.crunchservice.controller;

import com.example.crunchservice.model.Crunch;
import com.example.crunchservice.service.CrunchServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrunchController {

    private final CrunchServiceImpl crunchServiceImpl;

    public CrunchController(CrunchServiceImpl crunchServiceImpl) {
        this.crunchServiceImpl = crunchServiceImpl;
    }

    @GetMapping("/crunch/list")
    public ResponseEntity<List<Crunch>> getCrunchList() {
        return new ResponseEntity<>(this.crunchServiceImpl.getCrunchList(), HttpStatus.OK);
    }

    @GetMapping("/crunch/id")
    public ResponseEntity<Crunch> getCrunchById(@RequestParam Long id) {
        return new ResponseEntity<>(this.crunchServiceImpl.getCrunchById(id), HttpStatus.OK);
    }

    @GetMapping("/crunch/name")
    public ResponseEntity<Crunch> getCrunchByName(@RequestParam String name) {
        return new ResponseEntity<>(this.crunchServiceImpl.getCrunchByCrunchName(name), HttpStatus.OK);
    }

    @PostMapping("/crunch/addcrunch")
    public ResponseEntity<Crunch> addCrunch(@RequestBody Crunch crunch) {
        this.crunchServiceImpl.addCrunch(crunch);
        return new ResponseEntity<>(crunch,HttpStatus.CREATED);
    }
}
