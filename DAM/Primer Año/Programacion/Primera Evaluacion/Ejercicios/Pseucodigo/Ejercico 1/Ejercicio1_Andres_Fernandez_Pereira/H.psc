Algoritmo mostarDiaSemanaConSi
	//*Pedir un n�mero al usuario y mostrar el nombre del d�a al que corresponde (1=lunes)*//
	//*Variable*//
	Definir dia Como Entero;
	//*Inicio*//
	Escribir ("Introduzca un n�mero entre 1 y 7");
	Leer dia;
	
	Si dia>=1 y dia<=7 Entonces
		Segun dia Hacer
			caso 1:
				Escribir ("Lunes");
			Caso 2:
				Escribir ("Martes");
			Caso 3:
				Escribir ("Miercoles");
			Caso 4:
				Escribir ("Jueves");
			Caso 5:
				Escribir ("Viernes");
			Caso 6:
				Escribir ("Sabado");
			Caso 7:
				Escribir ("Domingo");
		FinSegun
	SiNo
		Escribir ("Error, los d�as de la semana tiene 7 d�as ");
	FinSi
	//*Fin*//
FinAlgoritmo
