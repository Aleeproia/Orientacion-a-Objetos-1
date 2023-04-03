package ar.edu.unlp.info.oo1.Ejercicio12_VolumenYSuperficiesDeSolidos;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	
	
	private List<Pieza>piezas;
	
	public ReporteDeConstruccion() {
		this.piezas=new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
		
	}

	public List<Pieza> getPiezas() {
		return piezas;
	}

	public double volumenDeMaterial(String material) {
		return this.piezas.stream().mapToDouble(m -> m.getVolumenDeMaterial(material)).sum();
	}
	
	public double superficieDeColor(String color){
		return this.piezas.stream().mapToDouble(c -> c.getSuperficieDeColor(color)).sum();
	}
	
	

}
