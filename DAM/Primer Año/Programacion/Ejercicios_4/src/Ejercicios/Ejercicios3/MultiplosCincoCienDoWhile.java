package Ejercicios.Ejercicios3;

public class MultiplosCincoCienDoWhile {
    /**
     * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while
     */
    public static void main(String[] args) {
        int numero=0;
        do {
            if (numero %5==0) {
                System.out.println("Los múltiplos son: " + numero);
            }
            numero++;
        }while (numero<=100);
    }
}
