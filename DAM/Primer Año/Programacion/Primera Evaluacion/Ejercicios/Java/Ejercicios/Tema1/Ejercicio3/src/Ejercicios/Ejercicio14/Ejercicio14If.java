package Ejercicios.Ejercicio14;

import java.util.Scanner;

public class Ejercicio14If {
    /**
     *Realiza un programa que diga si un número introducido por teclado es par y/o
     * divisible entre 5.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = teclado.nextInt();

            if (numero == 0) {
                System.out.println("A salido correctamente.");
                break;
            }

            if (esPar(numero) && esDivisibleEntre5(numero)) {
                System.out.println("El número " + numero + " es par y divisible entre 5.");
            } else if (esPar(numero)) {
                System.out.println("El número " + numero + " es par pero no divisible entre 5.");
            } else if (esDivisibleEntre5(numero)) {
                System.out.println("El número " + numero + " no es par pero es divisible entre 5.");
            } else {
                System.out.println("El número " + numero + " no es par ni divisible entre 5.");
            }

        } while (true);

    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static boolean esDivisibleEntre5(int num) {
        return num % 5 == 0;
    }
}

