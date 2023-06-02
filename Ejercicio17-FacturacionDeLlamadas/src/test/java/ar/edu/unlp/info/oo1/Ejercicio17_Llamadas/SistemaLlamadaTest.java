package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaLlamadaTest {
	
	
	private SistemaLlamada sistema;
	private Cliente cliente;
	
	@BeforeEach
	void setUp() {
		
		this.sistema = new SistemaLlamada();
		this.sistema.agregarNumeroTelefonico(221437958);
		this.sistema.agregarNumeroTelefonico(221437928);
		this.sistema.agregarPersonaFisica("Ale","aeropuerto",43303584);
		this.sistema.agregarPersonaJuridica("Sodimac","porahi","20-54345-4","Sociedad Anonima");
		this.cliente = new Cliente();
		this.sistema.registrarLlamadaLocal(LocalDate.of(2023, 05, 20), LocalTime.MIDNIGHT, 10,221437958, 6454);
		this.sistema.registrarLlamadaInterurbana(LocalDate.of(2023,05,25),LocalTime.MIDNIGHT,10,221437958,6566, 5);
		this.sistema.registrarLlamadaInternacional(LocalDate.of(2023,05,28),LocalTime.of(21, 0), 10,221437928, 65656,"Argentina","Uruguay");
		
	}
	
	
	@Test
	public void agregarNumeroTest() {
		assertEquals(0,sistema.getNumeros().size());
		this.sistema.agregarNumeroTelefonico(221237958);
		assertEquals(1,sistema.getNumeros().size());
		this.sistema.agregarNumeroTelefonico(221237958);
		assertEquals(1,sistema.getNumeros().size());
		
		
	}
	
	@Test
	public void agregarClienteTest() {
		assertEquals(2,sistema.getClientes().size());
		
		
		
	}
	@Test
	public void facturarTest() {
		Factura factura = sistema.facturarLlamadas(LocalDate.of(2023, 05, 15), LocalDate.of(2023,06, 15),221437958);
		assertEquals(31,5,factura.getMontoTotal());
		Factura factura2 = sistema.facturarLlamadas(LocalDate.of(2023, 05, 15), LocalDate.of(2023,06, 15),221437928);
		assertEquals(30,factura2.getMontoTotal());
		
		
		
		
	}
	

}
