package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import java.time.LocalDate;

public class Factura {

	private Cliente cliente;
	private LocalDate fechaFacturacion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double montoTotal;
	
	public Factura(Cliente cliente, LocalDate fechaFacturacion, LocalDate fechaInicio, LocalDate fechaFin,
			double montoTotal) {
		this.cliente = cliente;
		this.fechaFacturacion = fechaFacturacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.montoTotal = montoTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechaFacturacion() {
		return fechaFacturacion;
	}

	public void setFechaFacturacion(LocalDate fechaFacturacion) {
		this.fechaFacturacion = fechaFacturacion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	
}
