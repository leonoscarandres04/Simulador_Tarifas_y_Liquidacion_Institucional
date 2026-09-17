package com.example.demo10.model;

public class Liquidacion {
    private double tarifaBase;
    private double descuento;
    private double impuesto;
    private double totalPagar;

    public Liquidacion(double tarifaBase, double descuento, double impuesto, double totalPagar) {
        this.tarifaBase = tarifaBase;
        this.descuento = descuento;
        this.impuesto = impuesto;
        this.totalPagar = totalPagar;
    }

    public double getTarifaBase() { return tarifaBase; }
    public double getDescuento() { return descuento; }
    public double getImpuesto() { return impuesto; }
    public double getTotalPagar() { return totalPagar; }

    @Override
    public String toString() {
        return String.format(
                "----- RESULTADO DE LIQUIDACIÓN INSTITUCIONAL -----%n" +
                        "Tarifa Base: $%,.2f%n" +
                        "Descuento Aplicado: -$%,.2f%n" +
                        "Impuesto Aplicado: +$%,.2f%n" +
                        "TOTAL A PAGAR: $%,.2f%n" +
                        "--------------------------------------------------",
                tarifaBase, descuento, impuesto, totalPagar
        );
    }
}