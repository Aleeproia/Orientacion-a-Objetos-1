package ar.edu.unlp.info.oo1.Ejercicio7_JerarquiaDeEmpleados;

public class Main {

	public static void main(String[] args) {
		
		/*Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		System.out.print(aportesDeAlan);*/
		
		Gerente alan = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		System.out.print(sueldoBasicoDeAlan);
	}

}
