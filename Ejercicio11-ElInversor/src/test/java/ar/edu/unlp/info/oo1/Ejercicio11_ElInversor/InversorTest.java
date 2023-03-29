package ar.edu.unlp.info.oo1.Ejercicio11_ElInversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	
	private Inversor inversor;
	private Inversiones inversiones,inversiones2,inversiones3,inversiones4;
	
	
	@BeforeEach
	void setUp() {
		this.inversor = new Inversor("ale");
		this.inversiones = new PlazoFijo(LocalDate.of(2023, 3, 26),200,10);
		this.inversiones2 = new EnAcciones("nose",20,4);
		this.inversiones3= new PlazoFijo(LocalDate.of(2023, 3, 25),200,10);
		this.inversiones4 = new EnAcciones("algo",20,5);
		this.inversor.addInversion(inversiones);
		this.inversor.addInversion(inversiones2);
	}
	@Test
	public void testgetInversiones() {
		assertEquals(2,this.inversor.getInversiones().size());
	}
	
	@Test
	public void testgetValorTotal() {
		assertEquals(300,this.inversor.getValorTotal());
	}

}