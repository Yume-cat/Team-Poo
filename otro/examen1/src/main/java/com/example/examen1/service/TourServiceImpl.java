package com.example.examen1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.examen1.entity.Tour;
import com.example.examen1.repository.TourRepository;
@Service
public class TourServiceImpl implements TourService {

	@Autowired
	TourRepository TourRepository;
	
	
	@Override
	public Tour registrar(Tour tour) {
		return TourRepository.save(tour);
	}

	@Override
	public Tour actualizar(Tour tour) {
		return TourRepository.save(tour);
	}

	@Override
	public void eliminar(Tour tour) {
		TourRepository.delete(tour);
		
	}

	@Override
	public List<Tour> ver() {
		return TourRepository.findAll();
	}

}
