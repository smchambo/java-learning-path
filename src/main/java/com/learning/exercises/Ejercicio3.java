import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cantidadPares = 0;
        int cantidadImpares = 0;
        String continuar;

        System.out.println("=== Verificador de números par/impar ===");

        do {
            System.out.print("Ingresá un número entero: ");
            int numero = input.nextInt();
            input.nextLine(); // limpiar el buffer

            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
                cantidadPares++;
            } else {
                System.out.println(numero + " es impar");
                cantidadImpares++;
            }

            System.out.print("¿Querés ingresar otro número? Ingrese la letra  ' s ' para si y 'n ' para no  (s/n): ");
            continuar = input.nextLine().trim().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("\n=== Resumen ===");
        System.out.println("Números pares ingresados:   " + cantidadPares);
        System.out.println("Números impares ingresados: " + cantidadImpares);
        System.out.println("Total de números:           " + (cantidadPares + cantidadImpares));

        input.close();
    }
}