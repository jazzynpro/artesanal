package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestClientes {

	public static void main(String[] args) {
		//Instanciar la clase gestora del negocio
        NegocioMejorado negocio = new NegocioMejorado();
        
        System.out.println("Intentando registrar un cliente...");
        
        // Llamar al método registrarCliente
        // Esto provocará intencionalmente el java.lang.NullPointerException
        negocio.registrarCliente("Carlos Pérez", "1712345678");
        
        System.out.println("Cliente registrado con éxito"); // Esta línea NO se ejecutará

	}

}
