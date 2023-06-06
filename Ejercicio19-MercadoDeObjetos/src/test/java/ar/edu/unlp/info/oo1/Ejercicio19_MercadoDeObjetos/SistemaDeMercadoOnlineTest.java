package ar.edu.unlp.info.oo1.Ejercicio19_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SistemaDeMercadoOnlineTest {
	
	
	private SistemaDeMercadoOnline sistema;
	private Persona vendedor1,vendedor2,cliente1;
	private Producto producto1,producto2,producto3;
	
	
	@BeforeEach
	void setUp() {
		
		
		this.sistema = new SistemaDeMercadoOnline();
		
		this.vendedor1 =this.sistema.registrarPersona("Ale","la plata");
		this.vendedor2 =this.sistema.registrarPersona("Juli","quilmes");
		this.cliente1 =this.sistema.registrarPersona("Roxana","quilmesoeste");
		
		this.producto1 = this.sistema.ponerProductoAVenta("Silla","Linda",2500.0,5,vendedor1);
		this.producto2 = this.sistema.ponerProductoAVenta("Cama","Grande",10000.0,2,vendedor1);
		this.producto3 = this.sistema.ponerProductoAVenta("Silla","Chica",3000.0,2,vendedor2);
	}
	@Test
	public void registrarPersonasTest() {
		assertEquals(3,this.sistema.getPersonas().size());
		this.sistema.registrarPersona("lucia","niidea");
		assertEquals(4,this.sistema.getPersonas().size());
		
	}
	
   @Test 
   public void buscarPersonaTest() { 
	   assertEquals(vendedor1,this.sistema.buscarPersona("Ale"));
	   assertNull(this.sistema.buscarPersona("Ova"));
   }
   
   @Test
   public void retornarTotalProductosTest() {
	   assertEquals(2,this.sistema.retornarTotalProductos("Silla").size());
   }
   
   @Test
   public void crearPedidoTest() {
	   
   }
   
}
