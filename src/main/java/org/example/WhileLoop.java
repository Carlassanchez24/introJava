package org.example;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 10) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
