package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import java.time.*;

public abstract class Llamada {
	
	private LocalDate fecha;
	private LocalTime horaComienzo;
	private int duracionMinutos;
	private int numeroQueLlama;
	private int numeroTelQueRecibe;
	
	
	public Llamada(LocalDate fecha, LocalTime horaComienzo, int duracionMinutos, int numeroQueLlama,
			int numeroTelQueRecibe) {
		this.fecha = fecha;
		this.horaComienzo = horaComienzo;
		this.duracionMinutos = duracionMinutos;
		this.numeroQueLlama = numeroQueLlama;
		this.numeroTelQueRecibe = numeroTelQueRecibe;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHoraComienzo() {
		return horaComienzo;
	}
	public void setHoraComienzo(LocalTime horaComienzo) {
		this.horaComienzo = horaComienzo;
	}
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
	public int getNumeroQueLlama() {
		return numeroQueLlama;
	}
	public void setNumeroQueLlama(int numeroQueLlama) {
		this.numeroQueLlama = numeroQueLlama;
	}
	public int getNumeroTelQueRecibe() {
		return numeroTelQueRecibe;
	}
	public void setNumeroTelQueRecibe(int numeroTelQueRecibe) {
		this.numeroTelQueRecibe = numeroTelQueRecibe;
	}
	
	public boolean fechaAConsiderar(LocalDate fechainicio,LocalDate fechafin) {
		return (this.getFecha().isAfter(fechainicio) && this.getFecha().isBefore(fechafin));
	}
	public abstract double calcularCosto();
	

}
