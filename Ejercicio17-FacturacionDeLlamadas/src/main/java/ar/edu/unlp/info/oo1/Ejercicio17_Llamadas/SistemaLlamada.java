package ar.edu.unlp.info.oo1.Ejercicio17_Llamadas;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class SistemaLlamada {
	
	private List<Integer> numeros;
	private List<Cliente> clientes;

	public SistemaLlamada() {
		this.numeros = new ArrayList<Integer>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void agregarNumeroTelefonico(int numero) {
		if(!numeros.contains(numero)) {
			this.numeros.add(numero);
		}
	}
	public boolean agregarPersonaFisica(String nombre,String direccion,int dni) {
		if (!numeros.isEmpty()) {
			int numeroOtorgado =numeros.get(0);
			numeros.remove(numeros.get(0));
			Cliente cliente= new PersonaFisica(nombre,direccion,numeroOtorgado,dni);
			this.clientes.add(cliente);	
			return true;
		}
		return false;
	}
    public boolean agregarPersonaJuridica(String nombre, String direccion,String cuit,String tipoPersona) {
    	if (!numeros.isEmpty()) {
			int numeroOtorgado =numeros.get(0);
			numeros.remove(numeros.get(0));
			Cliente cliente= new PersonaJuridica(nombre,direccion,numeroOtorgado,cuit,tipoPersona);
			this.clientes.add(cliente);	
			return true;
		}
		return false;
	}
    
    public Cliente identificarCliente(int numeroQueLlama) {
    	return this.clientes.stream().filter(c-> c.getNumero( )== numeroQueLlama).findFirst().orElse(null);
    }
    
    public Llamada registrarLlamadaLocal(LocalDate fecha,LocalTime horaComienzo,int duracionMinutos,int numeroQueLlama,int numeroTelQueRecibe) {
		Cliente cliente= this.identificarCliente(numeroQueLlama);
		return cliente.registrarLlamadaLocal(fecha, horaComienzo, duracionMinutos, numeroQueLlama, numeroTelQueRecibe);
	}
	
	public Llamada registrarLlamadaInterurbana(LocalDate fecha,LocalTime horaComienzo,int duracionMinutos,int numeroQueLlama,int numeroTelQueRecibe,int distanciaKmEntreLlamadas) {
		Cliente cliente= this.identificarCliente(numeroQueLlama);
		return cliente.registrarLlamadaInterurbana(fecha, horaComienzo, duracionMinutos, numeroQueLlama, numeroTelQueRecibe, distanciaKmEntreLlamadas);
	}
	public Llamada registrarLlamadaInternacional(LocalDate fecha,LocalTime horaComienzo,int duracionMinutos,int numeroQueLlama,int numeroTelQueRecibe,String paisOrigen,String paisDestino) {
		Cliente cliente= this.identificarCliente(numeroQueLlama);
		return cliente.registrarLlamadaInternacional(fecha, horaComienzo, duracionMinutos, numeroQueLlama, numeroTelQueRecibe, paisOrigen, paisDestino);
	}
	
	public Factura facturarLlamadas(LocalDate fechainicio,LocalDate fechafin,int num) {
		Cliente cliente = this.identificarCliente(num);
		return cliente.FacturarLlamadas(fechainicio, fechafin);
	}
    public List<Integer> getNumeros(){
    	return this.numeros;
    }
    
    public List<Cliente> getClientes(){
    	return this.clientes;
    }
    
    
    
    
    
}
