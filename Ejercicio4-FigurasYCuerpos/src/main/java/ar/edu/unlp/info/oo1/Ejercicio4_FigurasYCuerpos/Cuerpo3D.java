package ar.edu.unlp.info.oo1.Ejercicio4_FigurasYCuerpos;

public class Cuerpo3D extends Object {
	
	
	private double altura;
	private Figura carabasal;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(Figura figura) {
		this.carabasal = figura;
	}
	
	public double getVolumen() {
		return (this.carabasal.getArea() * this.getAltura());
	}
	
	public double getSuperficieExterior() {
		return ((2* this.carabasal.getArea())+(this.carabasal.getPerimetro() * this.getAltura()));
	}
	
}
