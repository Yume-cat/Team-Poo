package com.example.examen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="pasaje")
@Entity(name="Pasaje")
public class Pasaje {
	
	

		@Id
		private String codigo;
		private String cantidad;
		private String unidad;
		private String ruta;
		private String valorUnitario;
		
		
		public Pasaje() {
			
		}
		public Pasaje(String codigo, String cantidad, String unidad, String ruta, String valorUnitario) {
			super();
			this.codigo = codigo;
			this.cantidad = cantidad;
			this.unidad = unidad;
			this.ruta = ruta;
			this.valorUnitario = valorUnitario;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
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
		public String getRuta() {
			return ruta;
		}
		public void setRuta(String ruta) {
			this.ruta = ruta;
		}
		public String getValorUnitario() {
			return valorUnitario;
		}
		public void setValorUnitario(String valorUnitario) {
			this.valorUnitario = valorUnitario;
		}
		
		
		
}
