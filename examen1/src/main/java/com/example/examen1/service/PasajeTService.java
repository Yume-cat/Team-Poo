package com.example.examen1.service;

import java.util.List;

import com.example.examen1.entity.PasajeT;



public interface PasajeTService {
	
    public PasajeT registrar(PasajeT pasajeT);
	
	public PasajeT actualizar(PasajeT pasajeT);
	
	public void eliminar(PasajeT pasajeT);
	
	public List < PasajeT > ver();
}