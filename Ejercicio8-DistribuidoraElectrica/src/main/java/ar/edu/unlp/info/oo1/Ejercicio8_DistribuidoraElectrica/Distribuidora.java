package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Distribuidora {
	
	private double precioKwh;
	private List<Usuario>usuarios;
	
	public Distribuidora(double precio) {
		this.precioKwh=precio;
		this.usuarios = new ArrayList<Usuario>();
	}
	
	
	public double getPrecioKwh() {
		return this.precioKwh;
	}
	public List<Usuario>getUsuarios(){
		return this.usuarios;
	}
	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	public List<Factura> facturar(){
		return usuarios.stream().map(u -> u.facturarEnBaseA(this.precioKwh)).collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		return usuarios.stream().mapToDouble(u -> u.ultimoConsumoActiva()).sum();
		
	}
	public void precioKwh(double precio) {
		this.precioKwh=precio;	
	}
	
}