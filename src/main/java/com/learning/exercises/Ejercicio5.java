package com.learning.exercises;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número: ");
        int numero = scanner.nextInt();

        System.out.print("Rango inicial (Enter para 1): ");
        int desde = scanner.nextInt();

        System.out.print("Rango final (Enter para 10): ");
        int hasta = scanner.nextInt();

        imprimirTabla(numero, desde, hasta);

        scanner.close();
    }

    public static void imprimirTabla(int numero, int desde, int hasta) {
        for (int i = desde; i <= hasta; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}