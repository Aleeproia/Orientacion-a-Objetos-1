package Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
public class Presupuesto {
	
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items; 
	
	public Presupuesto cliente(String string) {
		this.setCliente(string);
		items = new ArrayList<Item>();
		this.fecha=LocalDate.now();
		return this;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
		
	}
	public double calcularTotal() {
		double total=0;
		for (int i=0;i<items.size();i++) {   
			total+=items.get(i).costo();
		 }
		return total;
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
	
	
	
}
