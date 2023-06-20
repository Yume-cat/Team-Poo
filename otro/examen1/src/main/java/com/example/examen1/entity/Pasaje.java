package com.example.examen1.entity;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;





@Table(name="pasaje")
@Entity(name="Pasaje")
public class Pasaje {
	
	

		@Id
		private String id_pasaje;
		private String nr_vuelo;
		private String origen;
		private String destino;
		private String operador;
		
		
		
		public Pasaje() {
			
		}



		



		public Pasaje(String id_pasaje, String nr_vuelo, String origen, String destino, String operador
				) {
			super();
			this.id_pasaje = id_pasaje;
			this.nr_vuelo = nr_vuelo;
			this.origen = origen;
			this.destino = destino;
			this.operador = operador;
			
		}







		public String getId_pasaje() {
			return id_pasaje;
		}







		public void setId_pasaje(String id_pasaje) {
			this.id_pasaje = id_pasaje;
		}







		public String getNr_vuelo() {
			return nr_vuelo;
		}







		public void setNr_vuelo(String nr_vuelo) {
			this.nr_vuelo = nr_vuelo;
		}







		public String getOrigen() {
			return origen;
		}







		public void setOrigen(String origen) {
			this.origen = origen;
		}







		public String getDestino() {
			return destino;
		}







		public void setDestino(String destino) {
			this.destino = destino;
		}







		public String getOperador() {
			return operador;
		}







		public void setOperador(String operador) {
			this.operador = operador;
		}


		@OneToMany(fetch = FetchType.LAZY,
				mappedBy = "pasaje",
				cascade = CascadeType.ALL)
		
		List<Aerolinea>aerolinea;



		public List<Aerolinea> getAerolinea() {
			return aerolinea;
		}







		public void setAerolinea(List<Aerolinea> aerolinea) {
			this.aerolinea = aerolinea;
		}




		
		
		
		
		
}
