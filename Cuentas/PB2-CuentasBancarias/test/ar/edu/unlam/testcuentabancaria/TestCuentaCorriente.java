package ar.edu.unlam.testcuentabancaria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.cuentabancaria.CuentaCorriente;

public class TestCuentaCorriente {
	
	@Test
	public void queSepuedaIngresarDineroAlaCuenta() {
		//preparacion
		CuentaCorriente cuenta = new CuentaCorriente(1234,1000.0);
		assertTrue(cuenta.ingresarMonto(100.0));
	}
	@Test
	public void queNoSepuedaIngresarUnMontoNegativoAlaCuenta() {
		//preparacion
		CuentaCorriente cuenta = new CuentaCorriente(1234,1000.0);
		assertFalse(cuenta.ingresarMonto(-100.0));
	}

	@Test
	public void queAlRetirarMasDineroQueElSaldoTePermitaDeberleAlBancoElDinero() {
		//preparacion
		Double dineroEnCuenta=1000.0;
		Double monto=1100.0;
		Double deuda=-105.0;
		Double porcentaje = 0.05;
		Double porcentajePesos = 5.0;
		
		CuentaCorriente cuenta = new CuentaCorriente(1234,dineroEnCuenta);
		
		cuenta.extraer(monto);
		assertEquals(deuda,cuenta.getSaldo());
	}


}
