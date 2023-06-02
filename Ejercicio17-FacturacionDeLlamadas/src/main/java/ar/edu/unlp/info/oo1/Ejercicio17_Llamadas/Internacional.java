package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import java.time.*;

public class Internacional extends Llamada {
	
	private String paisOrigen;
	private String paisDestino;
	
	
	
	public Internacional(LocalDate fecha, LocalTime horaComienzo, int duracionMinutos, int numeroQueLlama,
			int numeroTelQueRecibe, String paisOrigen, String paisDestino) {
		super(fecha, horaComienzo, duracionMinutos, numeroQueLlama, numeroTelQueRecibe);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getPaisDestino() {
		return paisDestino;
	}
	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}
	
	@Override
	public double calcularCosto() {
		LocalTime horanocturna = LocalTime.of(20,0); 
		LocalTime horadia = LocalTime.of(8,0);
		if((this.getHoraComienzo().isAfter(horanocturna))||(this.getHoraComienzo().isBefore(horadia))) {
			return (this.getDuracionMinutos() * 3);
			
		}
		return (this.getDuracionMinutos() * 5);
	}
	


}
