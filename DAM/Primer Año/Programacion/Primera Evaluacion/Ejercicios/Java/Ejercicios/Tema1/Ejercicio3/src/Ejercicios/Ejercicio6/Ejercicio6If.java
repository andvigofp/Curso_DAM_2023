package Ejercicios.Ejercicio6;

import javax.swing.text.html.Option;
import java.util.Scanner;

public class Ejercicio6If {
    /**
     *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una
     * altura h. Aplica la fórmula t = √2h g siendo g = 9.81m/s 2
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double g,altura;
        g = 9.81; //Aceleración debido a la gravedad en m/s^2
        String continuar;

        do {
            System.out.println("Introduzca la altura desde la que caerá el objeto (en metros): ");
            altura = teclado.nextDouble();

            if (altura==0) {
                System.out.println("Saliendo del programa");
                break;
            }else if (altura<0) {
                System.out.println("La altura no puede ser negativa.");
            }

            double tiempo = Math.sqrt((2*altura)/g);
            System.out.println("El tiempo que tardará en caer el objeto desde una altura de " + altura + " metros es de " + tiempo + " segundos.");

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            continuar = teclado.next();
        }while (!continuar.equals("0"));
    }
}
