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
import com.example.examen1.entity.PasajeT;
import com.example.examen1.service.PasajeTService;



@RestController
@RequestMapping("/pasajeT")
public class PasajeTController {
	
	@Autowired 
	PasajeTService PasajeTService;
	
	
	@GetMapping
	public List< PasajeT> ver() {
		return PasajeTService.ver();
	}
	
	@PostMapping
	public PasajeT registrar(@RequestBody PasajeT pasajeT ) {
		return PasajeTService.registrar(pasajeT);
	}
	
	@PutMapping
	public  PasajeT actualizar(@RequestBody PasajeT  pasajeT) {
		return PasajeTService.actualizar(pasajeT);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody PasajeT  pasajeT ) {
		PasajeTService.eliminar(pasajeT);
	}
}