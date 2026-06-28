package com.learning.exercises;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = leerNombre(scanner);
        int edad = leerEdad(scanner);

        mostrarMensaje(nombre, edad);

        scanner.close();
    }

    public static String leerNombre(Scanner scanner) {
        System.out.print("Ingresa tu nombre: ");
        return scanner.nextLine();
    }

    public static int leerEdad(Scanner scanner) {
        int edad;
        while (true) {
            System.out.print("Ingresa tu edad: ");
            edad = scanner.nextInt();
            if (edad >= 0) {
                break;
            }
            System.out.println("La edad no puede ser negativa. Intentá de nuevo.");
        }
        return edad;
    }

    public static void mostrarMensaje(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
        System.out.println("En 10 años tendrás " + (edad + 10) + " años.");
    }
}