package com.example.examen1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.examen1.entity.Pasajero;

@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, String> {
}