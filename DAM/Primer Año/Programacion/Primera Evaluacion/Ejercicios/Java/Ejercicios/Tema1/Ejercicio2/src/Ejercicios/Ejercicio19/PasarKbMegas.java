package Ejercicios.Ejercicio19;

import java.util.Scanner;

public class PasarKbMegas {
    public static void main(String[] args) {
        /**
         * Realiza un conversor de KB a MB
         */
        double megabytes, kilobytes;
        Scanner teclado = new Scanner(System.in);
        kilobytes = teclado.nextInt();
        System.out.print("Ingrese la cantidad en Kiobytes (KB): ");
        megabytes = kilobytes/1024;
        System.out.println("KB equivalen a " + megabytes + " MB");
    }
}
