package Ejercicios.Ejercicio10;

public class ConversorPesetasEuros {
    public static void main(String[] args) {
        /**
         * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
         * convertir deberá estar almacenada en una variable.
         */
            //Variables de tipo entero, y asignar un valor defecto a la variable cantidadPesetas
            var cantidadPesetas = 1000;
            var valorEuroPesetas = 166.386;
            //Variable tipo double (decimales)
            double  cantidadEuros;
            // Realizar la conversión
            cantidadEuros = cantidadPesetas / valorEuroPesetas;
            // Mostrar el resultado
        System.out.println(cantidadPesetas + " pesetas equivalen a " + cantidadEuros + " euros.");
    }
}
