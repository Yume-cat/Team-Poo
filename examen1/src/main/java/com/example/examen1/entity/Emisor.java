package com.example.examen1.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="emisor")
@Entity(name="Emisor")

public class Emisor {
	
	@Id
	private String nombre;
	private String apellidos;
	
	
	
	
	public Emisor() {
		
	}




	public Emisor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	
		
		
	}
}
	
	
	
	
	
