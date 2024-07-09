package com.example.desafiomicalculadora.service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculadora {

    private final int n1;
    private final int n2;
    private final String op;
    private static final Map<String, BiFunction<Integer, Integer, Integer>> operaciones = new HashMap<>();

    static {
        operaciones.put("suma", Integer::sum);
        operaciones.put("resta", (a, b) -> a - b);
        operaciones.put("multiplicacion", (a, b) -> a * b);
        operaciones.put("division", (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("No se puede dividir por cero.");
            }
            return a / b;
        });
    }

    public Calculadora(int n1, int n2, String op) {
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
    }

    public int calcular() {
        BiFunction<Integer, Integer, Integer> operacion = operaciones.get(op);
        if (operacion == null) {
            throw new IllegalArgumentException("Operacion no soportada: " + op);
        }
        return operacion.apply(n1, n2);
    }
}
