Algoritmo mostrarVerdadero
	//*Pedir dos n�meros enteros y mostrar "verdadero" si el primero es mayor.*//
	//*Variable*//
	Definir Numero1, Numero2 Como Entero;
	//*Inicio*//
	Escribir ("Ingrese dos n�meros");
	Leer Numero1, Numero2;
	
	Si Numero1>Numero2 Entonces
		Escribir ("El n�mero  Es verdadero"); //*Verdadero*//
	SiNo
		Si Numero2>Numero1 Entonces
			Escribir ("El n�mero es Falso"); //*Falso*//
		SiNo
			Si Numero1==Numero2 Entonces
				Escribir ("Error son iguales"); //*Falso*//
			FinSi
		FinSi
	FinSi
	//**Fin//
	
	
FinAlgoritmo
