package ar.edu.unlp.info.oo1.Ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Contrato {
	
	private LocalDate fechaInicio;
	private Empleado empleado;

	public Contrato(LocalDate fechaInicio,Empleado empleado) {
		this.fechaInicio = fechaInicio;
		this.empleado = empleado;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	

	public Empleado getEmpleado() {
		return empleado;
	}
	
    public int antiguedad() {
    	return (int)ChronoUnit.YEARS.between(this.getFechaInicio(),LocalDate.now());
    }
	
	
	public abstract boolean Vencido();
	
	public abstract boolean Activo();

	public abstract double calcularMonto();

}
