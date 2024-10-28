package org.example.basics;

public class ForLoop {
    public static void main(String[] args) {
        //imprimir por consola los numeros de 5 a 10
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
        //imprimir por consola los numeros pares de 5 a 10
        for (int i = 5; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
