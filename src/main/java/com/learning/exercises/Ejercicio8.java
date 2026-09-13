package com.learning.exercises;

import java.util.Scanner;

 public class Ejercicio8 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de elementos que desea tener: ");
         int n = input.nextInt();
         int[] serie = generarFibonacci(n);
         System.out.println("La serie de fibonacci es: ");
         imprimirFibonacci(serie);
         System.out.println();
         System.out.println("Versión recursiva:");
         for (int i = 0; i < n; i++) {
             System.out.print(fibonacciRecursivo(i) + " ");
         }
         System.out.println();
     }


     public static int[] generarFibonacci(int n) {
         int[] serie = new int[n];
         for (int i = 0; i < n; i++) {
             if (i == 0) {
                 serie[i] = 0;
             } else if (i == 1) {
                 serie[i] = 1;
             } else {
                 serie[i] = serie[i - 1] + serie[i - 2];
             }
         }
         return serie;
     }

     public static void imprimirFibonacci(int[] serie) {

         for (int i = 0; i < serie.length; i++) {
             System.out.print(serie[i] + " ");

         }
     }

     public static int fibonacciRecursivo(int n) {
         if (n == 0) {
             return 0;
         }
         if (n == 1) {
             return 1;
         }
         return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
     }
 }

