package com.genesis.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescuentoTest {

    Descuento descuento = new Descuento();

    // Caso 1: precio=100, descuento=10% → esperado=90.0
    @Test
    public void testDescuento10Porciento() {
        double resultado = descuento.calcularPrecioFinal(100, 10);
        assertEquals(90.0, resultado, "100 con 10% de descuento debe dar 90.0");
    }

    // Caso 2: precio=200, descuento=20% → esperado=160.0
    @Test
    public void testDescuento20Porciento() {
        double resultado = descuento.calcularPrecioFinal(200, 20);
        assertEquals(160.0, resultado, "200 con 20% de descuento debe dar 160.0");
    }

    // Caso 3: precio=50, descuento=0% → esperado=50.0 (sin descuento, precio no cambia)
    @Test
    public void testDescuento0Porciento() {
        double resultado = descuento.calcularPrecioFinal(50, 0);
        assertEquals(50.0, resultado, "50 con 0% de descuento debe dar 50.0");
    }

    // Caso 4: precio=500, descuento=50% → esperado=250.0
    @Test
    public void testDescuento50Porciento() {
        double resultado = descuento.calcularPrecioFinal(500, 50);
        assertEquals(250.0, resultado, "500 con 50% de descuento debe dar 250.0");
    }

    // Caso 5 (elegido por mí): precio=300, descuento=100% → esperado=0.0
    @Test
    public void testDescuento100Porciento() {
        double resultado = descuento.calcularPrecioFinal(300, 100);
        assertEquals(0.0, resultado, "300 con 100% de descuento debe dar 0.0");
    }
}
