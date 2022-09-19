package Ejercicio6;

import java.util.ArrayList;

import java.util.List;

public class Farola extends Object{
	
	private boolean estado;
	private List<Farola> farolas;
	
	public Farola() {
		this.farolas = new ArrayList<Farola>();
		this.estado = false;
		
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!this.farolas.contains(otraFarola)) {
			this.farolas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
		
		
	}
	public List<Farola> getNeighbors (){
		return this.farolas;
	}
	
	public void turnOn() {
		if(this.estado == false) {
			this.estado =true;
			farolas.stream().forEach(f -> f.turnOn());
		}
	}
	
	public void turnOff() {
		if(this.estado == true) {
			this.estado =false;
			farolas.stream().forEach(f -> f.turnOff());
		}
	}

	public boolean isOn() {
		if(this.estado ==true) {
			return true;
		}
		else {
			return false;
		}
	}

}
