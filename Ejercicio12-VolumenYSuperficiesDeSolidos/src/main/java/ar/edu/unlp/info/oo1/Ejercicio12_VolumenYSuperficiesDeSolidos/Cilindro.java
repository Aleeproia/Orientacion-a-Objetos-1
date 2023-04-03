package ar.edu.unlp.info.oo1.Ejercicio12_VolumenYSuperficiesDeSolidos;

public class Cilindro extends Pieza{
	
	private int radio;
	private int altura;
	
	public Cilindro(String material, String color, int radio, int altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getVolumenCilindro() {
		return (Math.PI * Math.pow(this.radio, 2) * this.altura);
	}
	public double getSuperficieCilindro() {
		return 2 * Math.PI * this.radio * (this.altura+2)*Math.PI * Math.pow(this.radio, 2);
	}
	
	
	public double getVolumenDeMaterial(String nombreMaterial) {
		if(this.material.equals(nombreMaterial)) {
			return this.getVolumenCilindro();
		}
		return 0;
	}
	
	public double getSuperficieDeColor(String nombreColor) {
		if(this.color.equals(nombreColor)) {
			return this.getSuperficieCilindro();
		}
		return 0;
	}
}
