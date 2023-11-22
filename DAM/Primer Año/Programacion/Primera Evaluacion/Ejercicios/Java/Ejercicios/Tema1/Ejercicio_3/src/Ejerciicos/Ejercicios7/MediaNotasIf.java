package Ejerciicos.Ejercicios7;

import java.util.Scanner;

public class MediaNotasIf {
    /**
     *Realiza un programa que calcule la media de tres notas
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        double nota1, nota2, nota3, media;

        // Solicitar las notas al usuario
        System.out.print("Introduce la primera nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        nota3 = teclado.nextDouble();

        // Verificar que las notas estén en el rango de 0 a 10
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
            // Calcular la media de las notas
            media = (nota1 + nota2 + nota3) / 3;

            // Mostrar el resultado
            System.out.println("La media de las notas es: " + media);
        } else {
            // Mensaje en caso de notas fuera de rango
            System.out.println("Datos no válidos. Por favor, introduce notas en el rango de 0 a 10.");
        }
    }
}
