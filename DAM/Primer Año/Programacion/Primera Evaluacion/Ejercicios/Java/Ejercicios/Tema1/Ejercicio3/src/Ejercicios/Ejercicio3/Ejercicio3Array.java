package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3Array {
    /**
     * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
     * nombre del día de la semana.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String continuar;

        do {
            System.out.print("Por favor, introduce un número del 1 al 7:");
            int numeroDia = teclado.nextInt();

            if (numeroDia >= 1 && numeroDia <= 7) {
                String nombreDia = diasSemana[numeroDia - 1];  // Restamos 1 para acceder al índice correcto del array
                System.out.println("El número " + numeroDia + " corresponde a " + nombreDia + ".");
            } else {
                System.out.println("Número no válido. Debe ser un número del 1 al 7.");
            }

            System.out.print("Pulsa 0 para salir o pulse otra tecla continuar: ");
            continuar = teclado.next();
        } while (!continuar.equals("0"));
        System.out.println("A salido correctamente");
    }
}

