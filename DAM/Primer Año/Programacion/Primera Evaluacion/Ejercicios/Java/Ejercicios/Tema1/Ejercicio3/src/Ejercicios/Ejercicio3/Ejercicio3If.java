package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3If {
    /**
     *Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
     * nombre del día de la semana.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Por favor, introduce un número del 1 al 7: ");
            int numeroDia = teclado.nextInt();

            String nombreDia = "";

            if (numeroDia == 1) {
                nombreDia = "Lunes";
            } else if (numeroDia == 2) {
                nombreDia = "Martes";
            } else if (numeroDia == 3) {
                nombreDia = "Miércoles";
            } else if (numeroDia == 4) {
                nombreDia = "Jueves";
            } else if (numeroDia == 5) {
                nombreDia = "Viernes";
            } else if (numeroDia == 6) {
                nombreDia = "Sábado";
            } else if (numeroDia == 7) {
                nombreDia = "Domingo";
            } else {
                System.out.println("Número no válido. Debe ser un número del 1 al 7.");
                break;
            }

            System.out.println("El número " + numeroDia + " corresponde a " + nombreDia + ".");

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            continuar = teclado.next();
        }while (!continuar.equals("0"));
        System.out.println("A salido correctamente");
    }
}

