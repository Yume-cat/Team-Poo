package com.example.examen1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.examen1.entity.Pasaje;

@Repository
public interface PasajeRepository extends JpaRepository<Pasaje, String> {
}