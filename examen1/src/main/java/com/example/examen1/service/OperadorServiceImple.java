package com.example.examen1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.examen1.entity.OperadorTuristico;
import com.example.examen1.repository.OperadorRepository;
import org.springframework.stereotype.Service;

@Service
public class OperadorServiceImple implements OperadorService {
	
	
	@Autowired
	OperadorRepository OperadorRepository;

	@Override
	public OperadorTuristico registrar(OperadorTuristico operadorTuristico) {
		return OperadorRepository.save(operadorTuristico);
	}

	@Override
	public OperadorTuristico actualizar(OperadorTuristico operadorTuristico) {
		return OperadorRepository.save(operadorTuristico);
	}

	@Override
	public void eliminar(OperadorTuristico operadorTuristico) {
		OperadorRepository.delete(operadorTuristico);
		
	}

	@Override
	public List<OperadorTuristico> ver() {
		return OperadorRepository.findAll();
	}

}
