//**Funcion**//
SubProceso salarioEmpregado()
	//**Variable*//
	Definir salario, reducion Como Real;
	//*Inicio*//
	Escribir ("Dime un salario de un empleado");
	Leer salario;
		//*Calcular la reduci�n del salario de un emplegado*//
		reducion=salario*0.8;
	Escribir ("La reteci�n del salario del empleado es: "), (reducion);
	//*Fin*//
FinSubProceso

Proceso reducionSalario
	//*Para Iniciciar la funcion de Subprocesso*//
	salarioEmpregado();
FinProceso
	