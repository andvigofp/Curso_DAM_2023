package Ejercicios.Ejercicio16;

import java.util.Scanner;

public class SalarioSemanalEmpleado {
    public static void main(String[] args) {
        /**
         * Escribe un programa que calcule el salario semanal de un empleado en base a las
         * horas trabajadas, a razón de 12 euros la hora
         */
        int horasTrabajo;
        double tarifaHora, salarioSemanal;
        tarifaHora = 12;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese las horas trabajadas o pulse 0 para salir: ");
            horasTrabajo = teclado.nextInt();
            if (horasTrabajo == 0) {
                System.out.println("Salió correctamente");
                break;
            }
            salarioSemanal = horasTrabajo * tarifaHora;
            System.out.println("El salario semanal es de: " + salarioSemanal + " euros");
        }while (true);
    }
}
