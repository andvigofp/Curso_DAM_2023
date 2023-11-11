package Ejercicios.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7If {
    /**
     *Realiza un programa que calcule la media de tres notas
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        String continuar;

        do {
            System.out.print("Por favor, introduce la primera nota: ");
            nota1 = teclado.nextDouble();


            System.out.print("Por favor, introduce la segunda nota: ");
            nota2 = teclado.nextDouble();

            System.out.print("Por favor, introduce la tercera nota: ");
            nota3 = teclado.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("La media de las tres notas es: " + media);

            System.out.print("¿Deseas calcular la media de otras notas? (S/N): ");
            continuar = teclado.next();
        } while (continuar.equals("s") || continuar.equals("S"));
        System.out.println("A salido correctamente");
    }
}
