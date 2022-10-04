package Ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {

	private List<Pieza>piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public double getVolumenDeMaterial(String nombreDeMaterial) {
		return piezas.stream().filter(Pieza -> Pieza.getMaterial().equals(nombreDeMaterial)).mapToDouble(v -> v.getVolumen()).sum();
	}
		
	
	
	public double getSuperficieDeColor(String unNombreDeColor){
		return piezas.stream().filter(Pieza -> Pieza.getColor().equals(unNombreDeColor)).mapToDouble(s -> s.getSuperficie()).sum();
	}

	public List<Pieza> getPiezas() {
		return piezas;
	}



}
