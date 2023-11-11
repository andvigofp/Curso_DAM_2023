package Ejercicios.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10Switch {
    /**
     *Escribe un programa que nos diga el horóscopo a partir del día y el mes de
     * nacimiento.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduce el día de nacimiento: ");
            int dia = teclado.nextInt();

            System.out.print("Introduce el mes de nacimiento (en número): ");
            int mes = teclado.nextInt();

            String horoscopo = determinarHoroscopo(dia, mes);
            System.out.println("Tu horóscopo es: " + horoscopo);

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            continuar = teclado.next();
        } while (!continuar.equals("0"));

        System.out.println("A salido correctamente.");
    }

    private static String determinarHoroscopo(int dia, int mes) {
        String horoscopo = "";

        switch (mes) {
            case 1:
                if (dia >= 21) {
                    horoscopo = "Acuario";
                } else {
                    horoscopo = "Capricornio";
                }
                break;
            case 2:
                if (dia >= 20) {
                    horoscopo = "Piscis";
                } else {
                    horoscopo = "Acuario";
                }
                break;
            // Continúa con los demás meses y signos del zodiaco
            // ...

            default:
                horoscopo = "Fecha no válida";
                break;
        }

        return horoscopo;
    }
}
