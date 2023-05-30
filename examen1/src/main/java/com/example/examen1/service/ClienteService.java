package com.example.examen1.service;

import java.util.List;

import com.example.examen1.entity.Cliente;



public interface ClienteService {
	
    public Cliente registrar(Cliente cliente);
	
	public Cliente actualizar(Cliente cliente);
	
	public void eliminar(Cliente cliente);
	
	public List < Cliente > ver();
}
