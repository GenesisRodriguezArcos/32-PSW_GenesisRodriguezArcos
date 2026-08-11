package com.genesis.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PromedioTest {

    // ── calcularPromedio ──────────────────────────────────────────────

    @Test
    void probarCalcularPromedio_Caso1() {
        Promedio p = new Promedio();
        double resultado = p.calcularPromedio(15, 14, 16);
        assertEquals(15, resultado);
    }

    @Test
    void probarCalcularPromedio_Caso2() {
        Promedio p = new Promedio();
        double resultado = p.calcularPromedio(10, 12, 14);
        assertEquals(12, resultado);
    }

    @Test
    void probarCalcularPromedio_Caso3() {
        Promedio p = new Promedio();
        double resultado = p.calcularPromedio(20, 18, 16);
        assertEquals(18, resultado);
    }

    // ── estaAprobado ─────────────────────────────────────────────────

    @Test
    void probarEstaAprobado_Caso1() {
        Promedio p = new Promedio();
        boolean resultado = p.estaAprobado(15);
        assertTrue(resultado);
    }

    @Test
    void probarEstaAprobado_Caso2_Limite() {
        Promedio p = new Promedio();
        boolean resultado = p.estaAprobado(13);
        assertTrue(resultado); // límite exacto, debe aprobar
    }

    @Test
    void probarEstaAprobado_Caso3() {
        Promedio p = new Promedio();
        boolean resultado = p.estaAprobado(12);
        assertFalse(resultado);
    }

    @Test
    void probarEstaAprobado_Caso4() {
        Promedio p = new Promedio();
        boolean resultado = p.estaAprobado(5);
        assertFalse(resultado);
    }

    // ── Reto: octavo caso justificado ─────────────────────────────────
    // Se prueba con 12.9 para verificar que el sistema no redondea hacia arriba.
    // Aunque 12.9 está muy cerca de 13, NO debe ser aprobado.
    @Test
    void probarEstaAprobado_Caso8_Justificado() {
        Promedio p = new Promedio();
        boolean resultado = p.estaAprobado(12.9);
        assertFalse(resultado);
    }
}
