package com.example.examen1.entity;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="cliente")
@Entity(name="Cliente")
public class Cliente {

	@Id
	private String id_cliente;
	private String tipoDoc;
	private String nombre;
	private String apellido;
	
	
	public Cliente() {
		
	}


	


	public Cliente(String id_cliente, String tipoDoc, String nombre, String apellido, List<Comprante> comprante) {
		super();
		this.id_cliente = id_cliente;
		this.tipoDoc = tipoDoc;
		this.nombre = nombre;
		this.apellido = apellido;
		this.comprante = comprante;
	}





	public String getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getTipoDoc() {
		return tipoDoc;
	}


	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@OneToMany(fetch = FetchType.LAZY,
			mappedBy = "cliente",
			cascade = CascadeType.ALL)
	
	List<Comprante>comprante;


	public List<Comprante> getComprante() {
		return comprante;
	}





	public void setComprante(List<Comprante> comprante) {
		this.comprante = comprante;
	}
	
	


	

	@OneToMany(fetch = FetchType.LAZY,
			mappedBy = "cliente",
			cascade = CascadeType.ALL)
	
	List<Efectuar>efectuar;


	public List<Efectuar> getEfectuar() {
		return efectuar;
	}





	public void setEfectuar(List<Efectuar> efectuar) {
		this.efectuar = efectuar;
	}
	
	
	
	
	
	
}
