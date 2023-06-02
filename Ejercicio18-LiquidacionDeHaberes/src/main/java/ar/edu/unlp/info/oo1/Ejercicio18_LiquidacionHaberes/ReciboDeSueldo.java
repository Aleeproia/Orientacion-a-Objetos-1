package ar.edu.unlp.info.oo1.Ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;

public class ReciboDeSueldo {

	 private String nombre;
	 private String apellido;
	 private String cuil;
	 private int antiguedadEnLaEmpresa;
	 private LocalDate fechaGeneracionRecibo;
	 private double montoTotal;
	 
	 public ReciboDeSueldo() {}
	 
	 public ReciboDeSueldo(String nombre, String apellido, String cuil, int antiguedadEnLaEmpresa,
			LocalDate fechaGeneracionRecibo, double montoTotal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedadEnLaEmpresa = antiguedadEnLaEmpresa;
		this.fechaGeneracionRecibo = fechaGeneracionRecibo;
		this.montoTotal = montoTotal;
	 }

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCuil() {
		return cuil;
	}

	public int getAntiguedadEnLaEmpresa() {
		return antiguedadEnLaEmpresa;
	}

	public LocalDate getFechaGeneracionRecibo() {
		return fechaGeneracionRecibo;
	}

	public double getMontoTotal() {
		return montoTotal;
	}
	 
	 
}
