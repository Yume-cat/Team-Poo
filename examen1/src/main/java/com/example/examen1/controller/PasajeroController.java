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
import com.example.examen1.entity.Pasajero;
import com.example.examen1.service.PasajeroService;



@RestController
@RequestMapping("/pasajero")
public class PasajeroController {
	
	@Autowired 
	PasajeroService PasajeroService;
	
	
	@GetMapping
	public List< Pasajero> ver() {
		return PasajeroService.ver();
	}
	
	@PostMapping
	public Pasajero registrar(@RequestBody Pasajero pasajero ) {
		return PasajeroService.registrar(pasajero);
	}
	
	@PutMapping
	public  Pasajero actualizar(@RequestBody Pasajero  pasajero) {
		return PasajeroService.actualizar(pasajero);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Pasajero  pasajero ) {
		PasajeroService.eliminar(pasajero);
	}
}