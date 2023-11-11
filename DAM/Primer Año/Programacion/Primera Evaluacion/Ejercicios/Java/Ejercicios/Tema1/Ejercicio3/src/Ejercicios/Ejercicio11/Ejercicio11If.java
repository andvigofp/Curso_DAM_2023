package Ejercicios.Ejercicio11;

import java.util.Scanner;

public class Ejercicio11If {
    /**
     *Escribe un programa que dada una hora determinada (horas y minutos), calcule los
     * segundos que faltan para llegar a la medianoche.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduce la hora (0-23): ");
            int horas = teclado.nextInt();

            System.out.print("Introduce los minutos (0-59): ");
            int minutos = teclado.nextInt();

            int segundosHastaMedianoche = calcularSegundosHastaMedianoche(horas, minutos);

            System.out.println("Faltan " + segundosHastaMedianoche + " segundos para llegar a medianoche.");

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            continuar = teclado.next();
        } while (!continuar.equals("0"));

        System.out.println("A salido correctamente.");
    }

    private static int calcularSegundosHastaMedianoche(int horas, int minutos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
            int segundosEnUnaHora = 3600;
            int segundosEnUnMinuto = 60;
            int segundosHastaMedianoche = (24 - horas) * segundosEnUnaHora - minutos * segundosEnUnMinuto;
            return segundosHastaMedianoche;
        } else {
            System.out.println("Hora o minutos no válidos. Deben estar en el rango 0-23 para horas y 0-59 para minutos.");
            return 0; // Valor predeterminado en caso de entrada no válida
        }
    }
}

