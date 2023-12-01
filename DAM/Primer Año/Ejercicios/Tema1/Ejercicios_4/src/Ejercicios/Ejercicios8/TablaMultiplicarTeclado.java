package Ejercicios.Ejercicios8;

import java.util.Scanner;

public class TablaMultiplicarTeclado {
    public static void main(String[] args) {
        int numero,i, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número ");
        numero = teclado.nextInt();
        for (i =1; i<=10; i++) {
            resultado=i*numero;
            System.out.println(numero + " * " + i + " = " + resultado);
        }

    }
}
