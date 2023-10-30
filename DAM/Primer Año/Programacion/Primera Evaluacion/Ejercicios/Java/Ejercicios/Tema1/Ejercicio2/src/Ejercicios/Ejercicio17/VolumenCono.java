package Ejercicios.Ejercicio17;

import java.util.Scanner;

public class VolumenCono {
    public static void main(String[] args) {
        /**
         * Escribe un programa que calcule el volumen de un cono según la fórmula.
         * V =1/3π r2h
         *
         */
        double volumen, radio, altura;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el radio del cono o pulse 0 para salir: ");
            radio = teclado.nextDouble();
            if (radio == 0) {
                System.out.println("A salido correctamente");
                break;

            }
            System.out.println("Ingese la altura del cono: ");
            altura = teclado.nextDouble();

            volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;

            System.out.println("El volumen del cono es: " + volumen);
        }while (true);
    }
}