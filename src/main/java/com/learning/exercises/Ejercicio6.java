package com.learning.exercises;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = leerNumeroValido(input);

        // Solución iterativa
        long inicioIterativo = System.nanoTime();
        long resultadoIterativo = factorialIterativo(numero);
        long finIterativo = System.nanoTime();

        // Solución recursiva
        long inicioRecursivo = System.nanoTime();
        long resultadoRecursivo = factorialRecursivo(numero);
        long finRecursivo = System.nanoTime();

        //Mostrar resultados
        System.out.println("\n=== Resultados ===");
        System.out.println("Factorial (iterativo): " + resultadoIterativo);
        System.out.println("Factorial (recursivo): " + resultadoRecursivo);

        //Comparación
        if (resultadoIterativo == resultadoRecursivo) {
            System.out.println("✅ Ambos métodos coinciden.");
        } else {
            System.out.println("⚠️ Los resultados NO coinciden.");
        }

        // Bonus: tiempos de ejecución
        System.out.println("\n=== Tiempos de ejecución ===");
        System.out.println("Iterativo: " + (finIterativo - inicioIterativo) + " ns");
        System.out.println("Recursivo: " + (finRecursivo - inicioRecursivo) + " ns");

        input.close();
    }

    // Lee un número y valida que sea entero, positivo (0 en adelante)
    public static int leerNumeroValido(Scanner input) {
        int numero = -1;
        boolean valido = false;

        while (!valido) {
            System.out.print("Ingresá un número entero positivo para calcular su factorial: ");
            if (input.hasNextInt()) {
                numero = input.nextInt();
                if (numero >= 0) {
                    valido = true;
                } else {
                    System.out.println("El número no puede ser negativo. Intentá de nuevo.");
                }
            } else {
                System.out.println("Eso no es un número entero válido. Intentá de nuevo.");
                input.next(); // descarta la entrada inválida
            }
        }
        return numero;
    }

    // Solución iterativa: usa un bucle for
    public static long factorialIterativo(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Solución recursiva: el método se llama a sí mismo
    public static long factorialRecursivo(int n) {
        if (n <= 1) {
            return 1; // caso base
        }
        return n * factorialRecursivo(n - 1); // caso recursivo
    }
}