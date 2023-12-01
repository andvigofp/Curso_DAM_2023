package Ejerciicos.Ejercicios13;

import java.util.Scanner;

public class OrednarTresNumerosIf {
    /**
     *Escribe un programa que ordene tres números enteros introducidos por teclado.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables
        int num1,num2,num3;

        // Solicitar tres números al usuario
        System.out.println("Introduce el primer número:");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número:");
        num2 = teclado.nextInt();

        System.out.println("Introduce el tercer número:");
        num3 = teclado.nextInt();

        // Ordenar los números
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                // num1 <= num2 <= num3
                System.out.println("Números ordenados: " + num1 + ", " + num2 + ", " + num3);
            } else {
                // num1 <= num3 < num2
                System.out.println("Números ordenados: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                // num2 <= num1 <= num3
                System.out.println("Números ordenados: " + num2 + ", " + num1 + ", " + num3);
            } else {
                // num2 <= num3 < num1
                System.out.println("Números ordenados: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                // num3 <= num1 <= num2
                System.out.println("Números ordenados: " + num3 + ", " + num1 + ", " + num2);
            } else {
                // num3 <= num2 < num1
                System.out.println("Números ordenados: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}

