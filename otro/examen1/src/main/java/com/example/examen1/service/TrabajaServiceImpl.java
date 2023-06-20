package com.example.examen1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.examen1.repository.TrabajaRepository;
import com.example.examen1.entity.Trabaja;
@Service
public class TrabajaServiceImpl implements TrabajaService {
@Autowired
TrabajaRepository TrabajaRepository;
	
	
	
	@Override
	public Trabaja registrar(Trabaja trabaja) {
		return TrabajaRepository.save(trabaja);
	}

	@Override
	public Trabaja actualizar(Trabaja trabaja) {
		return TrabajaRepository.save(trabaja);
	}

	@Override
	public void eliminar(Trabaja trabaja) {
		TrabajaRepository.delete(trabaja);
		
	}

	@Override
	public List<Trabaja> ver() {
		return TrabajaRepository.findAll();
	}

}
