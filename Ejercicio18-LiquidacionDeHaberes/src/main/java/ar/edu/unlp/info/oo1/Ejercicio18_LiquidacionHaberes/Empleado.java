package ar.edu.unlp.info.oo1.Ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.util.*;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaNacimiento;
	private Boolean conguye;
	private Boolean hijos;
	private List<Contrato>contratos;
	
	
	public Empleado(String nombre, String apellido, String cuil, LocalDate fechaNacimiento, Boolean conguye,
			Boolean hijos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaNacimiento = fechaNacimiento;
		this.conguye = conguye;
		this.hijos = hijos;
		this.contratos = new ArrayList<Contrato>();
	}
	
	public Contrato cargarContratoPorHoras(LocalDate fechaInicio,double valorHoraAcordado,int cantidadHorasAcordado,LocalDate fechaFinContrato,Empleado empleado) {
		Contrato contrato = new PorHoras(fechaInicio, valorHoraAcordado, cantidadHorasAcordado, fechaFinContrato,this);
		this.contratos.add(contrato);
		return contrato;		
	}
	
	public Contrato cargarContratoDePlanta(LocalDate fechaInicio,double sueldoMensualAcordado,double montoPorConguye,double montoPorHijos,Empleado empleado) {
		Contrato contrato= new DePlanta(fechaInicio, sueldoMensualAcordado,montoPorConguye,montoPorHijos,this);
		this.contratos.add(contrato);
		return contrato;
	}
	
	public boolean existeEmpleado(String cuil) {
		return this.cuil.equals(cuil);
	}
	
	public Optional<Contrato> contratoMasReciente() {
		return this.contratos.stream().max((f1,f2)->f1.getFechaInicio().compareTo(f2.getFechaInicio()));
	}
	public boolean contratoVencido() {
		return this.contratoMasReciente().map(c-> c.Vencido()).orElse(true);
	}
	
	public boolean contratoActivo() {
		return this.contratoMasReciente().get().Activo();
	}
	public String getNombre() {
		return nombre;
	}
	
	public ReciboDeSueldo generarRecibo() {
		return new ReciboDeSueldo(this.nombre,this.apellido,this.cuil,this.contratoMasReciente().get().antiguedad(),LocalDate.now(),this.contratoMasReciente().get().calcularMonto());
	}
	
    

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCuil() {
		return cuil;
	}


	public void setCuil(String cuil) {
		this.cuil = cuil;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Boolean getConguye() {
		return conguye;
	}


	public void setConguye(Boolean conguye) {
		this.conguye = conguye;
	}


	public Boolean getHijos() {
		return hijos;
	}


	public void setHijos(Boolean hijos) {
		this.hijos = hijos;
	}
	
	
    
	
	
}
