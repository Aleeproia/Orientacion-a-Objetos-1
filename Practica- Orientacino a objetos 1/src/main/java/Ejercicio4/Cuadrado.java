package Ejercicio4;

public class Cuadrado extends Object implements Figura{
	
	private double lado;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getPerimetro() {
		return this.getLado()*4;
	}
	public double getArea() {
		return this.getLado()*this.getLado();
	}

	
}
