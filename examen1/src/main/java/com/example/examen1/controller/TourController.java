package com.example.examen1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.examen1.entity.Tour;
import com.example.examen1.service.TourService;



@RestController
@RequestMapping("/tour")
public class TourController {
	
	@Autowired 
	TourService TourService;
	
	
	@GetMapping
	public List< Tour> ver() {
		return TourService.ver();
	}
	
	@PostMapping
	public Tour registrar(@RequestBody Tour tour ) {
		return TourService.registrar(tour);
	}
	
	@PutMapping
	public  Tour actualizar(@RequestBody Tour  tour) {
		return TourService.actualizar(tour);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Tour  tour ) {
		TourService.eliminar(tour);
	}
}