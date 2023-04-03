package ar.edu.unlp.info.oo1.Ejercicio12_VolumenYSuperficiesDeSolidos;

public class Esfera extends Pieza {
	
	
	private int radio;

	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	
	public double getVolumenEsfera() {
		return (4/3 *  Math.PI * Math.pow(this.radio, 3));
	}
	
	public double getSuperficieEsfera() {
		return (4 * Math.PI * Math.pow(this.radio, 2));
	}
	
	public double getVolumenDeMaterial(String nombreMaterial) {
		if(this.material.equals(nombreMaterial)) {
			return this.getVolumenEsfera();
		}
		return 0;
	}
	
	public double getSuperficieDeColor(String nombreColor) {
		if(this.color.equals(nombreColor)) {
			return this.getSuperficieEsfera();
		}
		return 0;
	}

}
