package Ejercicios.Ejercicios16;

import java.util.Scanner;

public class NumerosPrimosTecladoDoWhile {
    public static void main(String[] args) {
        // Salida por teclado
        Scanner teclado = new Scanner(System.in);
        // Variables
        int numero, i;
        boolean esPrimo;

        System.out.print("Ingrese un número para verificar si es primo: ");
        numero = teclado.nextInt();
        // Condición del si para determinar si ún número no es primo
        if (numero <= 1) {
            System.out.println(numero + " no es un número primo.");
        } else {
            esPrimo = true;
            i = 2;

            while (i <= Math.sqrt(numero)) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
                i++;
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
    }
}
