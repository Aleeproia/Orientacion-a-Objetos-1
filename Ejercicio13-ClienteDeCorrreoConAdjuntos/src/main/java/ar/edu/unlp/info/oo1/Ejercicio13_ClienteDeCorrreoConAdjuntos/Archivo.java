package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorrreoConAdjuntos;

public class Archivo {

	private String nombre;
	


	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public double tamaño() {
		return this.nombre.length();
	}
	
	
	
}
