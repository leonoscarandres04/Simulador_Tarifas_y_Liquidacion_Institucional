package com.example.demo10.runner;

import com.example.demo10.service.LiquidacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimuladorRunner implements CommandLineRunner {

    private final LiquidacionService liquidacionService;

    @Autowired
    public SimuladorRunner(LiquidacionService liquidacionService) {
        this.liquidacionService = liquidacionService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n>>> INICIANDO SIMULADOR DE TARIFAS <<<");

        int creditosMatriculados = 5;
        var resultado = liquidacionService.calcularLiquidacion(creditosMatriculados);

        System.out.println(resultado);
        System.out.println(">>> LIQUIDACIÓN COMPLETADA CON ÉXITO <<<\n");
    }
}