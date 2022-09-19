package Ejercicio7;

public class EmpleadoJerarquico extends Empleado{
	
	
	public EmpleadoJerarquico(String nombre) {
		super(nombre);
	}

	private double bonoPorCategoria;
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}

	public double getBonoPorCategoria() {
		return bonoPorCategoria;
	}

	public void setBonoPorCategoria(double bonoPorCategoria) {
		this.bonoPorCategoria = bonoPorCategoria;
	}
	

}
