package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorrreoConAdjuntos;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	
	private ClienteDeCorreo cliente;
	private Carpeta carpeta,carpeta2;
	private Email email1,email2,email3;
	private Archivo archivo1,archivo2,archivo3,archivo4;
	
	
	@BeforeEach
	void setUp() {
		this.cliente = new ClienteDeCorreo();
		
		this.carpeta = new Carpeta("carpeta1");
		this.carpeta2 = new Carpeta("carpeta2");
		
		this.email1 = new Email("Ale","Holaaa");
		this.email2 = new Email("Juli","Holaa");
		this.email3 = new Email("Ova","Hola");
		
		this.archivo1 = new Archivo("Ale");
		this.archivo2 = new Archivo("Juli");
		this.archivo3 = new Archivo("Ova");
		this.archivo4 = new Archivo("Marce");
		
		
		this.email1.agregarArchivo(archivo1);
		this.email1.agregarArchivo(archivo2);
		this.email2.agregarArchivo(archivo3);
		this.email3.agregarArchivo(archivo4);
		
		
		this.carpeta.agregarEmail(email1);
		this.carpeta.agregarEmail(email2);
		
		this.carpeta2.agregarEmail(email3);
		
	
		this.cliente.agregarCarpeta(carpeta);
		this.cliente.agregarCarpeta(carpeta2);
		
	}

	
	@Test 
	public void adjuntosTest() {
		assertEquals(2,this.email1.adjuntos().size());
		assertEquals(1,this.email2.adjuntos().size());
		assertEquals(1,this.email3.adjuntos().size());
	}
	
	@Test
	public void tamañoEmailTest() {
		assertEquals(16,this.email1.tamañoEmail());
	}
	
	@Test
	public void existeEmailTest() {
		assertTrue(this.email1.existeEmail("Holaaa"));
		assertTrue(this.email1.existeEmail("Ale"));
		assertFalse(this.email1.existeEmail("messi"));
	}
	
	@Test
	public void moverTest() {
		assertEquals(2,this.carpeta.getEmails().size());
		this.cliente.mover(email1, carpeta, carpeta2);
		assertEquals(1,this.carpeta.getEmails().size());
	}
	
	@Test
	public void buscarTest() {
		assertEquals(this.email2,this.cliente.buscar("Juli"));
		assertNull(this.cliente.buscar("lalala"));
	}
	
	@Test
	public void tamañoTest() {
		assertEquals(40,this.cliente.espacioOcupado());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
