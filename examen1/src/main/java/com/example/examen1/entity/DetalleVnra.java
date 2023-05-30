package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="detalleVnra")
@Table(name="DetalleVnra")
public class DetalleVnra {
	@Id
	private String fecha_emision;
	private String tarifa;
	private String servicio_incluido;
	private String cargo;
	private String impuestos;
	private String igv;
	private String cargo_cambio;
	
	
	
	
	public DetalleVnra() {
		
	}



	public DetalleVnra(String fecha_emision, String tarifa, String servicio_incluido, String cargo, String impuestos,
			String igv, String cargo_cambio) {
		super();
		this.fecha_emision = fecha_emision;
		this.tarifa = tarifa;
		this.servicio_incluido = servicio_incluido;
		this.cargo = cargo;
		this.impuestos = impuestos;
		this.igv = igv;
		this.cargo_cambio = cargo_cambio;
	}



	public String getFecha_emision() {
		return fecha_emision;
	}



	public void setFecha_emision(String fecha_emision) {
		this.fecha_emision = fecha_emision;
	}



	public String getTarifa() {
		return tarifa;
	}



	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}



	public String getServicio_incluido() {
		return servicio_incluido;
	}



	public void setServicio_incluido(String servicio_incluido) {
		this.servicio_incluido = servicio_incluido;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String getImpuestos() {
		return impuestos;
	}



	public void setImpuestos(String impuestos) {
		this.impuestos = impuestos;
	}



	public String getIgv() {
		return igv;
	}



	public void setIgv(String igv) {
		this.igv = igv;
	}



	public String getCargo_cambio() {
		return cargo_cambio;
	}



	public void setCargo_cambio(String cargo_cambio) {
		this.cargo_cambio = cargo_cambio;
	}

}
