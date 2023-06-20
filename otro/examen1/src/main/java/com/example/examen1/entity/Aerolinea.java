package com.example.examen1.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name="aerolinea")
@Entity(name="Aerolinea")
public class Aerolinea {
	
	@Id
	
	private String ruc;
	private String direccion;
	private String telefono;
	
	public Aerolinea() {
		
	}

	public Aerolinea(String ruc, String direccion, String telefono) {
		super();
		this.ruc = ruc;
		this.direccion = direccion;
		this.telefono = telefono;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pasaje")
	private Pasaje pasaje;

	public Pasaje getPasaje() {
		return pasaje;
	}

	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pasajero")
	private Pasajero pasajero;

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
}
