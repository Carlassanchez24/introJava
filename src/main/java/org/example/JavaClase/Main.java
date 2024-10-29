package org.example.JavaClase;

public class Main {
    public static void main(String[] args) {
    Coche coche1 = new Coche("Seat", "Ibiza", 2024 );

        coche1.mostrarInformacion();
        coche1.conducir(1000);
        coche1.mostrarInformacion();
    }
}
