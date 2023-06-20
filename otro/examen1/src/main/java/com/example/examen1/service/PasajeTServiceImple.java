package com.example.examen1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.examen1.repository.PasajeTRepository;
import com.example.examen1.entity.PasajeT;

@Service
public class PasajeTServiceImple implements PasajeTService {
	
	@Autowired
	PasajeTRepository PasajeTRepository;

	@Override
	public PasajeT registrar(PasajeT pasajeT) {
		return PasajeTRepository.save(pasajeT);
	}

	@Override
	public PasajeT actualizar(PasajeT pasajeT) {
		return PasajeTRepository.save(pasajeT);
	}

	@Override
	public void eliminar(PasajeT pasajeT) {
		PasajeTRepository.delete(pasajeT);
		
	}

	@Override
	public List<PasajeT> ver() {
		return PasajeTRepository.findAll();
	}

}
