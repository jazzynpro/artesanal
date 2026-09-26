package com.krakedev.artesanal;

public class Cliente {
	// Atributos de la clase Cliente
    private String codigo;
    private String nombre;
    private String cedula;

    // Constructor que recibe codigo, nombre y cédula
    public Cliente(String codigo, String nombre, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Constructor vacio
    public Cliente() {
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
