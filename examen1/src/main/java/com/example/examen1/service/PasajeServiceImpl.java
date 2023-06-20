package com.example.examen1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.examen1.entity.Pasaje;
import com.example.examen1.repository.PasajeRepository;

import org.springframework.stereotype.Service;
@Service
public class PasajeServiceImpl implements PasajeService {
	
	
	@Autowired
	
	PasajeRepository PasajeRepository;

	@Override
	public Pasaje registrar(Pasaje pasaje) {
		return PasajeRepository.save(pasaje);
	}

	@Override
	public Pasaje actualizar(Pasaje pasaje) {
		return PasajeRepository.save(pasaje);
	}

	@Override
	public void eliminar(Pasaje pasaje) {
		PasajeRepository.delete(pasaje);
		
	}

	@Override
	public List<Pasaje> ver() {
		return PasajeRepository.findAll();
	}

}
