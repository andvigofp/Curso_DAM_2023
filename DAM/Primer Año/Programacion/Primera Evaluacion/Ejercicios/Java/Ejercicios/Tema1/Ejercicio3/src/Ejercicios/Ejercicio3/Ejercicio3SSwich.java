package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3SSwich {
    /**
     * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
     * nombre del día de la semana.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contniuar;

        do {
            System.out.print("Por favor, introduce un número del 1 al 7: ");
            int numeroDia = teclado.nextInt();

            if (numeroDia == 0) {
                System.out.println("Saliendo del programa.");
                break;
            }

            String nombreDia = "";

            switch (numeroDia) {
                case 1:
                    nombreDia = "Lunes";
                    break;
                case 2:
                    nombreDia = "Martes";
                    break;
                case 3:
                    nombreDia = "Miércoles";
                    break;
                case 4:
                    nombreDia = "Jueves";
                    break;
                case 5:
                    nombreDia = "Viernes";
                    break;
                case 6:
                    nombreDia = "Sábado";
                    break;
                case 7:
                    nombreDia = "Domingo";
                    break;
                default:
                    System.out.println("Número no válido. Debe ser un número del 1 al 7.");
                    break;
            }

            System.out.println("El número " + numeroDia + " corresponde a " + nombreDia + ".");

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            contniuar = teclado.next();
        } while (!contniuar.equals("0"));
        System.out.println("A salido correctamente");
    }
}
