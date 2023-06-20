package com.example.examen1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Table(name="pasajeT")
@Entity(name="PasajeT")
public class PasajeT {
	
	

		@Id
		private String idPasaje;
		private String cantidad;
		private String unidad;
		private String descripcion;
		private String valorUnitario;
		
		
		public PasajeT() {
			
		}


		public PasajeT(String idPasaje, String cantidad, String unidad, String descripcion, String valorUnitario) {
			super();
			this.idPasaje = idPasaje;
			this.cantidad = cantidad;
			this.unidad = unidad;
			this.descripcion = descripcion;
			this.valorUnitario = valorUnitario;
		}


		public String getIdPasaje() {
			return idPasaje;
		}


		public void setIdPasaje(String idPasaje) {
			this.idPasaje = idPasaje;
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


		public String getValorUnitario() {
			return valorUnitario;
		}


		public void setValorUnitario(String valorUnitario) {
			this.valorUnitario = valorUnitario;
		}
		@OneToMany(fetch = FetchType.LAZY,
				mappedBy = "pasajeT",
				cascade = CascadeType.ALL)
		
		List<Comprante>comprante;


		public List<Comprante> getComprante() {
			return comprante;
		}


		public void setComprante(List<Comprante> comprante) {
			this.comprante = comprante;
		}
		
		
		
}
