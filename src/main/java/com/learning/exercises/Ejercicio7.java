package com.learning.exercises;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = input.nextInt();
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }

    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false; // 0, 1 y negativos no son primos
        }

        if (n == 2) {
            return true; // único primo par
        }

        if (n % 2 == 0) {
            return false; // descartamos pares rápido
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}