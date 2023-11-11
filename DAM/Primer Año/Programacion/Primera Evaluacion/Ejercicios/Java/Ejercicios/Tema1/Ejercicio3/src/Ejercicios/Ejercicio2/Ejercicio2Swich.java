package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2Swich {
    /**
     * Realiza un programa que pida una hora por teclado y que muestre luego buenos
     * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
     * 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los
     * minutos no se deben introducir por teclado.
     */
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int hora;
            String continuar;

            do {
                System.out.print("Por favor, introduce la hora (solo la parte de la hora, sin minutos): ");
                hora = teclado.nextInt();

                String saludo = "";

                switch (hora) {
                    case 6,7,8,9,10,11,12:
                        saludo = "Buenos días";
                        break;
                    case 13,14,15,16,17,18,19,20:
                        saludo = "Buenas tardes";
                        break;
                    default:
                        saludo = "Buenas noches";
                        break;
                }

                System.out.println(saludo);

                System.out.print("Pulsa 0 para salir o cualquier otra tecla para ingresar otra hora: ");
                continuar = teclado.next();
            } while (!continuar.equals("0"));
        System.out.println("A salido correctamente");
        }
    }