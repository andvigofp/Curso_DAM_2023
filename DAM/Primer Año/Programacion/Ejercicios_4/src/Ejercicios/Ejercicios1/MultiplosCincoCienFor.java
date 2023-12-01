package Ejercicios.Ejercicios1;

public class MultiplosCincoCienFor {
    /**
     * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for
     */
    public static void main(String[] args) {
        int numero;
        for (numero=0; numero<=100; numero++) {
            if (numero % 5==0) {
                System.out.println("Los múltiplos son: " + numero);
            }
        }

    }
}
