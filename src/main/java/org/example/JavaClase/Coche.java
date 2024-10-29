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
        this.kilometraje = 0;
    }
    public void conducir(double km) {
        kilometraje += km;
    }
    public void mostrarInformacion() {
       // return marca + " " + modelo + " " + año + " " + kilometraje;
        System.out.println( "marca: " + marca + ", " + "modelo: " + modelo + ", " + "anyo: " + año + ", " + "kilometraje: " + kilometraje );

    }
}

