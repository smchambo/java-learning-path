package com.learning.exercises;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = teclado.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        double num2 = teclado.nextDouble();

        double resultado;

        switch (operacion) {

            case '+':
                resultado = sumar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = restar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                } else {
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Operación no válida.");
        }

        teclado.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}