package com.example.examen1.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Table(name="vehiculo")
@Entity(name="Vehiculo")

public class Vehiculo {
@Id
	private String placa;

	public Vehiculo() {
	}

	public Vehiculo(String placa) {
		super();
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
}
