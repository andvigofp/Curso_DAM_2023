package Ejercicios.Ejercicio12;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio12Switch {
    /**
     *Realiza un mini cuestionario con 10 preguntas tipo test sobre las asignaturas que se
     * imparten en el curso. Cada pregunta acertada sumará un punto. El programa
     * mostrará al final la calificación obtenida. Pásale el mini cuestionario a tus
     * compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las
     * diferentes asignaturas del curso.
     */
    public class MiniCuestionarioConSwitch {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int calificacion = 0;
            String respuesta;

            System.out.println("¡Bienvenido al mini cuestionario!");
            System.out.println("Responde a las siguientes preguntas con 'a', 'b', o 'c'.");
            System.out.println("Para salir, ingresa '0' en cualquier momento.");

            while (true) {
                System.out.println("Elige una pregunta del 1 al 10 (o ingresa 0 para salir): ");
                int pregunta = teclado.nextInt();

                if (pregunta == 0) {
                    System.out.println("Cuestionario finalizado.");
                    break;
                }

                switch (pregunta) {
                    case 1:
                        System.out.println("¿Cuál es la capital de Francia?");
                        System.out.println("a) París");
                        System.out.println("b) Londres");
                        System.out.println("c) Madrid");
                        break;
                    // Agrega más casos para otras preguntas aquí

                    default:
                        System.out.println("Pregunta no válida.");
                        continue; // Salta al siguiente ciclo del bucle
                }

                System.out.print("Tu respuesta: ");
                respuesta = quitarAcentos(teclado.nextLine().toLowerCase());

                switch (respuesta) {
                    case "a":
                        System.out.println("¡Respuesta correcta!\n");
                        calificacion++;
                        break;
                    case "0":
                        System.out.println("Cuestionario finalizado.");
                        break;
                    default:
                        System.out.println("Respuesta incorrecta. La respuesta correcta es 'a) París'.\n");
                }
            }

            System.out.println("Tu calificación es: " + calificacion);
        }
    }

    // Función para quitar acentos de una cadena de texto
    public static String quitarAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
