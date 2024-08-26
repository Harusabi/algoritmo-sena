Funcion ejercicio_1
	
	Definir a, b Como Real;
	Definir operacion Como Entero;
	Definir exit Como Logico;
	
	Repetir
		
		Escribir 'Cual operacion quieres realizar?';
		Escribir '1. Suma';
		Escribir '2. Resta';
		Escribir '3. Multiplicacion';
		Escribir '4. Division';
		Escribir '5. Residuo';
		Escribir '6. Potencia';
		Escribir '7. Salir';
		Leer operacion;
		
		Mientras operacion < 1 & operacion > 7 Hacer
			Escribir 'Operacion invalida, vuelva a digitar la operacion deseada';
			Leer operacion;
		FinMientras
		
		Segun operacion Hacer
			1: 
				Escribir 'Inserte el valor de A y de B';
				Leer a,b;
				Escribir 'El resultado es: ', a + b;
				Escribir "Presione cualquier tecla para seguir";
				Esperar Tecla;
			2: 
				Escribir 'Inserte el valor de A y de B';
				Leer a,b;
				Escribir 'El resultado es: ', a - b;
				Escribir "Presione cualquier tecla para seguir";
				Esperar Tecla;
			3: 
				Escribir 'Inserte el valor de A y de B';
				Leer a,b;
				Escribir 'El resultado es: ', a * b;
				Escribir "Presione cualquier tecla para seguir";
				Esperar Tecla;
			4: 
				Escribir 'Inserte el valor de A y de B';
				Leer a,b;
				Escribir 'El resultado es: ', a / b;
				Escribir "Presione cualquier tecla para seguir";
				Esperar Tecla;
			5: 
				Escribir 'Inserte el valor de A y de B';
				Leer a,b;
				Escribir 'El resultado es: ', a MOD b;
				Escribir "Presione cualquier tecla para seguir";
				Esperar Tecla;
			6: 
				Escribir 'Inserte el valor de A y de B';
				Leer a,b;
				Escribir 'El resultado es: ', a ^ b;
				Escribir "Presione cualquier tecla para seguir";
				Esperar Tecla;
			7: 
				Escribir 'Saliste del programa';
				exit <- Verdadero;
				Escribir "Presione cualquier tecla para seguir";
				Esperar Tecla;
		FinSegun
		Limpiar Pantalla;
		
	Hasta Que exit
	
FinFuncion

Funcion ejercicio_2
	
	Definir n, a  Como Entero;
	Definir number Como Real;
	
	Escribir "El numero de veces que quiere digitar numeros";
	Leer n;
	Para a <- 1 Hasta n Con Paso 1 Hacer
		
		Escribir "Digite el numero para saber si es par o impar";
		Leer number;
		Si number MOD 2 = 0 Entonces
			Escribir "El numero es Par";
		SiNo
			Escribir "El numero es Impar";
		FinSi
	FinPara
	
FinFuncion

Funcion ejercicio_3
	
	Definir numero_tabla, n Como Entero;
	n <- 1;
	Escribir "Escriba el numero de la tabla de multiplicar que quiere";
	Leer numero_tabla;
	Mientras n <= 10 Hacer
		
		Escribir "El resultado es ", numero_tabla * n;
		n <- n + 1;
		
	FinMientras
	
FinFuncion

Funcion ejercicio_4
	
	Definir n, numero_empleados, empleados_minimo, empleados_mas Como Entero;
    Definir sueldo, prom_sueldo Como Real;
	
	Escribir "Digite el numero de empleados";
	Leer numero_empleados;
	
	prom_sueldo <- 0;
    sueldo <- 0;
    empleados_mas <- 0;
    empleados_minimo <- 0;

	Para n <- 1 Hasta numero_empleados Con Paso 1 Hacer

        Escribir "Escriba el sueldo del numero de empleado ", n;
        Leer sueldo;
        prom_sueldo <- prom_sueldo + sueldo;
        Si sueldo >=  1300000 Entonces
        
            empleados_mas <- empleados_mas + 1;

        SiNo
            empleados_minimo <- empleados_minimo + 1;
        FinSi
		
	FinPara
	
	Escribir "El sueldo promedio de todos los trabajadores es: ", prom_sueldo / numero_empleados;
	Escribir "El numero de empleados con sueldo mayor al minimo fueron: ", empleados_mas;
	Escribir "El numero de empleados con sueldo menores al minimo fueron: ", empleados_minimo;

FinFuncion

Funcion ejercicio_5
	
	Definir acum, calif Como Real;
	Definir cant_mat  Como Entero;
	acum <- 0;
	
	Escribir "Digite la cantidad de materias";
	Leer cant_mat; 
	
	Para cant_mat <- 1 Hasta cant_mat Con Paso 1 Hacer
		
		Escribir "Ingrese la calificacion de la materia";
		leer calif; 
		acum <- acum + calif;
		
	FinPara
	
	Escribir "Su Promedio es: ", acum / cant_mat;
	
FinFuncion

Funcion ejercicio_6
	
	Definir n_empleado, tipo_empleado, sueldo, x Como Entero;
	Definir bonifi_a, bonifi_b, bonifi_c Como Real;
	Escribir "Digite el numero de empleados";
	Leer n_empleado;
	bonifi_a <- 0.20;
	bonifi_b <- 0.30;
	bonifi_c <- 0.40;
	
	Para x <- 1 Hasta n_empleado Con Paso 1 Hacer
		
		Escribir "Digite el sueldo de empleado ", x;
		Leer sueldo;
		Escribir "Digite el tipo de empleado ", x, ". 1 para tipo A, 2 para tipo B, 3 para tipo C";
		Leer tipo_empleado;
		Mientras tipo_empleado <> 1 & tipo_empleado <> 2 & tipo_empleado <> 3 Hacer
			
			Escribir 'Numero invalido, intente de nuevo';
			Leer tipo_empleado;
			
		FinMientras
		
		Segun tipo_empleado Hacer
			1:
				Escribir "Su sueldo es: ", sueldo, ". Su bono es de: ", bonifi_a, ". Su sueldo total es: ", sueldo*(1+0.20);
			2:
				Escribir "Su sueldo es: ", sueldo, ". Su bono es de: ", bonifi_b, ". Su sueldo total es: ", sueldo*(1+0.30);
			3:
				Escribir "Su sueldo es: ", sueldo, ". Su bono es de: ", bonifi_C, ". Su sueldo total es: ", sueldo*(1+0.40);
		FinSegun
	
		
	FinPara
	
FinFuncion

Algoritmo main
	
	Definir opcion Como Entero;
	Escribir 'Cual ejecicio quieres probar? Digite el numero del ejercicio de 1 a 6';
	Leer opcion;
	Mientras opcion < 1 | opcion > 6 Hacer
		
		Escribir 'Opcion Invalida, vuelva a digitar la opcion';
		Leer opcion;
		
	FinMientras
	
	Segun opcion Hacer
		1: 
			ejercicio_1;
		2: 
			ejercicio_2;
		3: 
			ejercicio_3;
		4: 
			ejercicio_4;
		5: 
			ejercicio_5;
		6: 
			ejercicio_6;

	FinSegun
	
FinAlgoritmo
