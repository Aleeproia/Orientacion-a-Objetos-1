package ar.edu.unlp.info.oo1.Ejercicio11_ElInversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	
	
	private String nombre;
	private List<Inversiones>inversiones;

	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversiones>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Inversiones> getInversiones() {
		return inversiones;
	}

	public void addInversion(Inversiones inversion) {
		this.inversiones.add(inversion);
	}
	
	public double getValorTotal() {
		return this.inversiones.stream().mapToDouble(i-> i.valorActual()).sum();
	}

}