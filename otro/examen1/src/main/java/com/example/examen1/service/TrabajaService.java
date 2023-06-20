package com.example.examen1.service;

import java.util.List;

import com.example.examen1.entity.Trabaja;



public interface TrabajaService {
	
    public Trabaja registrar(Trabaja trabaja);
	
	public Trabaja actualizar(Trabaja trabaja);
	
	public void eliminar(Trabaja trabaja);
	
	public List < Trabaja > ver();
}