package ar.edu.unlam.cuentabancaria;

public class Cuenta {
	
	protected Integer numeroCuenta;
	protected Double saldo;
	
	
	public Cuenta(Integer numeroCuenta, Double saldo) {
		this.setNumeroCuenta(numeroCuenta);
		this.saldo=saldo;
	}
	
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Boolean ingresarMonto(Double monto) {
		if(monto>0) {
			this.saldo+=monto;
			return true;
		} return false;
	}


	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	

}
