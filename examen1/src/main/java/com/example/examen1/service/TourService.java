package com.example.examen1.service;

import java.util.List;

import com.example.examen1.entity.Tour;



public interface TourService {
	
    public Tour registrar(Tour tour);
	
	public Tour actualizar(Tour tour);
	
	public void eliminar(Tour tour);
	
	public List < Tour > ver();
}