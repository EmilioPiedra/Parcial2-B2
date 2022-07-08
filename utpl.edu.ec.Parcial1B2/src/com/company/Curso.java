package com.company;

import java.util.List;

public  abstract class Curso {
    private String nombre;
    private int numHoras;
    private double costoBase;
    private String horario;
    private List<Recurso> recursos;
    private Docente docente;

    public Curso(String nombre, int numHoras, double costoBase, String horario) {
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.costoBase = costoBase;
        this.horario = horario;
        this.recursos = recursos;
        this.docente = docente;
    }


    public List<Recurso> getRecursos() {
        return recursos;
    }

    public Docente getDocente() {
        return docente;
    }

    public void addRecurso (Recurso recuros){
        getRecursos().add(recuros);
    }
    public void addDocente (Docente docente){
        addDocente(docente);
    }
}
