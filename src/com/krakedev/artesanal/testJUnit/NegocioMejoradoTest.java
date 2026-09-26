package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class NegocioMejoradoTest {

    @Test
    public void testGenerarCodigoNoNulo() {
        // Explicación: Se prueba que el método generarCodigo() no devuelva una referencia nula.
        // Resultado esperado: El String retornado por generarCodigo() debe ser diferente de null.
        
        NegocioMejorado negocio = new NegocioMejorado();
        String codigo = negocio.generarCodigo();
        
        assertNotNull(codigo, "El código generado no debería ser null");
    }

    @Test
    public void testGenerarCodigoPrefijoCorrecto() {
        // Explicación: Se prueba que el código generado comience exactamente con el prefijo "M-".
        // Resultado esperado: La llamada a startsWith("M-") sobre el código generado debe ser verdadera (true).
        
        NegocioMejorado negocio = new NegocioMejorado();
        String codigo = negocio.generarCodigo();
        
        assertTrue(codigo.startsWith("M-"), "El código debe comenzar con el prefijo 'M-'");
    }

    @Test
    public void testGenerarCodigoLongitudValida() {
        // Explicación: Se prueba que el código generado tenga una longitud válida de caracteres (mínimo 3 caracteres, como "M-1").
        // Resultado esperado: La longitud del String retornado debe ser mayor o igual a 3.
        
        NegocioMejorado negocio = new NegocioMejorado();
        String codigo = negocio.generarCodigo();
        
        assertTrue(codigo.length() >= 3, "El código generado debe tener al menos 3 caracteres de longitud");
    }

    @Test
    public void testGenerarCodigoRangoNumero() {
        // Explicación: Se extrae la parte numérica del código (eliminando "M-") y se verifica que esté en el rango de 1 a 100.
        // Resultado esperado: El número entero obtenido debe ser >= 1 y <= 100.
        
        NegocioMejorado negocio = new NegocioMejorado();
        String codigo = negocio.generarCodigo();
        
        // Se remueve el prefijo "M-" para convertir la parte restante a un número entero
        String numeroTexto = codigo.substring(2);
        int numero = Integer.parseInt(numeroTexto);
        
        assertTrue(numero >= 1 && numero <= 100, "El número aleatorio del código debe estar entre 1 y 100");
    }
}