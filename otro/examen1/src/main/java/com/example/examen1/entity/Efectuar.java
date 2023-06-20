package com.example.examen1.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Table(name="efectuar")
@Entity(name="Efectuar")
public class Efectuar {
	@Id
	private String cd_efectuar;
	private String fecha_emision;
	private String tipo_moneda;
	private String observacion;
	private String fecha_vencimiento;
	
	
	public Efectuar() {
		
	}

	public Efectuar(String cd_efectuar, String fecha_emision, String tipo_moneda, String observacion,
			String fecha_vencimiento) {
		super();
		this.cd_efectuar = cd_efectuar;
		this.fecha_emision = fecha_emision;
		this.tipo_moneda = tipo_moneda;
		this.observacion = observacion;
		this.fecha_vencimiento = fecha_vencimiento;
		
	}

	public String getCd_efectuar() {
		return cd_efectuar;
	}

	public void setCd_efectuar(String cd_efectuar) {
		this.cd_efectuar = cd_efectuar;
	}

	public String getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(String fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

	public String getTipo_moneda() {
		return tipo_moneda;
	}

	public void setTipo_moneda(String tipo_moneda) {
		this.tipo_moneda = tipo_moneda;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
