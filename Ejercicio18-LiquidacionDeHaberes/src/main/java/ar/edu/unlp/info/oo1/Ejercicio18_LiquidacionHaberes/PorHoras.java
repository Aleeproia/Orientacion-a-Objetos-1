package ar.edu.unlp.info.oo1.Ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;

public class PorHoras extends Contrato{
	
	
	private double valorHoraContrato;
	private int cantidadHorasMes;
	private LocalDate fechaFinContrato;
	
	public PorHoras(LocalDate fechaInicio, double valorHoraContrato, int cantidadHorasMes, LocalDate fechaFinContrato,Empleado empleado) {
		super(fechaInicio,empleado);
		this.valorHoraContrato = valorHoraContrato;
		this.cantidadHorasMes = cantidadHorasMes;
		this.fechaFinContrato = fechaFinContrato;
	}

	public double getValorHoraContrato() {
		return valorHoraContrato;
	}

	public int getCantidadHorasMes() {
		return cantidadHorasMes;
	}

	public LocalDate getFechaFinContrato() {
		return fechaFinContrato;
	}
	
	@Override
	public double calcularMonto() {
		return (this.valorHoraContrato * this.cantidadHorasMes);
	}
	@Override
	public boolean Vencido() {
		return LocalDate.now().isAfter(fechaFinContrato);
	}
	@Override
	public boolean Activo() {
		return LocalDate.now().isBefore(fechaFinContrato);
	}

}
