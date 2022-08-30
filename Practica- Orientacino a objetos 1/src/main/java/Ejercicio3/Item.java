package Ejercicio3;

public class Item{
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public double costo() {
		return (this.cantidad * this.costoUnitario); 
		
	}
	public Item detalle(String string) {
		this.setDetalle(string);
		return this;
	}
	
	public Item costoUnitario(int costoUnitario) {
		this.setCostoUnitario(costoUnitario);
		return this;
	}

	public Item cantidad(int i) {
		this.setCantidad(i);
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
	
	

}
