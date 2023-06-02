package ar.edu.unlp.info.oo1.Ejercicio18_LiquidacionHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaHaberesTest {
	
	private SistemaHaberes sistema;
	private Empleado empleado,empleado2,empleado3,empleado4;
	private Optional<Contrato> contrato;
	private ReciboDeSueldo recibo,recibo2;
	
	
	@BeforeEach
	void setUp() {
		this.sistema=new SistemaHaberes();
		
		this.sistema.darDeAltaEmpleado("Ale","Proia","20-43303584-5",LocalDate.of(1995,05, 28),false,false);
		this.sistema.darDeAltaEmpleado("iara","nidea","niidea",LocalDate.of(2002,05, 27),false,false);
		this.sistema.darDeAltaEmpleado("julieta","proia","niidea2",LocalDate.of(2002,05, 27),false,false);
		this.sistema.darDeAltaEmpleado("marcelo","jerdz","niidea3",LocalDate.of(2002,05, 27),false,false);
		
		this.empleado = this.sistema.buscarEmpleado("20-43303584-5");
		this.empleado2 = this.sistema.buscarEmpleado("niidea");
		this.empleado3 = this.sistema.buscarEmpleado("niidea2");
		this.empleado4 = this.sistema.buscarEmpleado("niidea3");
		
		this.sistema.cargarContratoDePlanta(LocalDate.of(2023,05,10),500,100,100,empleado);
		this.sistema.cargarContratoDePlanta(LocalDate.of(2023,05,10),100,100,100,empleado2);
		this.sistema.cargarContratoPorHoras(LocalDate.of(2020,05,20),100,30,LocalDate.of(2021,05,20),empleado3);
		this.sistema.cargarContratoPorHoras(LocalDate.of(2020,04,20),10,30,LocalDate.of(2024,05,10),empleado4);
		
		
		
	}
	
	
	@Test
	public void darAltaEmpleadoTest() {
		assertEquals(4,sistema.getEmpleados().size());
	}
	
	@Test
	public void buscarEmpleadoTest() {
		assertEquals(empleado,this.sistema.buscarEmpleado("20-43303584-5"));	
	}
	
	
	@Test
	public void darDeBajaTest() {
		assertTrue(this.sistema.darDeBajaEmpleado(empleado));
		assertEquals(3,this.sistema.getEmpleados().size());
	}
	
	@Test
	public void obtenerEmpleadosContratosVencidosTest() {
		this.contrato = this.empleado.contratoMasReciente();
		assertEquals(1,empleado.getContratos().size());
		assertEquals(this.empleado.contratoMasReciente(),contrato);
		assertEquals(1,this.sistema.obtenerEmpleadosContratosVencidos().size());
	}
	
	@Test
	public void obtenerRecibosDeSueldoTest() {
		assertEquals(3,this.sistema.obtenerRecibosDeSueldo().size());
		this.recibo = this.sistema.obtenerRecibosDeSueldo().get(0);
		this.recibo2 = this.sistema.obtenerRecibosDeSueldo().get(2);
		assertEquals(500,this.recibo.getMontoTotal());
		assertEquals(300,this.recibo2.getMontoTotal());
	}
	
	
	
	
}
