package ar.edu.unlp.info.oo1.Ejercicio9_CuentaConGanchos;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	
	private Cuenta cuenta1,cuenta2;
	
	@BeforeEach
	public void setUp() {
		this.cuenta1 = new CajaDeAhorro();
		this.cuenta2= new CajaDeAhorro(); 
		
		this.cuenta1.depositar(500);
		this.cuenta2.depositar(500);
	}
	
	@Test
	public void testExtraer() {
		assertEquals(490,cuenta1.getSaldo());
		assertTrue(this.cuenta1.extraer(480));
		assertEquals(0.39999999999997726,cuenta1.getSaldo());
	}
	
	@Test
	public void testDepositar() {
		this.cuenta1.depositar(500);
		assertEquals(980,this.cuenta1.getSaldo());
	}
   @Test
	public void testTransferir() {
	    assertEquals(490,this.cuenta1.getSaldo());
		assertTrue(this.cuenta1.transferirACuenta(480,cuenta2));
		assertEquals(0.39999999999997726,this.cuenta1.getSaldo());
		assertEquals(969.808,this.cuenta2.getSaldo());
	}

}
