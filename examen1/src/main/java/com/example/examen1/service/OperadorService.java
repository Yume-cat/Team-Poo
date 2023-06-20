package com.example.examen1.service;

import java.util.List;

import com.example.examen1.entity.OperadorTuristico;



public interface OperadorService {
	
    public OperadorTuristico registrar(OperadorTuristico operadorTuristico);
	
	public OperadorTuristico actualizar(OperadorTuristico operadorTuristico);
	
	public void eliminar(OperadorTuristico operadorTuristico);
	
	public List < OperadorTuristico > ver();
}