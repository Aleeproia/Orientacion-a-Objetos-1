package ar.edu.unlp.info.oo1.Ejercicio19_MercadoDeObjetos;

import java.util.*;
import java.util.stream.Collectors;

public class SistemaDeMercadoOnline {
	
	private List<Persona>personas;
		

	public SistemaDeMercadoOnline() {
		this.personas = new ArrayList<Persona>();
	}

	public List<Persona> getPersonas() {
		return personas;
	}
	
	public Persona registrarPersona(String nombre,String direccion) {
		Persona persona= new Persona(nombre,direccion);
		this.personas.add(persona);
		return persona;
	}
	
	public Persona buscarPersona(String nombre) {
		return this.personas.stream().filter(p -> p.existePersona(nombre)).findFirst().orElse(null);
	}
	
	public Producto ponerProductoAVenta(String nombre,String descripcion,double precio,int cantidadUnidadesDisponibles,Persona vendedor) {
		return vendedor.agregarProducto(nombre, descripcion,precio, cantidadUnidadesDisponibles);
	}
	
	public List<Producto>retornarTotalProductos(String nombre){
		return this.personas.stream().map(p-> p.retornarProductoEspecifico(nombre)).filter(p -> p != null).collect(Collectors.toList());
	}

}
