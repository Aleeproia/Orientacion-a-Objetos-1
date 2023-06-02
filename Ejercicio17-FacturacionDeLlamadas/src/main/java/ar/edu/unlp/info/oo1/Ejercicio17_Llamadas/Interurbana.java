package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import java.time.*;

public class Interurbana extends Llamada{
	
	private int distanciaKmEntreLlamadas;
	
	

	public Interurbana(LocalDate fecha, LocalTime horaComienzo, int duracionMinutos, int numeroQueLlama,
			int numeroTelQueRecibe, int distanciaKmEntreLlamadas) {
		super(fecha, horaComienzo, duracionMinutos, numeroQueLlama, numeroTelQueRecibe);
		this.distanciaKmEntreLlamadas = distanciaKmEntreLlamadas;
	}

	public int getDistanciaKmEntreLlamadas() {
		return distanciaKmEntreLlamadas;
	}

	public void setDistanciaKmEntreLlamadas(int distanciaKmEntreLlamadas) {
		this.distanciaKmEntreLlamadas = distanciaKmEntreLlamadas;
	}
	
	@Override
	public double calcularCosto() {
		int precioConexion=5;
		if(this.distanciaKmEntreLlamadas < 100) {
			return (this.getDuracionMinutos() * 2)+precioConexion;	
		}
		else if((this.distanciaKmEntreLlamadas > 100 && this.distanciaKmEntreLlamadas < 300)) {
			    return (this.getDuracionMinutos() * 2.5)+precioConexion;
		     }
		return (this.getDuracionMinutos() * 3)+precioConexion;
		
	}
	

	

}
