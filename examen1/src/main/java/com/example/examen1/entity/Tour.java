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
	private String correo;
	
	public Tour() {
		
	}

	public Tour(String ruc, String direccion, String correo) {
		super();
		this.ruc = ruc;
		this.direccion = direccion;
		this.correo = correo;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
