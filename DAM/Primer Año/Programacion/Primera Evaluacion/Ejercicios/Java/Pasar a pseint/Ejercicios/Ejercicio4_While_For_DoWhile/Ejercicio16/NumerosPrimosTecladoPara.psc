SubProceso NumerosPrimosTecladoFor()
	//Variables
	Definir numero1, contador Como Entero;
    contador = 0;
	
    Escribir("Ingrese un n�mero para verificar si es primo: ");
    Leer numero1;
	
    // Verificar si el n�mero es mayor que 1
    Si numero1 <= 1 Entonces
        Escribir("El n�mero debe ser mayor que 1 para ser primo.");
    Sino
        // Contar los divisores
        Para i = 1 Hasta numero1 Con Paso 1 Hacer
            Si numero1 MOD i = 0 Entonces
                contador = contador + 1;
            FinSi
        FinPara
		
        // Determinar si es primo
        Si contador = 2 Entonces
            Escribir("El n�mero "), (numero1), (" es primo.");
        Sino
            Escribir("El n�mero "), (numero1), (" no es primo.");
        FinSi
    FinSi
	
FinSubProceso

Proceso NumerosPrimos
	NumerosPrimosTecladoFor();
FinProceso
