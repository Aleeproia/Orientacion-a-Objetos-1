package ar.edu.unlp.info.oo1.Ejercicio9_CuentaConGanchos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaCorrienteTest {
	
	
	private CuentaCorriente cuentaCorriente,cuentaCorriente2;
	
	
	@BeforeEach
	public void setUp() {
		
		this.cuentaCorriente = new CuentaCorriente();
		this.cuentaCorriente2= new CuentaCorriente();
		
		
	}
	
	@Test
	public void extraerTest() {
	    assertEquals(0,this.cuentaCorriente.getSaldo());
		this.cuentaCorriente.depositar(1000);
		assertEquals(1000,this.cuentaCorriente.getSaldo());
		this.cuentaCorriente.extraer(500);
		assertEquals(500,this.cuentaCorriente.getSaldo());
		this.cuentaCorriente.setDescubierto(500);
		assertTrue(this.cuentaCorriente.extraer(950));
		assertEquals(50,this.cuentaCorriente.getDescubierto());
	}

}
