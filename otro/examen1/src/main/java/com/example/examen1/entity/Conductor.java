package com.example.examen1.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Table(name="conductor")
@Entity(name="Conductor")

public class Conductor {
@Id
	private String dni;
	private String nombre;
	
	private String telefono;


	public Conductor() {}


	public Conductor(String dni, String nombre, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		
		this.telefono = telefono;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
