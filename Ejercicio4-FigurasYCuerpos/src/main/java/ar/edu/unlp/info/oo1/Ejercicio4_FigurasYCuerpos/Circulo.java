package ar.edu.unlp.info.oo1.Ejercicio4_FigurasYCuerpos;

public class Circulo extends Object implements Figura{


	private double radio;
	
	public double getDiametro() {
		return (this.radio *2);
	}

	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return (Math.PI * this.getDiametro());
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(radio, 2));
	}
}
