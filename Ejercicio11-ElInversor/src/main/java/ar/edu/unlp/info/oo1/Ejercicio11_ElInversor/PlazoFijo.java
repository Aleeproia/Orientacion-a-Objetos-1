package ar.edu.unlp.info.oo1.Ejercicio11_ElInversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo extends Inversiones {
	
	
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	
	public double valorActual() {
		long cantidadDeDias = ChronoUnit.DAYS.between(this.fechaDeConstitucion,LocalDate.now());
		return this.montoDepositado +(cantidadDeDias * this.porcentajeDeInteresDiario);
	}
}