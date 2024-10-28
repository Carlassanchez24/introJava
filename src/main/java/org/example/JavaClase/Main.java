package org.example.JavaClase;

import org.example.users.User;

public class Main {
    public static void main(String[] args) {
    Coche coche1 = new Coche("Seat", "Ibiza", 2024 );

        Coche[] cochazo = { coche1 };


        //utilizando algun bucle imprime los fullnames de 3 usuarios diferentes
        for (Coche coche : cochazo) {
            System.out.println(coche1.mostrarInformacion());
        }
        coche1.conducir(1000);

        System.out.println(coche1.mostrarInformacion());
    }
}
