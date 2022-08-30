package Ejercicio4;

public class Cuerpo3D {
	
	private double altura;
	private Figura caraBasal;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setCaraBasal(Figura figura) {
		this.caraBasal = figura;
	}
	private Figura getCaraBasal() {
		return caraBasal;
	}
	public double getVolumen() {
		return (this.getCaraBasal().getArea() * this.getAltura());
	}
	public double getSuperficieExterior() {
		return ( (2 * this.getCaraBasal().getArea()) + (this.getCaraBasal().getPerimetro() * this.getAltura()) );
	}

	
	
	

}
