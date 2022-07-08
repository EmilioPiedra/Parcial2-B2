package com.company;

import java.util.List;

public class Online extends Curso {
    private String salaID;

    public Online(String nombre, int numHoras, double costoBase, String horario, String salaID) {
        super(nombre, numHoras, costoBase, horario);
        this.salaID = salaID;
    }
}
