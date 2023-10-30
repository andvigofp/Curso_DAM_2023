package Ejercicios.Ejercicio14;

public class CadenaCaracteres {
    public static void main(String[] args) {
        /**
         * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
         * mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia de
         * Java (con un solo println) ¿ es posible ?.
         */

        /**
         * Sí, es posible mostrar variables de tipo char y String juntas en la misma línea y
         * con una sola sentencia System.out.println en Java utilizando la concatenación de cadenas.
         */
            //Variables tipo char y String
            char letra1, letra2;
            String nombre1, nombre2;
            letra1 = 'A';
            letra2 = 'B';
            nombre1 = "Angel";
            nombre2 = "Eduardo";
        //Imprime por pantalla
        System.out.println("La letra es: " + letra1 + "\tEl nombre : " + nombre1 + "\tLa letra: " + letra2+ "\t\tEl nombre: " + nombre2 );

    }
}
