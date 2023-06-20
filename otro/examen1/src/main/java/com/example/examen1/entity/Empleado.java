package com.example.examen1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Table(name="empleado")
@Entity(name="Empleado")
public class Empleado {
	@Id
	private String id_empleado;
	private String dni;
	private String nombre;
	private String telefono;
	
	public Empleado() {
		
	}

	public Empleado(String id_empleado, String dni, String nombre, String telefono) {
		super();
		this.id_empleado = id_empleado;
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
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
	
	
	@OneToMany(fetch = FetchType.LAZY,
			mappedBy = "empleado",
			cascade = CascadeType.ALL)
	
	List<Efectuar>efectuar;

	public List<Efectuar> getEfectuar() {
		return efectuar;
	}

	public void setEfectuar(List<Efectuar> efectuar) {
		this.efectuar = efectuar;
	}

	
	
	@OneToMany(fetch = FetchType.LAZY,
			mappedBy = "empleado",
			cascade = CascadeType.ALL)
	
	List<Trabaja>trabaja;
	
	
}
