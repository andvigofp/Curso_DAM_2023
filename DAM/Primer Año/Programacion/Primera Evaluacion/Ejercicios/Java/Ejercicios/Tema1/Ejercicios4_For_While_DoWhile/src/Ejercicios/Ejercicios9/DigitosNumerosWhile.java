package Ejercicios.Ejercicios9;

import java.util.Scanner;

public class DigitosNumerosWhile {
    /**
     * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio
     * es equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba limitado a
     * números de 5 dígitos como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
     * esta manera, la única limitación en el número de dígitos la establece el tipo de dato que se utilice (int o
     * long)
     */
    public static void main(String[] args) {
        // Salida por teclado
        Scanner teclado = new Scanner(System.in);
        boolean esLong, esNegativo;
        long numero;
        int contadorDigitos=0;  // Inicializar el contador de dígitos
        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número: ");

        // Determinar el tipo de dato basado en la entrada del usuario
        esLong = teclado.hasNextLong();

        if (!esLong) {
            // Limpiar el buffer del scanner en caso de entrada no válida
            teclado.next();
        }

        // Obtener el número como int o long según el tipo de dato
        if (esLong) {
            numero = teclado.nextLong();
        } else {
            numero = teclado.nextInt();
        }

        // Validar si el número es negativo y ajustar el signo
        esNegativo = false;
        if (numero < 0) {
            esNegativo = true;
            numero = -numero;
        }


        // Bucle while para contar los dígitos
        while (numero > 0) {
            numero /= 10;
            contadorDigitos++;
        }

        // Mostrar el resultado
        if (esNegativo) {
            // Restar 1 al contador si el número es negativo
            contadorDigitos--;
        }

        // Mostrar el resultado basado en el tipo de dato
        System.out.println("El número ingresado tiene " + contadorDigitos + " dígitos.");
    }
}