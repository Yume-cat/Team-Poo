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
import com.example.examen1.entity.Cliente;
import com.example.examen1.service.ClienteService;



@RestController
@RequestMapping("/comprar")
public class ClienteController {
	@Autowired 
	ClienteService ClienteService;
	
	
	@GetMapping
	public List< Cliente> ver() {
		return ClienteService.ver();
	}
	
	@PostMapping
	public Cliente registrar(@RequestBody Cliente cliente ) {
		return ClienteService.registrar(cliente);
	}
	
	@PutMapping
	public  Cliente actualizar(@RequestBody Cliente  cliente) {
		return ClienteService.actualizar(cliente);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Cliente  cliente ) {
		ClienteService.eliminar(cliente);
	}
}
