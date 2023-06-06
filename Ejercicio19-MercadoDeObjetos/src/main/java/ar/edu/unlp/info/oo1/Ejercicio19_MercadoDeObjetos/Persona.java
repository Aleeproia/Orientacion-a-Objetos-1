package ar.edu.unlp.info.oo1.Ejercicio19_MercadoDeObjetos;

import java.util.*;
import java.util.stream.Collectors;

public class Persona {
	
	private List<Producto>productos;
	private List<Pedido>pedidos;
	private String nombre;
	private String direccion;
	
	public Persona(String nombre, String direccion) {
		this.productos = new ArrayList<Producto>();
		this.pedidos = new ArrayList<Pedido>();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public boolean existePersona(String nombre) {
		return this.nombre.equals(nombre);
	}
	
	public Producto agregarProducto(String nombre,String descripcion,double precio,int cantidadUnidadesDisponibles) {
		Producto producto= new Producto(nombre,descripcion,precio,cantidadUnidadesDisponibles);
		productos.add(producto);
		return producto;
	}
	
	public Producto retornarProductoEspecifico(String nombre){
		return this.productos.stream().filter(p -> p.existeProducto(nombre)).findFirst().orElse(null);
	}
	
	public Pedido crearPedido(int cantidadSolicitada,Producto producto,Pago formaDePago,Envio mecanismoDeEnvio) {	
		if(producto.getCantidadUnidadesDisponibles() >= cantidadSolicitada) {
			Pedido pedido= new Pedido(cantidadSolicitada,this,producto,formaDePago,mecanismoDeEnvio);
			this.pedidos.add(pedido);
			producto.descontarProductos(cantidadSolicitada);
			return pedido;
		}
		return null;
	}
	
	public double calcularCostoTotalDeUnPedido(Pedido pedido) {
		return pedido.calcularCostoPedido();
	}
	
	
	
	
	

}
