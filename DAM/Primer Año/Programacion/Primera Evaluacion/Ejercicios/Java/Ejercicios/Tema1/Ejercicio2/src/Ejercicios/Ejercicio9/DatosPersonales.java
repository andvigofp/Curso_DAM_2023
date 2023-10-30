package Ejercicios.Ejercicio9;

public class DatosPersonales {
    public static void main(String[] args) {
        /**
         * Crea las variables nombre, dirección y teléfono y asígnales los valores
         * correspondientes. Muestra los valores de esas variables por pantalla.
         */
        //Variablles tipo carácter String, secuencias de escape Unicode
        String nombre = "\"\u0041\u006E\u0064\u0072\u00E8\u0073 Fernández Pereira\"";
        String direccion = "\'\u0031\u0032\u0033 Calle Principal, \u0032\u0033\'";
        String telefono = "\u0035\u0035\u0035\u002D\u0030\u0037\u0032\u0032\u002D\u0034\u0035\u0036\u0037";

        // Mostrar los valores de las variables por pantalla
        System.out.printf("%10s %10s %10s %10s","Datos Personales: ", nombre, direccion, telefono);

    }
}

