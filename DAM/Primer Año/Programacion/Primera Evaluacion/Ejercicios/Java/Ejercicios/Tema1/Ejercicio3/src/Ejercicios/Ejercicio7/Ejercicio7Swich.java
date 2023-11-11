package Ejercicios.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7Swich {
    /**
     * Realiza un programa que calcule la media de tres notas
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Por favor, introduce las notas de las tres asignaturas: ");
            System.out.print("Nota de la primera asignatura: ");
            double nota1 = teclado.nextDouble();

            System.out.print("Nota de la segunda asignatura: ");
            double nota2 = teclado.nextDouble();

            System.out.print("Nota de la tercera asignatura: ");
            double nota3 = teclado.nextDouble();

            double media;

            System.out.print("Por favor, selecciona la operación (1 para media): ");
            int operacion = teclado.nextInt();

            switch (operacion) {
                case 1:
                    media = (nota1 + nota2 + nota3) / 3;
                    System.out.println("La media de las tres notas es: " + media);
                    break;
                default:
                    System.out.println("Operación no válida.");
            }

            System.out.print("¿Deseas realizar otra operación? (S/N): ");
            continuar= teclado.next();
        } while (continuar.equals("s") || continuar.equals("S"));

        System.out.println("A salido correctamente.");
    }
}