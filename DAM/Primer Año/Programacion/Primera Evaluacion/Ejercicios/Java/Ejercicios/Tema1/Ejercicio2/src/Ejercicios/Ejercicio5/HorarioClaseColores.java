package Ejercicios.Ejercicio5;

public class HorarioClaseColores {
    public static void main(String[] args) {
        /**
         * Modificando el programa anterior puedes mostrar cada asignatura en un color
         * diferente: “\033[31mProgramación” y aparecerá de color rojo.
         */
        System.out.printf("%30s %20s %20s %20s %20s %20s %20s %20s\n",  "\'16:00\t16:50\'","\'16:50\t17:40\'", "\'17:40\t18:30\'","\'18:30\t19:20\'","\'19:20\t19:35\'","\'19:35\t20:25\'","\'20:25\t21:15\'","\'21:15\t22:05\'\n");
        System.out.printf("%19s %14s %20s %38s %32s %30s %36s\n",  "\033[32mLunes\033[0m", " "," ","\033[31mProgramación\033[0m","\033[31mProgramación\033[0m","\033[35mRecreo\033[0m","\033[31mProgramación\033[0m\n");
        System.out.printf("%21s \n",  "\033[33mMartes\033[0m\n");
        System.out.printf("%23s %14s %20s %34s %32s %30s %36s\n",  "\033[34mMiercoles\033[0m", " "," ","\033[31mProgramación\033[0m","\033[31mProgramación\033[0m","\033[35mRecreo\033[0m","\033[31mProgramación\033[0m\n");
        System.out.printf("%20s %14s %20s %37s %32s %30s %36s\n",  "\033[36mJueves\033[0m", " "," ","\033[31mProgramación\033[0m","\033[31mProgramación\033[0m","\033[35mRecreo\033[0m","\033[31mProgramación\033[0m\n");
        System.out.printf("%21s %25s %25s %32s %33s %35s %30s %34s\n",  "\033[31mViernes\033[0m", "\033[37mPSP\033[0m","\033[37mPSP\033[0m","\033[37mPSP\033[0m"," \033[36mSXE\033[0m","\033[35mRecreo\033[0m","\033[36mSXE\033[0m"," \033[36mSXE\033[0m");
    }
}
