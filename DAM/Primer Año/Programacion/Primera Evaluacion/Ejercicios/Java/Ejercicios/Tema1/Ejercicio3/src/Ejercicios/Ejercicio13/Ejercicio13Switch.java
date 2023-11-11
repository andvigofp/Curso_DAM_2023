package Ejercicios.Ejercicio13;

import java.util.Scanner;

public class Ejercicio13Switch {
    public static void main(String[] args) {
        /**
         *Escribe un programa que ordene tres números enteros introducidos por teclado.
         */
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;
        int opcion;

        do {
            System.out.print("Introduce el primer número (0 para salir): ");
            num1 = teclado.nextInt();

            if (num1 == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.print("Introduce el segundo número: ");
            num2 = teclado.nextInt();

            System.out.print("Introduce el tercer número: ");
            num3 = teclado.nextInt();

            System.out.println("Selecciona cómo quieres ordenar los números:");
            System.out.println("1. De menor a mayor.");
            System.out.println("2. De mayor a menor.");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ordenarMenorAMayor(num1, num2, num3);
                    break;
                case 2:
                    ordenarMayorAMenor(num1, num2, num3);
                    break;
                case 0:
                    System.out.println("A salido correctamente.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

    }

    public static void ordenarMenorAMayor(int a, int b, int c) {
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Los números ordenados de menor a mayor son: " + a + ", " + b + ", " + c);
    }

    public static void ordenarMayorAMenor(int a, int b, int c) {
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Los números ordenados de mayor a menor son: " + a + ", " + b + ", " + c);
    }
}