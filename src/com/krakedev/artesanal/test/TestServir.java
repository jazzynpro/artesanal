package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		Maquina rubia = new Maquina("Pilsener","Cerveza fria", 0.02, 8000);
		System.out.println("--------ESTADO INICIAL--------");
		rubia.imprimir();
		System.out.println("--------LLENANDO MAQUINA--------");
		rubia.llenarMaquina();
		rubia.imprimir();
		System.out.println("--------SERVIR 1000ML--------");
		double valor;
		valor= rubia.servirCerveza(1000);
		System.out.println("Valor a pagar " +valor);
		
		System.out.println("--------SERVIR 2000ML--------");
		double valor1;
		valor1= rubia.servirCerveza(2000);
		System.out.println("Valor a pagar " +valor1);
		
		rubia.imprimir();
		
		System.out.println("--------SERVIR 6000ML--------");
		double valor2;
		valor2= rubia.servirCerveza(6000);
		System.out.println("Valor a pagar " +valor2);
	}

}
