package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import java.time.LocalDate;

public class PersonaFisica extends Cliente{
	
	private int dni;

	public PersonaFisica(String nombre, String direccion, int numero, int dni) {
		super(nombre, direccion, numero);
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public double calcularMonto(LocalDate fechainicio,LocalDate fechafin) {
		double descuento;
		double monto = super.calcularMonto(fechainicio, fechafin);
		descuento = monto * 0.1;
		return monto - descuento;
		
	}
   
	
	
	
	

}
