package ar.edu.unlp.info.oo1.Ejercicio19_MercadoDeObjetos;

public class Producto {
	
	private String nombre;
	private String descripcion;
	private double precio;
	private int cantidadUnidadesDisponibles;
	
	
	public Producto(String nombre, String descripcion, double precio, int cantidadUnidadesDisponibles) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidadUnidadesDisponibles = cantidadUnidadesDisponibles;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public double getPrecio() {
		return precio;
	}

	public boolean existeProducto(String nombre) {
		return this.nombre.equals(nombre);
	}

	public int getCantidadUnidadesDisponibles() {
		return cantidadUnidadesDisponibles;
	}


	public void descontarProductos(int cantidadSolicitada) {
		this.cantidadUnidadesDisponibles = cantidadUnidadesDisponibles - cantidadSolicitada;
	}
	
	

}
