package ar.edu.unlp.info.oo1.Ejercicio6_Farola;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private boolean estado;
	private List<Farola> vecinas;
	
	public Farola() {
		this.estado=false;
		this.vecinas = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!this.vecinas.contains(otraFarola)) {
			this.vecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors (){
		return this.vecinas;
	}
	
	public boolean isOn() {
		if(this.estado == true) {
			return true;
		}
		return false;
	}
	public void turnOn() {
		if(this.estado == false) {
			this.estado=true;
			this.vecinas.stream().forEach(e -> e.turnOn());
		}
	}
	
	public void turnOff() {
		if(this.estado == true) {
			this.estado=false;
			this.vecinas.stream().forEach(e -> e.turnOff());
		}
	}
	
	

}
