package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class Ejercicio9Switch {
    /**
     *Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 +
     * bx + c = 0).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Elige los coeficientes de la ecuación:");
            System.out.print("a: ");
            double a = teclado.nextDouble();
            System.out.print("b: ");
            double b = teclado.nextDouble();
            System.out.print("c: ");
            double c = teclado.nextDouble();

            double discriminante = calcularDiscriminante(a, b, c);
            switch (obtenerTipoSolucion(discriminante)) {
                case 1:
                    double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
                    break;
                case 0:
                    double x = -b / (2 * a);
                    System.out.println("La solución única es: x = " + x);
                    break;
                case -1:
                    System.out.println("La ecuación no tiene soluciones reales.");
                    break;
            }

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            continuar = teclado.next();
        } while (!continuar.equals("0"));

        System.out.println("A salido correctamente.");
    }

    private static double calcularDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private static int obtenerTipoSolucion(double discriminante) {
        if (discriminante > 0) {
            return 1;
        } else if (discriminante == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}

