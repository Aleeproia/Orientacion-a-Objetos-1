package ar.edu.unlp.info.oo1.Ejercicio9_CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	
	private double costoAdicional;
	
	
	
	public double getCostoAdicional() {
		return this.costoAdicional;
	}
	public CajaDeAhorro() {
		this.costoAdicional=2;
	}
	
	public double getDescuento(double monto) {
		return ((monto*this.costoAdicional)/100);
	}
	
	public boolean puedeExtraer(double monto) {
		if((this.saldo - monto) >= 0) {
			return true;
		}
		return false;
	}
	
	public boolean extraer(double monto) {
		return super.extraer(monto+getDescuento(monto));
	}
	
	public void depositar(double monto) {
		super.depositar(monto - getDescuento(monto));
	}
	
	public boolean transferirACuenta(double monto,Cuenta cuentaDestino) {
		return super.transferirACuenta((monto + getDescuento(monto)), cuentaDestino);
	}
	
	
	

}
