package ar.edu.unlp.info.oo1.Ejercicio19_MercadoDeObjetos;

public class Contado extends Pago {
	
	@Override
	public double calcularPago(Producto producto) {
		return producto.getPrecio();
	}

}
