package Ejercicios.Ejercicio5;

import java.util.Scanner;

public class Ejercico5Swich {
    /**
     * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
     * Ejemplo 1:
     * Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
     * Por favor, introduzca el valor de a: 2
     * Ahora introduzca el valor de b: 1
     * x = -0.5
     * Ejemplo 2:
     * Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
     * Por favor, introduzca el valor de a: 0
     * Ahora introduzca el valor de b: 7
     * Esa ecuación no tiene solución real
     */
         public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            do {
                System.out.print("Por favor, elige una opción:\n");
                System.out.println("1. Resolver ecuación");
                System.out.println("2. Salir");
                System.out.print("Opción: ");
                int opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Por favor, introduce el valor de 'a': ");
                        double a = teclado.nextDouble();

                        System.out.print("Por favor, introduce el valor de 'b': ");
                        double b = teclado.nextDouble();

                        if (a == 0) {
                            if (b == 0) {
                                System.out.println("La ecuación tiene infinitas soluciones.");
                            } else {
                                System.out.println("Esa ecuación no tiene solución real.");
                            }
                        } else {
                            double x = -b / a;
                            System.out.println("La solución de la ecuación " + a + "x + " + b + " = 0 es x = " + x);
                        }
                        break;

                    case 2:
                        System.out.println("Saliendo del programa.");
                        return;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

            } while (true);

        }
    }

