package ar.edu.unlam.testcuentabancaria;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.cuentabancaria.CajaAhorro;

public class TestCajaDeAhorro {

	@Test
	public void queSePuedaExtraerDineroDeLaCajaDeAhorro() {
		//Preparacion
		CajaAhorro cuenta= new CajaAhorro(1234,1000.0);
		
		//Ejecucion
		assertTrue(cuenta.extraerMonto(500.00));
	}
	
	@Test
	public void queNoSePuedaExtraerUnMontoMayorAlSaldo() {
		//Preparacion
		CajaAhorro cuenta= new CajaAhorro(1234,1000.0);
		
		//Ejecucion
		assertFalse(cuenta.extraerMonto(1900.00));
	}
	
	@Test
	public void queSePuedaDepositar() {
		//Preparacion
		CajaAhorro cuenta= new CajaAhorro(1234,1000.0);
		
		//Ejecucion
		assertTrue(cuenta.ingresarMonto(1900.00));

	} 
	
	@Test
	public void queNoSePuedaIngresarDineroALaCuentaSueldoSiEsUnMontoNegativo() {
		//preparacion
		CajaAhorro cuenta= new CajaAhorro(1234,1000.0);
		
		//Ejecucion
		
		//contrastacion
		assertFalse(cuenta.ingresarMonto(-1500.00));
	}
		
}
