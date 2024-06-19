Funcion ejercicio_1
	
    Definir x, i, z, numb Como Entero;
    
    Escribir "Digite la cantidad de numero que va a escribir";
    Leer x;
    
	z <- 0;
	
    Dimension numbers[x];
	Dimension numbersPar[x];
	
    Para i <- 1 Hasta x Con Paso 1 Hacer
		
        Escribir "Digite el numero";
        Leer numb;
        Si numb % 2 = 0 Entonces
			
			Escribir "Su numero es par";
			z <- z + 1;
			numbersPar[i] <- numb;
			
		SiNo
			
			Escribir "Su numero es impar";
			
		FinSi
		
	FinPara
	
//	Limpiar Pantalla;
	
	Para i <- 1 Hasta z Con Paso 1 Hacer
		
		Escribir numbersPar[i];
		
	FinPara
	
FinFuncion

Algoritmo main
	
	ejercicio_1;
	
FinAlgoritmo