package Ejercicios.Ejercicios16;

import java.util.Scanner;

public class NumeroPrimosTecladoFor {
    public static void main(String[] args) {
        // Salida por teclado
        Scanner teclado = new Scanner(System.in);
        // variables
        int numero,i;
        boolean esPrimo;

        System.out.print("Ingrese un número para verificar si es primo: ");
        numero = teclado.nextInt();
        // Condición del si para determinar si ún número no es primo
        if (numero <= 1) {
            System.out.println(numero + " no es un número primo.");
        } else {
            esPrimo = true;

            for (i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
        ;
    }
}

