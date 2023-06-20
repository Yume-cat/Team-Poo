package com.example.examen1.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name="comprante")
@Entity(name="Comprante")
public class Comprante {
	@Id
	private String cd_comprante;
	private String icbper;
	private String op_exonerada;
	private String op_gravada;
	private String otroa_cargos;
	private String importe_total;
	
	
	
	
	
	
	public Comprante() {
		
	}


	public Comprante(String cd_comprante, String icbper, String op_exonerada, String op_gravada, String otroa_cargos,
			String importe_total) {
		super();
		this.cd_comprante = cd_comprante;
		this.icbper = icbper;
		this.op_exonerada = op_exonerada;
		this.op_gravada = op_gravada;
		this.otroa_cargos = otroa_cargos;
		this.importe_total = importe_total;
		
	}


	public String getCd_comprante() {
		return cd_comprante;
	}


	public void setCd_comprante(String cd_comprante) {
		this.cd_comprante = cd_comprante;
	}


	public String getIcbper() {
		return icbper;
	}


	public void setIcbper(String icbper) {
		this.icbper = icbper;
	}


	public String getOp_exonerada() {
		return op_exonerada;
	}


	public void setOp_exonerada(String op_exonerada) {
		this.op_exonerada = op_exonerada;
	}


	public String getOp_gravada() {
		return op_gravada;
	}


	public void setOp_gravada(String op_gravada) {
		this.op_gravada = op_gravada;
	}


	public String getOtroa_cargos() {
		return otroa_cargos;
	}


	public void setOtroa_cargos(String otroa_cargos) {
		this.otroa_cargos = otroa_cargos;
	}


	public String getImporte_total() {
		return importe_total;
	}


	public void setImporte_total(String importe_total) {
		this.importe_total = importe_total;
	}


		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPasaje")
	private PasajeT pasajeT;



	public PasajeT getPasajeT() {
		return pasajeT;
	}


	public void setPasajeT(PasajeT pasajeT) {
		this.pasajeT = pasajeT;
	}



	
	
	
}
