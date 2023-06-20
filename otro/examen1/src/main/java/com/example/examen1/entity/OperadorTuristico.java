package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="operadorTuristico")
@Entity(name="OperadorTuristico")
public class OperadorTuristico {
	@Id
	private String ruc;
	private String cod_conductor;
	private String fecha;
	private String hora;
	
	public OperadorTuristico() {
		
	}

	public OperadorTuristico(String ruc, String cod_conductor, String fecha, String hora) {
		
		this.ruc = ruc;
		this.cod_conductor = cod_conductor;
		this.fecha = fecha;
		this.hora = hora;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getCod_conductor() {
		return cod_conductor;
	}

	public void setCod_conductor(String cod_conductor) {
		this.cod_conductor = cod_conductor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
}
