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
    public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {
        // Generar el código dinámico invocando al método interno generarCodigo()
        String codigoGenerado = generarCodigo();
        
     //Validar si ya existe una máquina con ese código en la lista
        Maquina maquinaExistente = recuperarMaquina(codigoGenerado);
        
     //3. Si NO existe (recuperarMaquina devuelve null), se agrega la nueva máquina
        if (maquinaExistente == null) {
            Maquina nuevaMaquina = new Maquina(nombreCerveza, descripcion, precioPorMl, codigoGenerado);
            maquinas.add(nuevaMaquina);
            return true; // Retorna true indicando que fue agregada exitosamente
        } else {
            // Si ya existía, no se agrega
            return false; // Retorna false indicando duplicado
        }
    }
    
 //Metodo cargarMaquinas
    public void cargarMaquinas() {
        // Recorrer la lista de máquinas con un bucle for
        for (int i = 0; i < maquinas.size(); i++) {
            // Obtener la máquina actual en la posición i
            Maquina m = maquinas.get(i);
            
            // Invocar al método llenarMaquina() de la máquina recuperada
            m.llenarMaquina();
        }
    }
    
 //Metodo recuperarMaquina
 // Recibe el código de la máquina, recorre la lista y la retorna si coincide.
 // Si no la encuentra, retorna null.
 public Maquina recuperarMaquina(String codigo) {
     for (int i = 0; i < maquinas.size(); i++) {
         Maquina m = maquinas.get(i);
         // Comparación de Strings con .equals()
         if (m.getCodigo().equals(codigo)) {
             return m; // Retorna la máquina encontrada
         }
     }
     return null; // Si termina el bucle y no hubo coincidencia
 }
 

}
