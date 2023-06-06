package ar.edu.unlp.info.oo1.Ejercicio19_MercadoDeObjetos;

public class SeisCuotas extends Pago{
	
	@Override
	public double calcularPago(Producto producto) {
		double aumento=producto.getPrecio()*0.2;
		return (producto.getPrecio()+aumento);	
	}

}
