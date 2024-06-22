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
	
	Definir cantid_total, n_cadenas, i, z, v Como Entero;
	Definir cadena_texto Como Texto;
	
	Escribir "Digite la cantidad de cadenas de texto que quiere escribir";
	Leer n_cadenas;
	
	Dimension textos[n_cadenas];
	Dimension textosLimpio[n_cadenas];
	
	cantid_total <- 0;
	
	Para i <- 1 Hasta n_cadenas Hacer
		
		Escribir "Digite su cadena de texto: ";
		Leer cadena_texto;
		textos[i] <- cadena_texto;
		
	FinPara
	
	Para Cada elemento De textos Hacer
		
		z <- n_cadenas;
		v = 1;
		
		Repetir 
			
			Si elemento = textos[z] Entonces
				cantid_total = cantid_total + 1;
				z = z - 1;
			FinSi
			
			Si elemento = textosLimpio[z] Entonces
				textosLimpio[v] = elemento;
			FinSi
			
			Escribir "El valor ", elemento, " se repite", cantid_total;
			
		Hasta Que z = 1
		
	FinPara
	
FinFuncion

Algoritmo main
	
	ejercicio_2;
	
FinAlgoritmo