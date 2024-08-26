Funcion ejercicio_1

    Definir suma3, suma4 Como Real;

    suma3 = 0;
    suma4 = 0;

    Dimension numeros[4, 4];

    Para Cada elemento De numeros Hacer

        elemento = aleatorio(1, 99);

    FinPara

    Para j <- 1 Hasta 4 Hacer

        Para i <- 1 Hasta 4 Hacer

        Escribir Sin Saltar numeros[j,i], " ";

        FinPara

        Escribir "";
        
    FinPara
    
    Escribir "";
    
    Para j <- 1 Hasta 4 Hacer

        Para i <- 1 Hasta 4 Hacer

            Si (i = 3) Entonces

                suma3 = suma3 + numeros[j, i];

            FinSi
            Si (i = 4) Entonces

                suma4 = suma4 + numeros[j, i];

            FinSi

        FinPara

    FinPara

    Escribir suma3, " ", suma4;

FinFuncion

Funcion ejercicio_2

    Definir suma1, suma2 Como Real;

    suma1 = 0;
    suma2 = 0;

    Dimension numeros[4, 5];

    Para Cada elemento De numeros Hacer

        elemento = aleatorio(1, 99);

    FinPara

    Para j <- 1 Hasta 4 Hacer

        Para i <- 1 Hasta 5 Hacer

        Escribir Sin Saltar numeros[j,i], " ";

        FinPara

        Escribir "";
        
    FinPara
    
    Escribir "";
    
    Para j <- 1 Hasta 4 Hacer

        Para i <- 1 Hasta 5 Hacer

            Si (i = 1) Entonces

                suma1 = suma1 + numeros[j, i];

            FinSi
            Si (i = 2) Entonces

                suma2 = suma2 + numeros[j, i];

            FinSi

        FinPara

    FinPara

    Escribir suma1, " : ", suma2;

FinFuncion

Funcion ejercicio_3

    Definir resta Como Real;

    resta = 0;

    Dimension numeros[6, 6];

    Para Cada elemento De numeros Hacer

        elemento = aleatorio(1, 99);

    FinPara

    Para j <- 1 Hasta 6 Hacer

        Para i <- 1 Hasta 6 Hacer

        Escribir Sin Saltar numeros[j,i], " ";

        FinPara

        Escribir "";
        
    FinPara
    
    Escribir "";
    

    Para Cada elemento De numeros Hacer
    
        resta = resta - elemento

    FinPara

    Escribir resta;

FinFuncion

Funcion ejercicio_4
        
    Definir suma Como Real;
        
    Dimension numerosA[3,3];
    Dimension numerosB[3,3];
    Dimension resultado[3,3];

    Para Cada elemento De numerosA Hacer
        
        elemento = aleatorio(1, 99);
        
    FinPara

    Escribir "";
    Escribir "Matriz 1";

    Para j <- 1 Hasta 3 Hacer
        
        Para i <- 1 Hasta 3 Hacer
            
            Escribir Sin Saltar numerosA[j, i], " ";
            
        FinPara
        
        Escribir "";
        
    FinPara

    Escribir "";
    Escribir "Matriz 2";

    Para Cada elemento De numerosB Hacer
        
        elemento = aleatorio(1, 99);
        
    FinPara

    Para j <- 1 Hasta 3 Hacer
        
        Para i <- 1 Hasta 3 Hacer
            
            Escribir Sin Saltar numerosB[j, i], " ";
            
        FinPara
        
        Escribir "";
        
    FinPara

    Escribir "";
    Escribir "Matriz Resultado";

    Para j <- 1 Hasta 3 Hacer
        
        Para i <- 1 Hasta 3 Hacer
            
            suma = suma + numerosA[j, i] + numerosB[j, i];
            resultado[j, i] = suma;
            suma = 0
        FinPara
        
    FinPara

    Para j <- 1 Hasta 3 Hacer
        
        Para i <- 1 Hasta 3 Hacer
            
            Escribir Sin Saltar resultado[j, i], " ";
            
        FinPara
        
        Escribir "";
        
    FinPara

FinFuncion

Funcion ejercicio_5

    Definir sumaTotal, nFilas, nColumnas Como Real;
    Definir cantidadNotas Como Entero;

    Escribir "Digite el numero de filas y luego de columnas";
    Leer nFilas, nColumnas

    cantidadNotas = 0;
    sumaTotal = 0;

    Dimension notas[nFilas, nColumnas];

    Para Cada elemento De notas Hacer

        elemento = aleatorio(1, 50);

    FinPara

    Para j <- 1 Hasta nFilas Hacer

        Para i <- 1 Hasta nColumnas Hacer

        Escribir Sin Saltar notas[j,i], " ";

        FinPara

        Escribir "";
        
    FinPara
    
    Escribir "";
    

    Para j <- 1 Hasta nFilas Hacer

        Para i <- 1 Hasta nColumnas Hacer
    
            Si (j = 1) Entonces    

                sumaTotal = sumaTotal + notas[j, i];
                cantidadNotas = cantidadNotas + 1

            FinSi
            Si (i = 1) Entonces    

                sumaTotal = sumaTotal + notas[j, i];
                cantidadNotas = cantidadNotas + 1

            FinSi

        FinPara

        
    FinPara

    // La palabra REDON redondea el numero, si quiere mostrar el resultado con decimales, se quita la palabra
    Escribir "El promedio es de: ", Redon(sumaTotal / cantidadNotas);

FinFuncion

Funcion ejercicio_6

    Definir sumaTotal, nFilas, nColumnas Como Real;
    Definir cantidadNotas Como Entero;

    Escribir "Digite el numero de filas y luego de columnas";
    Leer nFilas, nColumnas

    cantidadNotas = 0;
    sumaTotal = 0;

    Dimension notas[nFilas, nColumnas];

    Para Cada elemento De notas Hacer

        elemento = aleatorio(1, 50);

    FinPara

    Para j <- 1 Hasta nFilas Hacer

        Para i <- 1 Hasta nColumnas Hacer

        Escribir Sin Saltar notas[j,i], " ";

        FinPara

        Escribir "";
        
    FinPara
    
    Escribir "";
    

    Para j <- 1 Hasta nFilas Hacer

        Para i <- 1 Hasta nColumnas Hacer
    
            Si (j = i & i = j) Entonces    

                sumaTotal = sumaTotal + notas[j, i];
                cantidadNotas = cantidadNotas + 1

            FinSi

        FinPara

        
    FinPara

    // La palabra REDON redondea el numero, si quiere mostrar el resultado con decimales, se quita la palabra
    Escribir "El promedio es de: ", Redon(sumaTotal / cantidadNotas); 

FinFuncion

Algoritmo main

	Definir opcion Como Entero;

	Repetir
		Escribir '¿Qué ejercicio quieres probar? Digite el número del ejercicio (1 a 6) o 7 para salir: ';
		Leer opcion;

		Mientras opcion < 1 | opcion > 7 Hacer
			Escribir 'Opción Inválida, vuelva a digitar la opción:';
			Leer opcion;
		FinMientras

		Segun opcion Hacer
			1: 
				ejercicio_1;
				Esperar Tecla
				Limpiar Pantalla
			2: 
				ejercicio_2;
				Esperar Tecla
				Limpiar Pantalla
			3: 
				ejercicio_3;
				Esperar Tecla
				Limpiar Pantalla
			4: 
				ejercicio_4;
				Esperar Tecla
				Limpiar Pantalla
			5: 
				ejercicio_5;
				Esperar Tecla
				Limpiar Pantalla
			6: 
				ejercicio_6;
				Esperar Tecla
				Limpiar Pantalla
			7: 
				Escribir 'Saliendo del programa...';
		FinSegun

	Hasta que opcion = 7

FinAlgoritmo