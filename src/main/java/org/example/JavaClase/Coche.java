package org.example.JavaClase;

public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private double kilometraje;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    public double conducir(double kilometraje) {
        return this.kilometraje += kilometraje;
    }
    public String mostrarInformacion() {
        return marca + " " + modelo + " " + año + " " + kilometraje;

    }
}

