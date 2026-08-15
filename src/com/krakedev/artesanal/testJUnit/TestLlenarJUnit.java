package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestLlenarJUnit {
	//Instanciar una Maquina
	@Test
	public void testLlenarMaquina() {
		Maquina rubia = new Maquina("Pilsener", "Cerveza", 0.02, 8000,12.00);
	//Llamar metodo para testear
		rubia.llenarMaquina();
		
		assertEquals(7900, rubia.getCantidadActual(), 0.0001);
	}
}
