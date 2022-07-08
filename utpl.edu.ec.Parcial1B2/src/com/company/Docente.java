package com.company;

public class Docente {
    private TITULOS titulos;
    private double sueldo;

    public Docente(TITULOS titulos, double sueldo) {
        this.titulos = titulos;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
}
