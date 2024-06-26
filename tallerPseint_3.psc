Funcion ejercicio_1
	
    Definir x, i, z, numb Como Entero;
    
    Escribir "Digite la cantidad de numero que va a escribir";
    Leer x;
	
    Dimension numbers[x];
	
    Para i = 1 Hasta x Con Paso 1 Hacer
		
        Escribir "Digite el numero";
        Leer numb;
		numbers[i] = numb
        Si numb % 2 = 0 Entonces
			
			Escribir "Su numero es par";
			
		FinSi
		
	FinPara
	
	Limpiar Pantalla;
	
	Para i = 1 Hasta x Con Paso 1 Hacer
		
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

	Para i = 1 Hasta n_cadenas Hacer
		Escribir "Digite su cadena de texto: ";
		Leer cadena_texto;
		textos[i] = cadena_texto;
		repetido[i] = 0;
	FinPara

	Para i = 1 Hasta n_cadenas Hacer
		Si repetido[i] = 0 Entonces
			cantid_total = 0;
			Para j = 1 Hasta n_cadenas Hacer
				Si textos[i] = textos[j] Entonces
					cantid_total = cantid_total + 1;
					repetido[j] = 1;
				FinSi
			FinPara
			Escribir "El valor ", textos[i], " se repite ", cantid_total, " veces";
		FinSi
	FinPara

FinFuncion

Funcion ejercicio_3

	Definir descuento, cantidad_articulos, valor_producto, i Como Entero;
	
	Escribir "Digite la cantidad de productos: ";
	Leer cantidad_articulos

	// Probando las costantes
	Costante IVA = 1.19
	
	Dimension precios[cantidad_articulos];
	Dimension precios_iva[cantidad_articulos];
	Dimension descuento_articulo[cantidad_articulos];


	Para i <- 1 Hasta cantidad_articulos Hacer
		
		Escribir "Escribir precio del articul ", i;
		Leer valor_producto;

		Escribir "Cual es su descuento? Si no tiene escriba 0";
		Leer descuento; 

		precios[i] = valor_producto;
		precios_iva[i] = valor_producto * iva;
		descuento_articulo[i] = descuento / 100;

	FinPara

	Para i = 1 Hasta cantidad_articulos Hacer
		
		Si (descuento_articulo[i] != 0) Entonces
			
			Escribir "El precio inicial del producto ", i, " es: ", precios[i], ". El IVA es: ", precios_iva[i], ". Precio con descuento: ", precios[i] + precios_iva[i] - descuento_articulo[i];
			
		SiNo
			
			Escribir "El precio del producto ", i, " es: ", precios[i], ". El IVA es: ", precios_iva[i];
		
		FinSi

	FinPara

FinFuncion

Funcion ejercicio_4

	Definir long_vector, i Como Entero;
	Definir multiplo, producto Como Real;
	
	Escribir "Digite hasta que numero quiere multiplicar?";
	Leer long_vector;

	Escribir "Digite el numero que quiere multiplicar"
	Leer multiplo;

	Dimension productos[long_vector];

	Para i <- 1 Hasta long_vector Hacer
	
		productos[i] = multiplo * i;

	FinPara

	Para Cada valor De productos Hacer
		Escribir Sin Saltar valor " ";
	FinPara

FinFuncion

Funcion ejercicio_5

	Definir cantidad_notas, i Como Entero;
	Definir nota, promedio Como Real;
	promedio = 0

	Escribir "Digite la cantidad de notas";
	Leer cantidad_notas

	Dimension notas[cantidad_notas];

	Para i = 1 Hasta cantidad_notas Hacer
		
		Escribir "Digite la nota N-", i;
		Leer nota;
		
		notas[i] = nota;
		
	FinPara

	Para Cada valor De notas Hacer
		
		promedio = promedio + valor
		
	FinPara

	Escribir "El promedio del estudiate con las notas "

	Para Cada valor De notas Hacer
		
		Escribir Sin Saltar valor ", ";
		
	FinPara

	Escribir "Su promedio es: ", promedio / cantidad_notas;

FinFuncion

Algoritmo main
	
	ejercicio_3;
	
FinAlgoritmo