package Ejercicios.Ejercicio18;

import java.util.Scanner;

public class PasarMegasKb {
    public static void main(String[] args) {
        /**
         * Realiza un conversor de Mb a Kb
         */
        double megabytes, kilobytes;
        Scanner teclado = new Scanner(System.in);
        megabytes = teclado.nextInt();
        System.out.print("Ingrese la cantidad en megabytes (MB): ");
        kilobytes = megabytes*1024;
        System.out.println("NB equivalen a " + kilobytes + " KB");
    }
}
