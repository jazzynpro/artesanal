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
    
}
