package ar.edu.unlp.info.oo1.Ejercicio2_Balanza;

import java.time.LocalDate;

public class Balanza extends Object{
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}
    public void agregarProducto(Producto producto) {
    	this.cantidadDeProductos++;
    	this.precioTotal+=producto.getPrecio();
    	this.pesoTotal+=producto.getPeso();
    }
    
    public Ticket emitirTicket() {
    	Ticket ticket = new Ticket();
    	ticket.setFecha(LocalDate.now());
    	ticket.setCantidadDeProductos(this.cantidadDeProductos);
    	ticket.setPesoTotal(this.pesoTotal);
    	ticket.setPrecioTotal(this.precioTotal);
    	return ticket;
    }
    
    
    
}
