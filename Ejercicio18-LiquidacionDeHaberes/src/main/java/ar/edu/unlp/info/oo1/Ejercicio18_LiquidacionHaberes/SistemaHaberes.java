package ar.edu.unlp.info.oo1.Ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class SistemaHaberes {
	
	private List<Empleado>empleados;
	
	public SistemaHaberes() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void darDeAltaEmpleado(String nombre,String apellido,String cuil,LocalDate fechaNacimiento,Boolean conguye,Boolean hijos) {
		Empleado empleado = new Empleado(nombre,apellido,cuil,fechaNacimiento,conguye,hijos);
		this.empleados.add(empleado);
	}
	
	public Empleado buscarEmpleado(String cuil) {
		return this.empleados.stream().filter(e -> e.existeEmpleado(cuil)).findFirst().orElse(null);
		
	}
	
	public boolean darDeBajaEmpleado(Empleado empleado) {
		return this.empleados.remove(empleado);
	}
	
	public Contrato cargarContratoPorHoras(LocalDate fechaInicio,double valorHoraAcordado,int cantidadHorasAcordado,LocalDate fechaFinContrato,Empleado empleado) {
		return empleado.cargarContratoPorHoras(fechaInicio,valorHoraAcordado,cantidadHorasAcordado,fechaFinContrato,empleado);		
	}
	
	public Contrato cargarContratoDePlanta(LocalDate fechaInicio,double sueldoMensualAcordado,double montoPorConguye,double montoPorHijos,Empleado empleado) {
		return empleado.cargarContratoDePlanta(fechaInicio, sueldoMensualAcordado, montoPorConguye, montoPorHijos, empleado);
	}
	
	
	public List<Empleado> obtenerEmpleadosContratosVencidos(){
		 return this.empleados.stream().filter(e -> e.contratoVencido()).collect(Collectors.toList());
	}
	
	
	public List<ReciboDeSueldo> obtenerRecibosDeSueldo(){
		  return this.empleados.stream().filter(e ->e.contratoActivo()).map(e -> e.generarRecibo()).collect(Collectors.toList());
	}
}
