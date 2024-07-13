
// Realiza un algoritmo el cual me permita calcular operaciones (con funciones) de una
// Calculadora, deberá usar funciones y ser manejado por medio de un menú.

Funcion resultado = operacionSumar(num1 Por valor, num2 Por Valor)

    resultado = num1 + num2;

FinFuncion

Funcion resultado = operacionRestar(num1 Por valor, num2 Por Valor)

    resultado = num1 - num2;

FinFuncion

Funcion resultado = operacionMultiplicar(num1 Por valor, num2 Por Valor)

    resultado = num1 * num2;

FinFuncion

Funcion resultado = operacionDividir(num1 Por valor, num2 Por Valor)

    Si num != 0 Entonces

        resultado = num1 + num2;

    SiNo 

        Escribir "Error en el divisor";

    FinSi

FinFuncion

Funcion resultado = operacionResiduo(num1 Por valor, num2 Por Valor)

    resultado = num1 % num2;

FinFuncion

Funcion resultado = operacionPotencia(num1 Por valor, num2 Por Valor)

    Si num2 = 0 Entonces

        resultado = 1;
    SiNo

        resultado = num1 ^ num2;

    FinSi

FinFuncion

// Realiza un algoritmo el cual me permita calcular operaciones (con funciones) de figuras,
// calcular áreas y perímetros, deberá ser manejado por medio de un menú.

Funcion resultado = operacionCuadrado(l1)

    Si l1 > 0 Entonces

        Escribir "El area del cuadrado es: ", l1 ^ 2;
        Escribir "El perimetro del cuadrado es: ", l1 * 4;

    FinSi
    Mientras l1 < 0 |  Hacer
        Escribir 'Numero invalido'
        Leer operacion;
    FinMientras


FinFuncion

// Realiza un algoritmo el cual me permita calcular operaciones (con funciones) de efectivo de
// una cartera, dichas funciones son vender_articulos, pago_gastos, pago_facturas,
// cobrar_servicios y demás.

Algoritmo main

    Definir ejercicio, operacion Como Entero;
        
    Escribir 'Cual operacion quieres realizar?';
    Escribir '1. Ejercicio 1';
    Escribir '2. Ejercicio 2';
    Escribir '3. Ejercicio 3';
    Escribir '4. Salir';
    Leer ejercicio;

    Mientras operacion < 1 & operacion > 4 Hacer
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
            Escribir 'Saliste del programa';
            exit <- Verdadero;
            Escribir "Presione cualquier tecla para seguir";
            Esperar Tecla;
    FinSegun
    Limpiar Pantalla;

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

FinAlgoritmo
