package Ejercicio3Bis;

import java.time.LocalDate;
import java.util.ArrayList;

public class Balanza extends Object {
	
	private ArrayList<Producto> prod = new ArrayList<Producto>();
	
	public void ponerEnCero() {
		this.prod.clear();

	}
	
	public void agregarProducto(Producto producto) {
		this.prod.add(producto);
	}
	
	public Ticket emitirTicket() {
			Ticket t = new Ticket(LocalDate.now(),this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
			return t;
	}
	

	public int getCantidadDeProductos() {
		return prod.size();
	}


	public double getPrecioTotal() {
		double precioTotal=0;
		for(Producto p: prod){
			precioTotal+=p.getPrecio();
		}
		return precioTotal;
	}


	public double getPesoTotal() {
		double pesoTotal=0;
		for(Producto p: prod){
			pesoTotal+=p.getPeso();
		}
		return pesoTotal;
	}


	public ArrayList<Producto> getProductos() {
		return prod;
	}


}
