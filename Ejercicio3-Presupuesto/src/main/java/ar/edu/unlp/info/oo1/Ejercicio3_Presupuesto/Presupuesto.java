package ar.edu.unlp.info.oo1.Ejercicio3_Presupuesto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto extends Object{
	
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item>items;
	
	public Presupuesto() {
		this.items=new ArrayList<Item>();
	}
	public Presupuesto cliente(String cliente) {
		this.setCliente(cliente);
		return this;
		
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	public double calcularTotal() {
		double suma=0;
		for(int i=0; i<items.size();i++) {
			suma+=items.get(i).costo();
		}
		return suma;
	}
	
}
