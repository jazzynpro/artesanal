package com.krakedev.artesanal;

public class Maquina {
	// Atributos
	private String nombreCerveza;
	private String descripcion;
	private double precioPorMl;
	private double capacidadMaxima;
	private double cantidadActual;

	// Constructores public y nombre de la clase
	public Maquina(String nombreCerveza, String descripcion, double precioPorMl, double capacidadMaxima) {
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcion;
		this.precioPorMl = precioPorMl;
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = 0;
	}

	// Constructores public y nombre de la clase
	public Maquina(String nombreCerveza, String descripcion, double precioPorMl) {
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcion;
		this.precioPorMl = precioPorMl;
		this.capacidadMaxima = 10000;
		this.cantidadActual = 0;
	}

	public String getNombreCerveza() {
		return nombreCerveza;
	}

	public void setNombreCerveza(String nombreCerveza) {
		this.nombreCerveza = nombreCerveza;
	}

	public String getDesripcion() {
		return descripcion;
	}

	public void setDesripcion(String desripcion) {
		this.descripcion = desripcion;
	}

	public double getPrecioPorMl() {
		return precioPorMl;
	}

	public void setPrecioPorMl(double precioPorMl) {
		this.precioPorMl = precioPorMl;
	}

	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}
	// quitamos el set de Capacidad maxima para solo definir un valor y que nadie lo
	// pueda modificar y destruir el sistema

	public double getCantidadActual() {
		return cantidadActual;
	}
	// quitamos el set de cantidad Aactual para que nadie pueda modificar

	// Metodo de Imprimir
	public void imprimir() {
		String mensaje;
		mensaje = "Nombre cerveza; " + nombreCerveza + " ,Descripcion: " + descripcion + " ,Precio por Ml: "
				+ precioPorMl + " ,Capacidad Máxima: " + capacidadMaxima + " ,Cantidad Actual: " + cantidadActual;
		System.out.println(mensaje);
	}

	// Metodo public que no retorna no recibe parametros
	public void llenarMaquina() {
		this.cantidadActual = this.capacidadMaxima - 100;
	}

	// Metodo recargar cerveza con un if
	public boolean recargarCerveza(double cantidad) {
		double limitePermitido = capacidadMaxima - 100;
		if(cantidadActual + cantidad <= limitePermitido) {
			cantidadActual = cantidadActual + cantidad;
			return true;
		}else {
			return false;
		}
	}
	//Metodo retorna el precio calculado de lo que se sirvio al usuario
	public double servirCerveza(double cantidad) {
		if(cantidadActual >= cantidad) {
			cantidadActual = cantidadActual - cantidad;
			
			//calcular lo que se le cobra al usuario
			double valor;
			valor = cantidad * precioPorMl; //cantidad de lo que pide * el precio
			return valor;
		}else {
			return 0;
		}
	}

}
