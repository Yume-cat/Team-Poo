package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="cliente")
@Entity(name="Cliente")
public class Cliente {

	@Id
	private String tipoDoc;
	private String nombre;
	private String apellido;
	
	
	public Cliente() {
		
	}

	public Cliente(String tipoDoc, String nombre, String apellido) {
		super();
		this.tipoDoc = tipoDoc;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String dni) {
		this.tipoDoc = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	


	


	


	
	
	
}
