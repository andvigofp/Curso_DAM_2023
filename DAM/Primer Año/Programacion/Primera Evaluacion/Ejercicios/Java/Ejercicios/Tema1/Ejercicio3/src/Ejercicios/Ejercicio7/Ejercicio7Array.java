package Ejercicios.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7Array {
    /**
     *Realiza un programa que calcule la media de tres notas
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Por favor, introduce las notas de las tres asignaturas: ");
            double[] notas = new double[3];

            for (int i = 0; i < 3; i++) {
                System.out.print("Nota de la asignatura " + (i + 1) + ": ");
                notas[i] = teclado.nextDouble();

            }

            double media = calcularMedia(notas);
            System.out.println("La media de las tres notas es: " + media);

            System.out.print("¿Deseas realizar otra operación? (S/N): ");
            continuar = teclado.next();
        } while (continuar.equals("s") || continuar.equals("S"));

        System.out.println("A saldio correctamente.");
    }

    private static double calcularMedia(double[] notas) {
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}

