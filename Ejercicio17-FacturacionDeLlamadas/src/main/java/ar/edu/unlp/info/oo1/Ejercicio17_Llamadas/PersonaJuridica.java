package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

public class PersonaJuridica extends Cliente {
	
	private String cuit;
	private String tipoPersona;


	public PersonaJuridica(String nombre, String direccion, int numero, String cuit, String tipoPersona) {
		super(nombre, direccion, numero);
		this.cuit = cuit;
		this.tipoPersona = tipoPersona;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}


}
