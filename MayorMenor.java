package primer_Proyecto;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese el segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Ingrese el tercer valor:");
        int valor3 = scanner.nextInt();

        int mayor = valor1;
        int menor = valor1;

        if (valor2 > mayor) {
            mayor = valor2;
        }

        if (valor3 > mayor) {
            mayor = valor3;
        }

        if (valor2 < menor) {
            menor = valor2;
        }

        if (valor3 < menor) {
            menor = valor3;
        }

        System.out.println("El mayor valor ingresado es: " + mayor);
        System.out.println("El menor valor ingresado es: " + menor);
    }
}
