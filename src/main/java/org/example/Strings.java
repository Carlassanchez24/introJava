package org.example;

public class Strings {
    public static void main(String[] args) {
        String nombre = "Car";
        System.out.println(nombre);

        String nombrea = new String("Car");
        System.out.println(nombrea);

        System.out.println(nombre + "" + nombrea);

        String fullname = nombre + nombrea;
        System.out.println(fullname);
    }
}
