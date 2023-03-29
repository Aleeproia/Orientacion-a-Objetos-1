package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.fecha = LocalDate.now();
		this.usuario = usuario;
	}
	
	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}
	public LocalDate getFecha() {
		return this.fecha;
		
	}
	public double montoTotal() {
		double desc =((this.montoEnergiaActiva * this.descuento)/100);
		return (this.montoEnergiaActiva - desc);
	}
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public LocalDate fecha() {
		return this.fecha;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
}
