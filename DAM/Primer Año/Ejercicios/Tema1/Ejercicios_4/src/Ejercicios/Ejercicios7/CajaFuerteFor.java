package Ejercicios.Ejercicios7;

import java.util.Random;
import java.util.Scanner;

public class CajaFuerteFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int combinaciónCorrecta,intentos=4, intento;
        String pista;
        combinaciónCorrecta = new Random().nextInt(8999) + 1000;

        do {
            System.out.println("Introduece la combinación de la caja fuerte tienes 4 intentos");
            intento = teclado.nextInt();

            if (intento==combinaciónCorrecta) {
                System.out.println("La caja fuerete se ha abierto satisforiamente");
            }
            pista = (intento< combinaciónCorrecta) ? "Número demasiado bajo: Intenta un número más alto.":
                    "Número demasiado alto intenta con ún numero más bajo.";
            System.out.println(pista);

            System.out.println("Te quedan " + --intentos + " intentos");
        }while (intentos>0);

        if (intentos==0) {
            System.out.println("Se agotaron los intentos. La combianción correcta era: " + combinaciónCorrecta);
            System.out.println("La caja fuerte permanece cerrada.");
        }
    }
}
