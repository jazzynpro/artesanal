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
    
    // Metodo generarCodigo return código tipo M-25 usar Math.random() del 1 al 100
    public String generarCodigo() {
        // Generar aleatorio entre 1 y 100
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        
        // Concatenar el M- con el número generado
        String codigoGenerado = "M-" + numeroAleatorio;
        return codigoGenerado;
    }
    
 //Metodo agregarMaquina
    public void agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {
        // Generar el código dinámico invocando al método interno generarCodigo()
        String codigoGenerado = generarCodigo();
        
        //Crear una nueva instancia de Maquina pasando los parámetros recibidos y el código generado
        Maquina nuevaMaquina = new Maquina(nombreCerveza, descripcion, precioPorMl, codigoGenerado);
        
        //Agregar el objeto Maquina a la lista 'maquinas'
        maquinas.add(nuevaMaquina);
    }
    
}
