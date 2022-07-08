package com.company;

import java.util.List;

public class Presencial extends Curso{
    private String aula;

    public Presencial(String nombre, int numHoras, double costoBase, String horario, String aula) {
        super(nombre, numHoras, costoBase, horario);
        this.aula = aula;
    }
}
