package com.company;

public class Virtual extends Recurso{
    private String url;

    public Virtual(double costo, String url) {
        super(costo);
        this.url = url;
    }
}
