SubProceso MostrarNumeroFor()
	Definir numero1 Como Entero;
	
	Para numero1 Desde 320 Hasta 160 Con Paso -20 Hacer
		Escribir ("Los n�meros son: ") ,(numero1);
	FinPara
FinSubProceso
	
Proceso MostraNumero
	MostrarNumeroFor();
FinProceso
