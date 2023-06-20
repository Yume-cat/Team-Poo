package com.example.examen1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.examen1.entity.Pasajero;
import com.example.examen1.repository.PasajeroRepository;

import org.springframework.stereotype.Service;
@Service
public class PasajeroServiceImpl implements PasajeroService {
	
	
	@Autowired
	
	PasajeroRepository PasajeroRepository;

	@Override
	public Pasajero registrar(Pasajero pasajero) {
		return PasajeroRepository.save(pasajero);
	}

	@Override
	public Pasajero actualizar(Pasajero pasajero) {
		return PasajeroRepository.save(pasajero);
	}

	@Override
	public void eliminar(Pasajero pasajero) {
		PasajeroRepository.delete(pasajero);
		
	}

	@Override
	public List<Pasajero> ver() {
		return PasajeroRepository.findAll();
	}

	

	

}
