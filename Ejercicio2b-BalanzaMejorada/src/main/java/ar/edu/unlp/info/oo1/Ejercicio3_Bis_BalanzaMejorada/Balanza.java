package ar.edu.unlp.info.oo1.Ejercicio3_Bis_BalanzaMejorada;

import java.time.LocalDate;
import java.util.ArrayList;


public class Balanza extends Object{
	
	private ArrayList<Producto>productos;
	
	public Balanza() {
		this.productos = new ArrayList<Producto>();
	}
	public ArrayList<Producto> getProductos(){
		return this.productos;
	}
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	public double getPrecioTotal() {
		double precioTotal=0;
		for(int i=0; i<productos.size();i++) {
			precioTotal+=productos.get(i).getPrecio();
		}
		return precioTotal;
		
	}
	
	public double getPesoTotal() {
		double pesoTotal=0;
		for(int i=0; i<productos.size();i++) {
			pesoTotal+=productos.get(i).getPeso();
		}
		return pesoTotal;
	}
	
	public void ponerEnCero() {
		this.productos.clear();
	}
    public void agregarProducto(Producto producto) {
    	this.productos.add(producto);
    }
    
    public Ticket emitirTicket() {
    	Ticket ticket = new Ticket();
    	ticket.setFecha(LocalDate.now());
    	ticket.setCantidadDeProductos(this.getCantidadDeProductos());
    	ticket.setPesoTotal(this.getPesoTotal());
    	ticket.setPrecioTotal(this.getPrecioTotal());
    	return ticket;
    }
    
    
    
}