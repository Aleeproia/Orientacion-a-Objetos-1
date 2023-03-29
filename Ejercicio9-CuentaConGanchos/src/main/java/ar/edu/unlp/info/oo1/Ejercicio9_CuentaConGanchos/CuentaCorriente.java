package ar.edu.unlp.info.oo1.Ejercicio9_CuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	
	
	private double descubierto;
	
	
	public  CuentaCorriente() {
		this.descubierto=0;
	}
	
	
	public double getDescubierto() {
		return this.descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto=descubierto;
	}
	
	public boolean puedeExtraer(double monto){
		if((this.saldo + this.descubierto) >= monto) {
			this.setDescubierto((this.saldo + this.descubierto) - monto);
			return true;
		}
		return false;		
	}
	
	
	
	
}
