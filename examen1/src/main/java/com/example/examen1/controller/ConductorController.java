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

import com.example.examen1.entity.Conductor;
import com.example.examen1.service.ConductorService;



@RestController
@RequestMapping("/compra")
public class ConductorController {
	@Autowired 
	ConductorService conductorService;
	
	
	@GetMapping
	public List< Conductor> ver() {
		return conductorService.ver();
	}
	
	@PostMapping
	public Conductor registrar(@RequestBody Conductor conductor ) {
		return conductorService.registrar(conductor);
	}
	
	@PutMapping
	public  Conductor actualizar(@RequestBody Conductor  conductor) {
		return conductorService.actualizar(conductor);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Conductor  conductor ) {
		conductorService.eliminar(conductor);
	}
}
