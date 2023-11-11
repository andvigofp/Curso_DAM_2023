package Ejercicios.Ejercicio13;

import java.util.Scanner;

public class Ejercicio13If {
    /**
     *Escribe un programa que ordene tres números enteros introducidos por teclado.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;

        do {
            System.out.print("Introduce el primer número (0 para salir): ");
            num1 = teclado.nextInt();

            if (num1 == 0) {
                System.out.println("A salido correctamente.");
                break;
            }

            System.out.print("Introduce el segundo número: ");
            num2 = teclado.nextInt();

            System.out.print("Introduce el tercer número: ");
            num3 = teclado.nextInt();

            ordenarNumeros(num1, num2, num3);
            ordenarMayorAMenor(num1,num2,num3);
        } while (true);

    }

    public static void ordenarNumeros(int a, int b, int c) {
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

        System.out.println("Los números ordenados son: " + a + ", " + b + ", " + c);
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

