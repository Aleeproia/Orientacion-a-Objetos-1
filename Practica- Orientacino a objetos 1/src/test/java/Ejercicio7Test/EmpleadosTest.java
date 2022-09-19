package Ejercicio7Test;

import Ejercicio7.*;

public class EmpleadosTest {

	public static void main(String[] args) {
		
		
		Gerente alan = new Gerente("Alan Turing");
		
		double aportesDeAlan = alan.aportes();
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		
		System.out.println(aportesDeAlan);
		System.out.println(sueldoBasicoDeAlan);

	}

}
