package com.example.demo10.service;

import com.example.demo10.model.Liquidacion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LiquidacionService {

    @Value("${simulador.tarifa.base}")
    private double tarifaBase;

    @Value("${simulador.descuento.porcentaje}")
    private double porcentajeDescuento;

    @Value("${simulador.impuesto.porcentaje}")
    private double porcentajeImpuesto;

    public Liquidacion calcularLiquidacion(int numeroCreditos) {
        double subtotalBase = tarifaBase * numeroCreditos;
        double valorDescuento = subtotalBase * porcentajeDescuento;
        double baseImponible = subtotalBase - valorDescuento;
        double valorImpuesto = baseImponible * porcentajeImpuesto;
        double total = baseImponible + valorImpuesto;

        return new Liquidacion(subtotalBase, valorDescuento, valorImpuesto, total);
    }
}