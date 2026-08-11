package com.genesis.testing;

public class Descuento {

    /**
     * Calcula el precio final después de aplicar un descuento porcentual.
     *
     * @param precio     precio original del producto
     * @param descuento  porcentaje de descuento a aplicar (ej. 10 = 10%)
     * @return precio final con el descuento aplicado
     */
    public double calcularPrecioFinal(double precio, double descuento) {
        return precio - (precio * descuento / 100);
    }
}
