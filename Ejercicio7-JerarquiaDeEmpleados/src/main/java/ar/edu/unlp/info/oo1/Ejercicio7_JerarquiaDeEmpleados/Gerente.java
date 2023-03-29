package ar.edu.unlp.info.oo1.Ejercicio7_JerarquiaDeEmpleados;

public class Gerente extends EmpleadoJerarquico{
	
	
	public Gerente(String nombre) {
		super(nombre);
	}
	
	public double aportes() {
		return (this.montoBasico() * 0.05);
	}
	public double montoBasico() {
		return 57000;
	}

}
