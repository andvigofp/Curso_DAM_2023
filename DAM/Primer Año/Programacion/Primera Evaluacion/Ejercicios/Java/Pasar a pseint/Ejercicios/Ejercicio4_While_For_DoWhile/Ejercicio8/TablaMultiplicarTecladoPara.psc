SubProceso TablaMultiplicarTecladoFor()
	Definir numero1,i, resultado Como Entero;
	
	Escribir ("Ingresa un n�mero");
	Leer numero1;
	
	Para i=1 Hasta 10  Con Paso 1 Hacer
		resultado = numero1*i;
		Escribir (numero1), (" x "), (i), (" = "), (resultado);
	FinPara
FinSubProceso
	
Proceso TablaMultiplicar
	TablaMultiplicarTecladoFor();
FinProceso
