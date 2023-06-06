package ar.edu.unlp.info.oo1.Ejercicio19_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	private SistemaDeMercadoOnline sistema;
	private Persona vendedor1,vendedor2,cliente1;
	private Producto producto1,producto2,producto3;
	private Pedido pedido;
	private Pago pago;
	private Envio envio;
	
	
	@BeforeEach
	void setUp() {
		
		
		this.sistema = new SistemaDeMercadoOnline();
		
		this.vendedor1 =this.sistema.registrarPersona("Ale","la plata");
		this.vendedor2 =this.sistema.registrarPersona("Juli","quilmes");
		this.cliente1 =this.sistema.registrarPersona("Roxana","quilmesoeste");
		
		this.producto1 = this.sistema.ponerProductoAVenta("Silla","Linda",2500.0,30,vendedor1);
		this.producto2 = this.sistema.ponerProductoAVenta("Cama","Grande",10000.0,2,vendedor1);
		this.producto3 = this.sistema.ponerProductoAVenta("Silla","Chica",3000.0,5,vendedor2);
		
		this.pago = new Contado();
		this.envio = new ExpresADomicilio();
	}
	
   
   @Test
   public void crearPedidoTest() {
	   this.pedido = this.cliente1.crearPedido(4,producto1,pago,envio);
	   System.out.print(this.cliente1.calcularCostoTotalDeUnPedido(pedido));
	   //assertEquals(3,this.cliente1.calcularCostoTotalDeUnPedido(pedido));
   }

}
