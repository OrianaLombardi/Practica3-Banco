package ar.edu.unlam.cuentabancaria;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(Integer numeroCuenta, Double saldo) {
		super(numeroCuenta, saldo);
		
	}

	public void extraer(Double monto) {
		//saldo = saldo-monto;
		if(monto>saldo) {
			//saldo negativo
			saldo = saldo-monto;
			Double porcentaje = saldo * (-1) * 0.05 ;
			saldo-=porcentaje;
		} else {
			//saldo positivo
			
		}
	}

}
