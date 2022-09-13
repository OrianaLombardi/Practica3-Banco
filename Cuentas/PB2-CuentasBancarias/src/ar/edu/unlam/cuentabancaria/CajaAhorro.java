package ar.edu.unlam.cuentabancaria;

public class CajaAhorro extends Cuenta{
	private static final double VALOR_ADICIONAL = 6.0;
	private Integer cantidadExtracciones;

	public CajaAhorro(Integer numeroCuenta, Double saldo) {
		super(numeroCuenta, saldo);
		this.cantidadExtracciones = 0;
	}

	public Boolean extraerMonto(Double monto) {
		if(this.saldo > monto) {
			if (this.cantidadExtracciones<=5) {
				this.saldo-=monto;
				cantidadExtracciones++;
				return true;
			} else {
				this.saldo=this.saldo + monto +VALOR_ADICIONAL;
				return true;
			}
		} return false;
	}
	
	
	

}
