package Ejercicios.Ejercicio15;

import java.util.Scanner;

public class Ejercicio15If {
    /**
     *Escribe un programa que pinte una pirámide rellena con un carácter introducido por
     * teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El
     * programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide
     * está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char caracter;
        int altura;
        int opcion;

        do {
            System.out.print("Introduce un carácter para la pirámide: ");
            caracter = teclado.next().charAt(0);

            System.out.print("Introduce la altura de la pirámide: ");
            altura = teclado.nextInt();

            System.out.println("Selecciona la dirección de la pirámide:");
            System.out.println("1. Vértice hacia arriba");
            System.out.println("2. Vértice hacia abajo");
            System.out.println("3. Vértice hacia la izquierda");
            System.out.println("4. Vértice hacia la derecha");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                piramideArriba(caracter, altura);
            } else if (opcion == 2) {
                piramideAbajo(caracter, altura);
            } else if (opcion == 3) {
                piramideIzquierda(caracter, altura);
            } else if (opcion == 4) {
                piramideDerecha(caracter, altura);
            } else {
                System.out.println("Opción no válida.");
            }

            System.out.print("¿Deseas pintar otra pirámide? (0 para salir, cualquier otro número para continuar): ");
            opcion = teclado.nextInt();
        } while (opcion != 0);

        System.out.println("A salido correctamente.");
        teclado.close();
    }

    // Métodos para pintar la pirámide en diferentes direcciones
    private static void piramideArriba(char caracter, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    private static void piramideAbajo(char caracter, int altura) {
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    private static void piramideIzquierda(char caracter, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    private static void piramideDerecha(char caracter, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= altura; k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}

