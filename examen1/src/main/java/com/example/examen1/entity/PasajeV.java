package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;



@Table(name="pasajeV")
@Entity(name="PasajeV")

public class PasajeV {
	@Id
	private String cantidad;
	private String unidad;
	private String descripcion;
	private String valor;

	public PasajeV() {
		
	}

	public PasajeV(String cantidad, String unidad, String descripcion, String valor) {
		super();
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValorU() {
		return valor;
	}

	public void setValorU(String valorU) {
		this.valor = valorU;
	}
}