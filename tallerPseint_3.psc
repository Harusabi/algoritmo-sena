Funcion ejercicio_1
	
    Definir x, i, z, numb Como Entero;
    
    Escribir "Digite la cantidad de numero que va a escribir";
    Leer x;
	
    Dimension numbers[x];
	
    Para i <- 1 Hasta x Con Paso 1 Hacer
		
        Escribir "Digite el numero";
        Leer numb;
		numbers[i] <- numb
        Si numb % 2 = 0 Entonces
			
			Escribir "Su numero es par";
			
		FinSi
		
	FinPara
	
	Limpiar Pantalla;
	
	Para i <- 1 Hasta x Con Paso 1 Hacer
		
		Si numbers[i] % 2 = 0 Entonces
			Escribir numbers[i];
		FinSi
		
	FinPara
	
FinFuncion

Funcion ejercicio_2
	Definir cantid_total, n_cadenas, i, j Como Entero;
	Definir cadena_texto Como Texto;

	Escribir "Digite la cantidad de cadenas de texto que quiere escribir";
	Leer n_cadenas;

	Dimension textos[n_cadenas];
	Dimension repetido[n_cadenas];

	Para i <- 1 Hasta n_cadenas Hacer
		Escribir "Digite su cadena de texto: ";
		Leer cadena_texto;
		textos[i] <- cadena_texto;
		repetido[i] <- 0;  // Inicializamos el vector repetido con 0
	FinPara

	Para i <- 1 Hasta n_cadenas Hacer
		Si repetido[i] = 0 Entonces  // Solo procesar si no ha sido marcado como repetido
			cantid_total <- 0;
			Para j <- 1 Hasta n_cadenas Hacer
				Si textos[i] = textos[j] Entonces
					cantid_total <- cantid_total + 1;
					repetido[j] <- 1;  // Marcamos todas las ocurrencias como procesadas
				FinSi
			FinPara
			Escribir "El valor ", textos[i], " se repite ", cantid_total, " veces";
		FinSi
	FinPara

FinFuncion

Algoritmo main
	
	ejercicio_2;
	
FinAlgoritmo