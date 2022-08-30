package Ejercicio2;

import java.time.LocalDate;

public class Balanza extends Object{
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal+= producto.getPrecio();
		this.pesoTotal+=producto.getPeso();
		
		
	}
	
	public Ticket emitirTicket() {
			Ticket t = new Ticket(LocalDate.now(),this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
			return t;
	}
	

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

}
