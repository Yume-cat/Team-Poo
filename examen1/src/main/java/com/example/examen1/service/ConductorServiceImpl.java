package com.example.examen1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen1.entity.Conductor;
import com.example.examen1.repository.ConductorRepository;



@Service
public class ConductorServiceImpl implements ConductorService {

	@Autowired
	ConductorRepository conductorRepository;
	
	
	@Override
	public Conductor registrar(Conductor conductor) {
		
		return conductorRepository.save(conductor);
	}

	@Override
	public Conductor actualizar(Conductor conductor) {
		return conductorRepository.save(conductor);
	}

	@Override
	public void eliminar(Conductor conductor) {
		conductorRepository.delete(conductor);
		
	}

	@Override
	public List<Conductor> ver() {
		return conductorRepository.findAll();
	}

	
	

}
