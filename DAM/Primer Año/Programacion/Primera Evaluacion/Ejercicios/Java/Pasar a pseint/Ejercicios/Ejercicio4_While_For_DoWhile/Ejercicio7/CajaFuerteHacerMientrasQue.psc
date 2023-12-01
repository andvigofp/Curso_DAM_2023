SubProceso CajaFuerteDoWhile()
    Definir combinacionCorrecta, intentos, intento Como Entero;
    Definir combinacionCorrectaIngresada Como Logico;
    combinacionCorrecta = 1234;
    intentos = 4;
    combinacionCorrectaIngresada = Falso;
	
    Hacer
        Escribir("Introduce la combinaci�n de la caja fuerte (4 cifras):");
        Leer intento;
		
        Si intento = combinacionCorrecta Entonces
            Escribir("La caja fuerte se ha abierto satisfactoriamente");
            combinacionCorrectaIngresada = Verdadero;
        Sino
            Si intento < combinacionCorrecta Entonces
                Escribir("N�mero demasiado bajo. Intenta con un n�mero m�s alto.");
            Sino
                Escribir("N�mero demasiado alto. Intenta con un n�mero m�s bajo.");
            FinSi
			
            Si intento <> combinacionCorrecta Entonces
                intentos = intentos - 1;
            FinSi
			
            Escribir("Te quedan "), (intentos), (" intentos");
        FinSi
    Mientras Que (intentos > 0) Y (No combinacionCorrectaIngresada);
	
    Si intentos = 0 Y No combinacionCorrectaIngresada Entonces
        Escribir("Se agotaron los intentos. La combinaci�n correcta era: "), (combinacionCorrecta);
        Escribir("La caja fuerte permanece cerrada.");
    FinSi
FinSubProceso

Proceso CajaFuerte
    CajaFuerteDoWhile();
FinProceso