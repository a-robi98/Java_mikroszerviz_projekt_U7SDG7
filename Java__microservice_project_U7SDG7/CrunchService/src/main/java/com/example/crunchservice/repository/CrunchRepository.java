package com.example.crunchservice.repository;

import com.example.crunchservice.model.Crunch;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface CrunchRepository extends JpaRepository<Crunch, Long> {
    Crunch findByCrunchName(String name);
}
