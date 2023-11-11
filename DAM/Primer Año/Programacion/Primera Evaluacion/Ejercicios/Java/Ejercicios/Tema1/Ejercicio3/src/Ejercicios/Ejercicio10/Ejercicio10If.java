package Ejercicios.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10If {
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

        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            horoscopo = "Acuario";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            horoscopo = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            horoscopo = "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            horoscopo = "Tauro";
        } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
            horoscopo = "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            horoscopo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
            horoscopo = "Leo";
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
            horoscopo = "Virgo";
        } else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) {
            horoscopo = "Libra";
        } else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) {
            horoscopo = "Escorpio";
        } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
            horoscopo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            horoscopo = "Capricornio";
        } else {
            horoscopo = "Fecha no válida";
        }

        return horoscopo;
    }
}

