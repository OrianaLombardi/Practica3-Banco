package ar.edu.unlam.cuentabancaria;

public class CuentaSueldo extends Cuenta {


	public CuentaSueldo(Integer numeroCuenta, Double saldo) {
		super(numeroCuenta, saldo);
		
	}

	public Boolean extraerMonto(Double monto) {
		if(this.saldo>monto) {
			this.saldo-=monto;
			return true;
		}
		return false;
	}

	
}
