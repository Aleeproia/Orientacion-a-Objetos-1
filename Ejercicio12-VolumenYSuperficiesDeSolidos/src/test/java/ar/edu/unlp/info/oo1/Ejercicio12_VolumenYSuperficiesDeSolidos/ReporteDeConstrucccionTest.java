package ar.edu.unlp.info.oo1.Ejercicio12_VolumenYSuperficiesDeSolidos;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstrucccionTest {
	
	
	private ReporteDeConstruccion reporteConstruccion;
	private Cilindro cilindro1,cilindro2;
	private Esfera esfera1,esfera2;
	private PrismaRectangular prismaRectangular1,prismaRectangular2;
	
	
	
	@BeforeEach
	void setUp() {
		this.reporteConstruccion = new ReporteDeConstruccion();
		this.cilindro1 = new Cilindro("Hierro","Rojo",3,2);
		this.cilindro2=	new Cilindro("Plastico","Blanco",3,2);	
		this.esfera1 = new Esfera("Hierro","Azul",3);
		this.esfera2 = new Esfera("Acero","Negro",4);
		this.prismaRectangular1 = new PrismaRectangular("Tela","Amarillo",2,2,3);
		this.prismaRectangular2 = new PrismaRectangular("Hierro","Blanco",2,2,3);
		
		this.reporteConstruccion.agregarPieza(cilindro1);
		this.reporteConstruccion.agregarPieza(cilindro2);
		this.reporteConstruccion.agregarPieza(esfera1);
		this.reporteConstruccion.agregarPieza(esfera2);
		this.reporteConstruccion.agregarPieza(prismaRectangular1);
		this.reporteConstruccion.agregarPieza(prismaRectangular2);
	}
	
	@Test
	public void volumenDeMaterialTest() {
		assertEquals(6,this.reporteConstruccion.getPiezas().size());
		assertEquals(153.3716694115407,this.reporteConstruccion.volumenDeMaterial("Hierro"));
	}
	
	@Test
	public void superficieDeColorTest() {
		assertEquals(2163.834550635301,this.reporteConstruccion.superficieDeColor("Blanco"));
	}

}
