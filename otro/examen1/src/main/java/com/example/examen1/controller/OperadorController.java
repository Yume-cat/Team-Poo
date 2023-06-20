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
import com.example.examen1.entity.OperadorTuristico;
import com.example.examen1.service.OperadorService;



@RestController
@RequestMapping("/operadorTuristico")
public class OperadorController {
	
	@Autowired 
	OperadorService OperadorService;
	
	
	@GetMapping
	public List< OperadorTuristico> ver() {
		return OperadorService.ver();
	}
	
	@PostMapping
	public OperadorTuristico registrar(@RequestBody OperadorTuristico operadorTuristico ) {
		return OperadorService.registrar(operadorTuristico);
	}
	
	@PutMapping
	public  OperadorTuristico actualizar(@RequestBody OperadorTuristico  operadorTuristico) {
		return OperadorService.actualizar(operadorTuristico);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody OperadorTuristico  operadorTuristico ) {
		OperadorService.eliminar(operadorTuristico);
	}
}