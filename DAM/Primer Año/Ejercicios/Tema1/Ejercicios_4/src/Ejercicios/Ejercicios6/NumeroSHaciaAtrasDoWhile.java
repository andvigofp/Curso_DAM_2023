package Ejercicios.Ejercicios6;

public class NumeroSHaciaAtrasDoWhile {
    public static void main(String[] args) {
        int numero=320;
        do {
            System.out.println(numero + "\t");
            numero-=20;
        }while (numero>=160);
    }
}
