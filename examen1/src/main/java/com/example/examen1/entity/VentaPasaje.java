package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name="ventaPasaje")
@Table(name="ventaPasaje")

public class VentaPasaje {
	@Id
	private String id_pasajero;
	private String dni;
	private String fecha_pago;
	private String tipo;
	
	
	
	
	public VentaPasaje() {
		
	}




	public VentaPasaje(String id_pasajero, String dni, String fecha_pago, String tipo) {
		super();
		this.id_pasajero = id_pasajero;
		this.dni = dni;
		this.fecha_pago = fecha_pago;
		this.tipo = tipo;
	}




	public String getId_pasajero() {
		return id_pasajero;
	}




	public void setId_pasajero(String id_pasajero) {
		this.id_pasajero = id_pasajero;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public String getFecha_pago() {
		return fecha_pago;
	}




	public void setFecha_pago(String fecha_pago) {
		this.fecha_pago = fecha_pago;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
