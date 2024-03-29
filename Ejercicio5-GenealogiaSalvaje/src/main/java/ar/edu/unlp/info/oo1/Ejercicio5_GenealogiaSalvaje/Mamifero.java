package ar.edu.unlp.info.oo1.Ejercicio5_GenealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero extends Object{
	
	private String identificador;
	private String especie;
	private LocalDate fechanacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String identificador) {
		this.identificador=identificador;
	}
	public Mamifero () {
		
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	
	public Mamifero getAbueloMaterno() {
		if(this.getMadre() != null) {
			if(this.getMadre().getPadre() != null) {
				return this.getMadre().getPadre();
			}
			else {
				return null;
			}
		}else {
			return null;
		}
		
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre() != null) {
			if(this.getMadre().getMadre() != null) {
				return this.getMadre().getMadre();
			}
			else {
				return null;
			}
		}else {
			return null;
		}
	}
	public Mamifero getAbueloPaterno() {
		if(this.getPadre() != null) {
			if(this.getPadre().getPadre() != null) {
				return this.getPadre().getPadre();
			}
			else {
				return null;
			}
		}else {
			return null;
		}
	}
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre() != null) {
			if(this.getPadre().getMadre() != null) {
				return this.getPadre().getMadre();
			}
			else {
				return null;
			}
		}else {
			return null;
		}
	}
	  
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean ok=false;
		if( unMamifero.equals(this.getMadre()) || unMamifero.equals(this.getPadre()) ) {
			return true;
		}
		else {
			if(this.getPadre() != null) {
				ok = this.getPadre().tieneComoAncestroA(unMamifero);
			}
			if((this.getMadre() != null)&&(ok== false)){
				ok = this.getMadre().tieneComoAncestroA(unMamifero);
			}
		}
		return ok;
	}

}
