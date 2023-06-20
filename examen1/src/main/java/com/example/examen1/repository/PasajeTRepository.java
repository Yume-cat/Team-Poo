package com.example.examen1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.examen1.entity.PasajeT;

@Repository
public interface PasajeTRepository extends JpaRepository<PasajeT, String> {
}