package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
	
	
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}

	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double costoEnBaseA(double precioKwh) {
		return (this.consumoEnergiaActiva * precioKwh);
	}
	
	public double factorDePotencia() {
		return this.consumoEnergiaActiva / (Math.sqrt((Math.pow(this.consumoEnergiaActiva, 2))+(Math.pow(this.consumoEnergiaReactiva, 2))));
	}

}