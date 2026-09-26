package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
// Atributo maquinas del tipo ArrayList de Maquina
    private ArrayList<Maquina> maquinas;
    
// Inicializar el ArrayList en el constructor para evitar NullPointerException
    public NegocioMejorado() {
        this.maquinas = new ArrayList<Maquina>();
    }

 // Getters y Setters
    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }
    
    // Método generarCodigo return código tipo M-25 usar Math.random() del 1 al 100
    public String generarCodigo() {
        // Generar aleatorio entre 1 y 100
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        
        // Concatenar el M- con el número generado
        String codigoGenerado = "M-" + numeroAleatorio;
        return codigoGenerado;
    }
    
}
