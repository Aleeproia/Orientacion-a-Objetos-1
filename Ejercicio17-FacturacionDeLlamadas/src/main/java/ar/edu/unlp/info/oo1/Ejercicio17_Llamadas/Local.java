package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import java.time.*;

public class Local extends Llamada {

	public Local(LocalDate fecha, LocalTime horaComienzo, int duracionMinutos, int numeroQueLlama,
			int numeroTelQueRecibe) {
		super(fecha, horaComienzo, duracionMinutos, numeroQueLlama, numeroTelQueRecibe);
	}
	
	@Override
	public double calcularCosto() {
		return this.getDuracionMinutos() * 1;
	}
	

}
