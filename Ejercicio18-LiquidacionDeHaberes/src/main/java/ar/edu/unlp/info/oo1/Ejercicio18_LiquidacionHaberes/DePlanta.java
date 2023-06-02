package ar.edu.unlp.info.oo1.Ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DePlanta extends Contrato{
	
	private double sueldoMensualAcordado;
	private double montoPorConguye;
	private double montoPorHijos;
	
	public DePlanta(LocalDate fechaInicio, double sueldoMensualAcordado, double montoPorConguye, double montoPorHijos,Empleado empleado) {
		super(fechaInicio,empleado);
		this.sueldoMensualAcordado = sueldoMensualAcordado;
		this.montoPorConguye = montoPorConguye;
		this.montoPorHijos = montoPorHijos;
	}

	public double getSueldoMensualAcordado() {
		return sueldoMensualAcordado;
	}

	public double getMontoPorConguye() {
		return montoPorConguye;
	}

	public double getMontoPorHijos() {
		return montoPorHijos;
	}
	public double calcularAntiguedad() {
		int cantanios= this.antiguedad();
		if(cantanios >= 5 && cantanios < 10) {
			return this.sueldoMensualAcordado * 0.3;
		}
		else {
			if(cantanios >=10 && cantanios < 15) {
				return this.sueldoMensualAcordado * 0.5;
				
			}
			else {
				if(cantanios >= 15 && cantanios < 20) {
					return this.sueldoMensualAcordado * 0.7;
				}
				else {
					if(cantanios >= 20) {
						return this.sueldoMensualAcordado * 1.0;
					}
					else {
						return 0;
					}
				}
			}
		}
	}
	
	public double calcularMonto() {
		if(this.getEmpleado().getConguye() == true && this.getEmpleado().getHijos() == true) {
			return this.sueldoMensualAcordado + this.montoPorConguye + this.montoPorHijos + this.calcularAntiguedad();
		}
		else {
			if(this.getEmpleado().getConguye() == true && this.getEmpleado().getHijos() == false) {
				return this.sueldoMensualAcordado + this.montoPorConguye + this.calcularAntiguedad();
			}
			else {
				if(this.getEmpleado().getConguye() == false && this.getEmpleado().getHijos() == true) {
					return this.sueldoMensualAcordado + this.montoPorHijos + this.calcularAntiguedad();
				}
				else {
					return this.sueldoMensualAcordado + this.calcularAntiguedad();
				}
			}
		}
		
	}
	@Override
	public boolean Vencido() {
		return false;
	}
	@Override
	public boolean Activo() {
		return true;
	}


}
