//**Funcion**//
SubProceso circunferenciaAreaCirculo()
	//*Variable*//
	Definir radio, area, long Como Real;
	//*Inicio*//
	Escribir ("Dime la radio de una circunferencia");
	Leer radio;
	//*Formula de la longitud y area de un circunferencia*//
	long=2*pi*radio;
	area=(2*radio)*pi;
	Escribir ("El resultado de la longitud de la circunferencia es: "),(long), (" El ar�a del circ�lo es:  "), (area)
	//*Fin*//
FinSubProceso

Proceso AreaCirculo
	//*Para Iniciciar la funcion de Subprocesso*//
	circunferenciaAreaCirculo();
FinProceso
	