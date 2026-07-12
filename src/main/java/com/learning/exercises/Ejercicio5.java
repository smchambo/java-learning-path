package com.learning.exercises;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el número que desee para su respectiva tabla: ");
        int numero = input.nextInt();
       while(numero <1 || numero >10){
           System.out.print("El número debe estar entre 1 y 10. Ingresá de nuevo: ");
           numero = input.nextInt();
       }

        System.out.print("Rango inicial (escribe el numero por donde empieza la tabla, se sugiere a partir desde el valor 1 como el minimo en adelante  y despues presiona enter): ");
        int desde = input.nextInt();

        System.out.print("Rango final (escribe el numero por donde finalize la tabla teniendo en cuenta como maximo el valor 10 y despues presiona enter): ");
        int hasta = input.nextInt();

        imprimirTabla(numero, desde, hasta);

        input.close();
    }

    public static void imprimirTabla(int numero, int desde, int hasta) {
        for (int i = desde; i <= hasta; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}