package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorrreoConAdjuntos;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List<Archivo>adjuntos;
	
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public List<Archivo> adjuntos() {
		return this.adjuntos;
	}
	public void agregarArchivo(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
	public double tamañoEmail() {
		double tam = this.adjuntos.stream().mapToDouble(a->a.tamaño()).sum();
		return (tam+this.cuerpo.length()+this.titulo.length());
	}
	
	
	public boolean existeEmail(String texto) {
		if(this.titulo.equals(texto)|| this.cuerpo.equals(texto)) {
			return true;
		}
		return false;
	}
}
