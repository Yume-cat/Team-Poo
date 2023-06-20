package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="tour")
@Entity(name="Tour")
public class Tour {

	@Id
	private String ruc;
	private String direccion;
	private String telefono;
	
	
	public Tour() {
		
	}


	public Tour(String ruc, String direccion, String telefono) {
		super();
		this.ruc = ruc;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	
	
	
}
