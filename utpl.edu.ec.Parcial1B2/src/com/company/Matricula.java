package com.company;

import java.util.List;

public class Matricula {
    private int numero;
    private double descuento;
    private Curso curso;

    public Matricula(int numero, double descuento) {
        this.numero = numero;
        this.descuento = descuento;
        this.curso = curso;

        }
    public double calcularCosto(){
        double total = 0;
        for (var recurso :curso.getRecursos()){
            total+=recurso.getCosto();
        }
        total = total +curso.getDocente().getSueldo();
        total= total*(descuento/100);
        return total;
    }
    }



