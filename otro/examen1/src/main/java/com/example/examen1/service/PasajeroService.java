package com.example.examen1.service;

import java.util.List;

import com.example.examen1.entity.Pasajero;



public interface PasajeroService {
	
    public Pasajero registrar(Pasajero pasajero);
	
	public Pasajero actualizar(Pasajero pasajero);
	
	public void eliminar(Pasajero pasajero);
	
	public List < Pasajero > ver();
}