package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import java.time.*;
import java.util.*;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private int numero;
	private List<Llamada>llamadas;
	
	
	public Cliente() {}
	
	public Cliente(String nombre, String direccion, int numero) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numero = numero;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public Llamada registrarLlamadaLocal(LocalDate fecha,LocalTime horaComienzo,int duracionMinutos,int numeroQueLlama,int numeroTelQueRecibe) {
		Llamada llamadalocal = new Local(fecha,horaComienzo,duracionMinutos,numeroQueLlama,numeroTelQueRecibe);
		this.llamadas.add(llamadalocal);
		return llamadalocal;
	}
	
	public Llamada registrarLlamadaInterurbana(LocalDate fecha,LocalTime horaComienzo,int duracionMinutos,int numeroQueLlama,int numeroTelQueRecibe,int distanciaKmEntreLlamadas) {
		Llamada llamadainterurbana= new Interurbana(fecha,horaComienzo,duracionMinutos,numeroQueLlama,numeroTelQueRecibe,distanciaKmEntreLlamadas);
		this.llamadas.add(llamadainterurbana);
		return llamadainterurbana;
	}
	public Llamada registrarLlamadaInternacional(LocalDate fecha,LocalTime horaComienzo,int duracionMinutos,int numeroQueLlama,int numeroTelQueRecibe,String paisOrigen,String paisDestino) {
		Llamada llamadainternacional = new Internacional(fecha,horaComienzo,duracionMinutos,numeroQueLlama,numeroTelQueRecibe,paisOrigen,paisDestino);
		this.llamadas.add(llamadainternacional);
		return llamadainternacional;
	}
	
	public Factura FacturarLlamadas(LocalDate fechainicio,LocalDate fechafin) {
		return new Factura(this,LocalDate.now(),fechainicio,fechafin,this.calcularMonto(fechainicio, fechafin));
	}
	
	public double calcularMonto(LocalDate fechainicio,LocalDate fechafin) {
		return this.llamadas.stream().filter(l -> l.fechaAConsiderar(fechainicio, fechafin)).mapToDouble(l -> l.calcularCosto()).sum();
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
   
}
