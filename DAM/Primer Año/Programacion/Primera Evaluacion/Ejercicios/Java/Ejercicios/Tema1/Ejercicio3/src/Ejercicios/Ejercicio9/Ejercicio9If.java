package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class Ejercicio9If {
    /**
     *Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 +
     * bx + c = 0).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduce el valor de 'a': ");
            double a = teclado.nextDouble();

            System.out.print("Introduce el valor de 'b': ");
            double b = teclado.nextDouble();

            System.out.print("Introduce el valor de 'c': ");
            double c = teclado.nextDouble();

            double discriminante = calcularDiscriminante(a, b, c);

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La solución única es: x = " + x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            continuar = teclado.next();
        } while (!continuar.equals("0"));

        System.out.println("A salido correctamente.");
    }

    private static double calcularDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}

