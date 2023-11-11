package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class  Ejercicio2If{
    /**
     * Realiza un programa que pida una hora por teclado y que muestre luego buenos
     * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
     * 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los
     * minutos no se deben introducir por teclado.
     *
     */
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int hora;
            String continuar;

            do {
                System.out.print("Por favor, introduce la hora (solo la parte de la hora, sin minutos): ");
                hora = teclado.nextInt();

                if (hora >= 6 && hora <= 12) {
                    System.out.println("Buenos días");
                } else if (hora >= 13 && hora <= 20) {
                    System.out.println("Buenas tardes");
                } else {
                    System.out.println("Buenas noches");
                }

                System.out.print("Pulsa 0 para salir o pulse una hora para continuar: ");
                continuar = teclado.next();
            } while (!continuar.equals("0"));
        System.out.println("A salido correctamente");
        }
    }
