package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		//Instanciar
		Maquina rubia = new Maquina("Pilsener", "cerveza rubia", 0.02,10000);
		
		rubia.imprimir();
		rubia.setNombreCerveza("Golden Ale");
		rubia.setDesripcion("Cerveza con aroma mas intenso");
		rubia.imprimir();
		

	}

}
