package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	Matricula Estudiante1 = new Matricula(001,20);
    Recurso virtual = new Virtual(1200,"www.zoom.reunion1.com") ;
    Docente Pablo = new Docente(TITULOS.INGENIERO,1200);
    Recurso presencial = new Fisico(90,"Libro2");
    Curso Fisica = new Presencial("Fisica",15,500,"Lunes, Martes y Miercoles","512");
    Fisica.addRecurso(presencial);
    Fisica.addRecurso(virtual);
    Fisica.addDocente(Pablo);
        Estudiante1.calcularCosto();
    }
}
