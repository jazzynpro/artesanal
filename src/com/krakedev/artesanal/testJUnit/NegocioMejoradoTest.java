package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class NegocioMejoradoTest {

	@Test
    public void testAgregarMaquinaExitoso() {
        // Explicación: Se prueba que al agregar una máquina a un directorio vacío,
        // el método retorne true indicando que fue guardada.
        // Resultado esperado: agregarMaquina(...) debe devolver true.
        
        NegocioMejorado negocio = new NegocioMejorado();
        
        boolean resultado = negocio.agregarMaquina("Pilsener", "Rubia", 0.04);
        
        assertTrue(resultado, "Debe retornar true cuando la máquina se agrega correctamente");
    }

    @Test
    public void testAgregarMaquinaDuplicada() {
        // Explicación: Simulamos el escenario donde el código generado ya existe en la lista
        // registrando previamente una máquina con un código fijo "M-50".
        // Resultado esperado: Al intentar validar con recuperarMaquina, debe retornar false.
        
        NegocioMejorado negocio = new NegocioMejorado();
        
        // 1. Preinsertamos una máquina con un código conocido "M-50"
        Maquina maquinaExistente = new Maquina("Club", "Negra", 0.05, "M-50");
        negocio.getMaquinas().add(maquinaExistente);
        
        // 2. Verificamos mediante recuperarMaquina que la validación detecta la máquina guardada
        Maquina encontrada = negocio.recuperarMaquina("M-50");
        
        // 3. Evaluamos si el código ya existe
        boolean esDuplicado = (encontrada != null);
        
        assertTrue(esDuplicado, "Debe detectar que el código de la máquina ya existe en la lista");}
}