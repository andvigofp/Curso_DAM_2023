package Ejercicios.Ejercicio14;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio14Switch {
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
                System.out.println("Programa finalizado.");
                break;
            }

            boolean esPar = esPar(numero);
            boolean esDivisibleEntre5 = esDivisibleEntre5(numero);

            String resultado = "";

            switch (esPar ? 1 : 0) {
                case 1:
                    resultado += "par ";
                case 0:
                    switch (esDivisibleEntre5 ? 1 : 0) {
                        case 1:
                            resultado += "divisible entre 5";
                            break;
                        case 0:
                            if (resultado.isEmpty()) {
                                resultado = "ni par ni divisible entre 5";
                            }
                            break;
                    }
                    break;
            }

            System.out.println("El número " + numero + " es " + resultado + ".");

        } while (true);

    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static boolean esDivisibleEntre5(int num) {
        return num % 5 == 0;
    }
}
