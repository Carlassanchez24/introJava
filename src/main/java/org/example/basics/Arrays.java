package org.example.basics;

public class Arrays {
    public static void main(String[] args) {
        //Definir  un array de 5 numeros (lleno)
        int[] numeros = {5, 7, 8, 9, 92};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


        //Definir un array de 5 nombres ciudades
        String[] nombres = {"Madrid", "Barcelona", "Lugo", "Burgos", "Zamora"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
//SOBRRECARGA DE MÉTODOS CONSTRUCTORES