package Ejercicios.Ejercicios4;

public class NumerosHaciaAtrasFor {
    /**
     *Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando el bucle fo
     */
    public static void main(String[] args) {
        int numero;
        for (numero=320; numero>=160; numero-=20) {
            System.out.println(numero +"\t");
        }
    }
}
