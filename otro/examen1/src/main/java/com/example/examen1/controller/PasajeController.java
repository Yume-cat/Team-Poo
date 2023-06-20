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
import com.example.examen1.entity.Pasaje;
import com.example.examen1.service.PasajeService;



@RestController
@RequestMapping("/pasaje")
public class PasajeController {
	
	@Autowired 
	PasajeService PasajeService;
	
	
	@GetMapping
	public List< Pasaje> ver() {
		return PasajeService.ver();
	}
	
	@PostMapping
	public Pasaje registrar(@RequestBody Pasaje pasaje ) {
		return PasajeService.registrar(pasaje);
	}
	
	@PutMapping
	public  Pasaje actualizar(@RequestBody Pasaje  pasaje) {
		return PasajeService.actualizar(pasaje);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Pasaje  pasaje ) {
		PasajeService.eliminar(pasaje);
	}
}