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
import com.example.examen1.entity.Trabaja;
import com.example.examen1.service.TrabajaService;



@RestController
@RequestMapping("/trabaja")
public class TrabajaController {
	
	@Autowired 
	TrabajaService TrabajaService;
	
	
	@GetMapping
	public List< Trabaja> ver() {
		return TrabajaService.ver();
	}
	
	@PostMapping
	public Trabaja registrar(@RequestBody Trabaja trabaja ) {
		return TrabajaService.registrar(trabaja);
	}
	
	@PutMapping
	public  Trabaja actualizar(@RequestBody Trabaja  trabaja) {
		return TrabajaService.actualizar(trabaja);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Trabaja  trabaja ) {
		TrabajaService.eliminar(trabaja);
	}
}