package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name="pasajero")
@Table(name="Pasajero")
public class Pasajero {
		@Id
		private String nombre;
		private String dni;
		private String n_boleto;
		
		
		
		
		public Pasajero() {
			
		}




		public Pasajero(String nombre, String dni, String n_boleto) {
			super();
			this.nombre = nombre;
			this.dni = dni;
			this.n_boleto = n_boleto;
		}




		public String getNombre() {
			return nombre;
		}




		public void setNombre(String nombre) {
			this.nombre = nombre;
		}




		public String getDni() {
			return dni;
		}




		public void setDni(String dni) {
			this.dni = dni;
		}




		public String getN_boleto() {
			return n_boleto;
		}




		public void setN_boleto(String n_boleto) {
			this.n_boleto = n_boleto;
		}
		

}
