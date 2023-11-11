package Ejercicios.Ejercicio8;

import java.util.Scanner;

public class Ejercicio8Switch {
    /**
     *Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente,
     * bien, notable o sobresaliente).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Introduce la primera nota:");
            double nota1 = teclado.nextDouble();
            System.out.println("Introduce la segunda nota:");
            double nota2 = teclado.nextDouble();
            System.out.println("Introduce la tercera nota:");
            double nota3 = teclado.nextDouble();

            double media = calcularMedia(nota1, nota2, nota3);
            String boletin = calcularBoletin(media);

            System.out.println("La media de las notas es: " + media);
            System.out.println("Calificación del boletín: " + boletin);

            System.out.print("¿Deseas realizar otra operación? (S/N): ");
            continuar = teclado.next();
        } while (continuar.equals("s") || continuar.equals("S"));

        System.out.println("A Salido correctamente.");
    }

    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    private static String calcularBoletin(double media) {
        if (media < 5.0) {
            return "Insuficiente";
        } else if (media < 6.0) {
            return "Suficiente";
        } else if (media < 7.0) {
            return "Bien";
        } else if (media < 9.0) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}

