package com.learning.exercises;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = leerNumero(input, "Ingresa el primer número: ");
        int n2 = leerNumero(input, "Ingresa el segundo número: ");
        int n3 = leerNumero(input, "Ingresa el tercer número: ");

        System.out.println("El número mayor es " + obtenerMayor(n1, n2, n3));
        System.out.println("El número menor es " + obtenerMenor(n1, n2, n3));

        if (hayRepetidos(n1, n2, n3)) {
            System.out.println("Hay números repetidos.");
        }

        input.close();
    }

    public static int leerNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static int obtenerMayor(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }

    public static int obtenerMenor(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        if (b <= a && b <= c) return b;
        return c;
    }

    public static boolean hayRepetidos(int a, int b, int c) {
        return a == b || b == c || a == c;
    }
}