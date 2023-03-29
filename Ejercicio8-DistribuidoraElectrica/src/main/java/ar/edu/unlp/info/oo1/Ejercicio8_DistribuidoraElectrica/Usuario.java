package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private String domicilio;
	private List<Factura>facturas;
	private List<Consumo>consumos;
	


	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public Consumo ultimoConsumo() {
		return this.consumos
				.stream()
				.max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
	}
	
	
	public double ultimoConsumoActiva() {     
		if(this.ultimoConsumo() == null) {
			return 0;
		}
		return this.ultimoConsumo().getConsumoEnergiaActiva();
	}
	
	public Factura facturarEnBaseA(double precioKwh) {
		Factura fac;
		if(this.ultimoConsumo()==null) {
			fac = new Factura(0,0,this);
			return fac;
		}
		if(this.ultimoConsumo().factorDePotencia() > 0.8) {
			fac = new Factura(this.ultimoConsumo().costoEnBaseA(precioKwh),10,this);
			return fac;
		}
		fac=new Factura(this.ultimoConsumo().costoEnBaseA(precioKwh),0,this);
		return fac;
		
		
	}
	public List<Factura> facturas(){
		return this.facturas;
	}
}