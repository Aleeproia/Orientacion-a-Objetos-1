package ar.edu.unlp.info.oo1.Ejercicio4_FigurasYCuerpos;

public class Cuadrado extends Object implements Figura {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
		
	public double getPerimetro() {
		return (this.lado+this.lado+this.lado+this.lado);
	}
	public double getArea() {
		return (this.lado * this.lado);
	}
}
