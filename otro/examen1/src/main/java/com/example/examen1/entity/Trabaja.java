package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Table(name="trabaja")
@Entity(name="Trabaja")
public class Trabaja {
@Id


private String compra;


public Trabaja() {
	
}


public Trabaja(String compra) {
	super();
	this.compra = compra;
}


public String getCompra() {
	return compra;
}


public void setCompra(String compra) {
	this.compra = compra;
}


@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_empleado")
private Empleado empleado;


public Empleado getEmpleado() {
	return empleado;
}


public void setEmpleado(Empleado empleado) {
	this.empleado = empleado;
}



}
