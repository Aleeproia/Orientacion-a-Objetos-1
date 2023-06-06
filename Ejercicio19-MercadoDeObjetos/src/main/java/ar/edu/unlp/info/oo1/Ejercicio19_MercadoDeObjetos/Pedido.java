package ar.edu.unlp.info.oo1.Ejercicio19_MercadoDeObjetos;

public class Pedido {
	
	private int cantidadSolicidata;
	private Persona cliente;
	private Producto producto;
	private Pago formaDePago;
	private Envio formaDeEnvio;
	
	public Pedido(int cantidadSolicidata, Persona cliente, Producto producto, Pago formaDePago, Envio formaDeEnvio) {
		this.cantidadSolicidata = cantidadSolicidata;
		this.cliente = cliente;
		this.producto = producto;
		this.formaDePago = formaDePago;
		this.formaDeEnvio = formaDeEnvio;
	}

	public int getCantidadSolicidata() {
		return cantidadSolicidata;
	}

	public Persona getCliente() {
		return cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public Pago getFormaDePago() {
		return formaDePago;
	}

	public Envio getFormaDeEnvio() {
		return formaDeEnvio;
	}
	
	public double calcularCostoPedido() {
		
		return (this.cantidadSolicidata *this.formaDePago.calcularPago(this.producto)) + this.formaDeEnvio.calcularEnvio();
	}
	
	
}
