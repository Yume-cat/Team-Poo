package com.example.examen1.service;

import java.util.List;

import com.example.examen1.entity.Conductor;


public interface ConductorService {
	
	
    public Conductor registrar(Conductor conductor);
	
	public  Conductor  actualizar(Conductor  conductor);
	
	public void eliminar(Conductor  conductor);
	
	public List < Conductor > ver();
	
	

	
	

}
