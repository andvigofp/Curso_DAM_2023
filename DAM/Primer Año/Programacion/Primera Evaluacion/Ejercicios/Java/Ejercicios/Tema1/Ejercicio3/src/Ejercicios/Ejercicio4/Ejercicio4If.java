package Ejercicios.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4If {
    /**
     *Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las
     * horas extras. Escribe un programa que calcule el salario semanal de un trabajador
     * teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan
     * a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
     * Ejemplo 1:
     * Por favor, introduzca el número de horas trabajadas durante la semana: 36
     * El sueldo semanal que le corresponde es de 432 euros
     * Ejemplo 2:
     * Por favor, introduzca el número de horas trabajadas durante la semana: 40
     * El sueldo semanal que le corresponde es de 480 euros
     * Ejemplo 3:
     * Por favor, introduzca el número de horas trabajadas durante la semana: 55
     * El sueldo semanal que le corresponde es de 720 euros.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar;

        final int horasOrdinarias = 40; // Número de horas ordinarias a 12 euros por hora
        final double tarifaHoraOrdinaria = 12.0;
        final double tarifaHoraExtra = 16.0;
        do {
            System.out.print("Por favor, introduce el número de horas trabajadas esta semana: ");
            int horasTrabajadas = teclado.nextInt();

            double salario = 0.0;

            if (horasTrabajadas <= horasOrdinarias) {
                salario = horasTrabajadas * tarifaHoraOrdinaria;
            } else {
                salario = horasOrdinarias * tarifaHoraOrdinaria + (horasTrabajadas - horasOrdinarias) * tarifaHoraExtra;
            }

            System.out.println("El salario semanal del trabajador es: " + salario + " euros.");

            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            continuar = teclado.next();
        } while (!continuar.equals("0"));
        System.out.println("A salido correctamente");
    }
}

