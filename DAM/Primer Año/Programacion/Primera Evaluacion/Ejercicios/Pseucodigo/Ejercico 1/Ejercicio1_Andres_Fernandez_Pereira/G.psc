Algoritmo mostarqIgualesVerdadero
	//*Pedir dos valores y en caso de que no sean iguales indicar cu�l es el mayor*//
	//**Variable//
	Definir Numero1,Numero2 Como Entero;
	//*Inicio*//
	Escribir ("Dime dos n�meros");
	Leer Numero1,Numero2;
	Si Numero1==Numero2 Entonces
		Escribir ("Son Iguales");
	SiNo
		Si Numero1>Numero2 Entonces
			Escribir ("El n�mero mayor es "), (Numero1);
		SiNo
			Escribir ("El n�mero mayor es "), (Numero2);
		FinSi
	FinSi
	//*Fin*//
FinAlgoritmo
