package com.company;

public class Fisico extends Recurso{
    private String ibsn;

    public Fisico(double costo, String ibsn) {
        super(costo);
        this.ibsn = ibsn;
    }

}
