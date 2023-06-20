package com.example.examen1.service;

import java.util.List;

import com.example.examen1.entity.Pasaje;



public interface PasajeService {
	
    public Pasaje registrar(Pasaje pasaje);
	
	public Pasaje actualizar(Pasaje pasaje);
	
	public void eliminar(Pasaje pasaje);
	
	public List < Pasaje > ver();
}