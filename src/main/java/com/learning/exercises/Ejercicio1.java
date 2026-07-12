package com.learning.exercises;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nombre = leerNombre(input);
        int edad = leerEdad(input);

        mostrarMensaje(nombre, edad);

        input.close();
    }

    public static String leerNombre(Scanner input) {
        System.out.print("Ingresa tu nombre: ");
        return input.nextLine();
    }

    public static int leerEdad(Scanner input) {
        int edad;
        do {
            System.out.print("Ingresa tu edad: ");
            edad = input.nextInt();
            if (edad >= 0) {
                break;
            }
            System.out.println("La edad no puede ser negativa. Intentá de nuevo.");
        } while ( edad <0);
        return edad;
    }

    public static void mostrarMensaje(String nombre, int edad) {
        System.out.println(String.format("Hola %s, tienes %d años.", nombre, edad));
        System.out.println(String.format("En 10 años tendrás %d años.", edad + 10));
    }
}