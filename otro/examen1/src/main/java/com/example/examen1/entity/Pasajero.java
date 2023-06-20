package com.example.examen1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity(name="pasajero")
@Table(name="Pasajero")
public class Pasajero {
		@Id
		private String id_pasajero;
		private String dni;
		private String nrboleto;
		
		
		
		
		
		public Pasajero() {
			
		}





		public Pasajero(String id_pasajero, String dni, String nrboleto) {
			super();
			this.id_pasajero = id_pasajero;
			this.dni = dni;
			this.nrboleto = nrboleto;
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





		public String getNrboleto() {
			return nrboleto;
		}





		public void setNrboleto(String nrboleto) {
			this.nrboleto = nrboleto;
		}


		@OneToMany(fetch = FetchType.LAZY,
				mappedBy = "pasajero",
				cascade = CascadeType.ALL)
		
		List<Aerolinea>aerolinea;





		public List<Aerolinea> getAerolinea() {
			return aerolinea;
		}





		public void setAerolinea(List<Aerolinea> aerolinea) {
			this.aerolinea = aerolinea;
		}
		



		



		
		
		

}
