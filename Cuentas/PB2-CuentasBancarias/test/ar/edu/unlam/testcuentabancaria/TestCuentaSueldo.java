package ar.edu.unlam.testcuentabancaria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.cuentabancaria.CuentaSueldo;



public class TestCuentaSueldo {
	private static final Double MONTO=500.00;
	
	@Test
	public void queSePuedaExtraerPlataDeLaCuentaSueldo() {
		
		//Preparacion
		CuentaSueldo cuenta= new CuentaSueldo(1234,1000.0);
		
		//Ejecucion
		cuenta.extraerMonto(500.00);
		
		//contrastacion
		assertEquals(MONTO, cuenta.getSaldo());
		
		
	}
	
	@Test
	public void queNoPermitaExtraerPlataDeLaCuentaSiElMontoEsMayorAlSaldo() {
		//preparacion
		CuentaSueldo cuenta= new CuentaSueldo(1234,1000.0);
		
		//Ejecucion
		//cuenta.extraerMonto(1500.00);
		
		//contrastacion
		assertFalse(cuenta.extraerMonto(1500.00));
	}
	
	@Test
	public void queSePuedaIngresarDineroALaCuentaSueldo() {
		//preparacion
		CuentaSueldo cuenta= new CuentaSueldo(1234,1000.0);
		
		//Ejecucion
		
		//contrastacion
		assertTrue(cuenta.ingresarMonto(1500.00));
	}
	
	@Test
	public void queNoSePuedaIngresarDineroALaCuentaSueldoSiEsUnMontoNegativo() {
		//preparacion
		CuentaSueldo cuenta= new CuentaSueldo(1234,1000.0);
		
		//Ejecucion
		
		//contrastacion
		assertFalse(cuenta.ingresarMonto(-1500.00));
	}
	

}
