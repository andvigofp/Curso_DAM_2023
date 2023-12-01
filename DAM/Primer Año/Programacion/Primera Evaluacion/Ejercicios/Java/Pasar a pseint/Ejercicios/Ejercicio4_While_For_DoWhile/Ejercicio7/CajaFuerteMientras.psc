SubProceso  CajaFuerteWhile()
	Definir combinacionCorrecta, intentos, intento Como Entero;
	Definir combinacionIncorrectaIngresada Como Logico;
	intentos = 4;
	combinacionCorrecta = 1234;
	combinacionCorrectaIngresada = Falso;
	
	Mientras (intentos > 0 y No combinacionCorrectaIngresada) Hacer
		Escribir ("Introduce la combinaci�n de la caja fuerte (4 cifras): ");
		Leer intento;
		
		Si intento= combinacionCorrecta Entonces
			Escribir ("La caja fuerte se abierto satisfactoriamente");
			combinacionCorrectaIngresada = Verdadero;
			
		SiNo
			Si intento < combinacionCorrecta Entonces
				Escribir ("N�mero demasiado bajo. Intenta con n�mero m�s alto.");
			SiNo
				Escribir ("N�mero demasiado alto. Intenta con n�mero m�s bajo.")
			FinSi
			
			Si intentos <> combinacionCorrecta Entonces
				intentos = intentos -1;
			FinSi
			Escribir ("Te quedan "), (intentos), (" intentos");
		FinSi
		
	FinMientras
	
	Si (intentos = 0) Y (No combinacionCorrectaIngresada) Entonces
		Escribir ("Se agogar�n los intentos. La combinaci�n correcta era : "), (combinacionCorrecta);
		Escribir ("La caja fuerte permanece cerrada.");
		
	FinSi
FinSubProceso
	
Proceso CajaFuerte
	CajaFuerteWhile();
FinProceso
