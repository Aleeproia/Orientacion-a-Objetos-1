package ar.edu.unlp.info.oo1.Ejercicio3_Presupuesto;

public class Item {
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	
	public Item detalle(String detalle) {
		this.setDetalle(detalle);
		return this;
	}
	
	public Item costoUnitario(int costo) {
		this.setCostoUnitario(costo);
		return this;
	}
	public Item cantidad(int cantidad) {
		this.setCantidad(cantidad);
		return this;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	public double costo() {
		return (this.cantidad * this.costoUnitario);
	}

}
