package Ejercicios.Ejercicio6;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio6Switch {
    /**
     *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una
     * altura h. Aplica la fórmula t = √2h g siendo g = 9.81m/s 2
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double g = 9.81; // Aceleración debido a la gravedad en m/s^2
        String continuar;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el tiempo de caída desde una altura de 10 metros.");
            System.out.println("2. Calcular el tiempo de caída desde una altura de 20 metros.");
            System.out.println("3. Calcular el tiempo de caída desde una altura de 30 metros.");
            System.out.print("Opción: ");
            int seleccion = teclado.nextInt();

            switch (seleccion) {
                case 1:
                    calcularTiempoCaida(10, g);
                    break;
                case 2:
                    calcularTiempoCaida(20, g);
                    break;
                case 3:
                    calcularTiempoCaida(30, g);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
           continuar = teclado.next();
        } while (!continuar.equals("0"));
        System.out.println("A salido correctamente");
    }

    private static void calcularTiempoCaida(double altura, double g) {
        double tiempo = Math.sqrt((2 * altura) / g);
        System.out.println("El tiempo de caída desde una altura de " + altura + " metros es de " + tiempo + " segundos.");
    }
}
