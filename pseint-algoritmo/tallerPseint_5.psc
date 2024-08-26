// Realiza un algoritmo el cual me permita calcular operaciones (con funciones) de una
// Calculadora, deber� usar funciones y ser manejado por medio de un men�.

Funcion resultado <- operacionSumar(num1 Por valor, num2 Por Valor)
    resultado = num1 + num2
    Escribir resultado
FinFuncion

Funcion resultado <- operacionRestar(num1 Por valor, num2 Por Valor) 
    resultado = num1 - num2
    Escribir resultado
FinFuncion

Funcion resultado <- operacionMultiplicar(num1 Por valor, num2 Por Valor)
    resultado = num1 * num2
    Escribir resultado
FinFuncion

Funcion resultado <- operacionDividir(num1 Por valor, num2 Por Valor)
    Si num2 <> 0 Entonces
        resultado = num1 / num2
    SiNo 
        Escribir "Error en el divisor"
        resultado = 0
    FinSi
    Escribir resultado
FinFuncion

Funcion resultado <- operacionResiduo(num1 Por valor, num2 Por Valor)
    resultado = num1 % num2
    Escribir resultado
FinFuncion

Funcion resultado <- operacionPotencia(num1 Por valor, num2 Por Valor)
    Si num2 = 0 Entonces
        resultado = 1
    SiNo
        resultado = num1 ^ num2
    FinSi
    Escribir resultado
FinFuncion

// Realiza un algoritmo el cual me permita calcular operaciones (con funciones) de figuras,
// calcular �reas y per�metros, deber� ser manejado por medio de un men�.

Funcion operacionCuadrado(l)
    Si l > 0 Entonces
        Escribir "El area del cuadrado es: ", l^2, " y el perimetro del cuadrado es: ", l*4
    SiNo
        Escribir "N�mero invalido"
    FinSi
FinFuncion

Funcion operacionCirculo(radio)
    Si radio > 0 Entonces
        Escribir "El area del circulo es: ", (radio^2)*PI, " y el perimetro del circulo es: ", 2*PI*radio
    SiNo
        Escribir "N�mero invalido"
    FinSi
FinFuncion

// Realiza un algoritmo el cual me permita calcular operaciones (con funciones) de efectivo de
// una cartera, dichas funciones son vender_articulos, pago_gastos, pago_facturas,
// cobrar_servicios y dem�s.

Funcion saldo <- vender_articulos(importe)
    Definir saldo Como Real
    saldo <- 0

    saldo <- saldo + importe
    Escribir saldo
FinFuncion

Funcion saldo <- pago_gastos(importe)
    Definir saldo Como Real
    saldo <- 0

    saldo <- saldo - importe
    Escribir saldo
FinFuncion

Funcion saldo <- pago_facturas(importe)
    Definir saldo Como Real
    saldo <- 0

    saldo <- saldo - importe
    Escribir saldo
FinFuncion

Funcion saldo <- cobrar_servicios(importe)
    Definir saldo Como Real
    saldo <- 0

    saldo <- saldo + importe
    Escribir saldo
FinFuncion

Algoritmo main
    Definir ejercicio, operacion Como Entero
    Definir num1, num2 Como Real
    Definir valor Como Real
    Definir l, radio Como Real
    Definir texto Como Texto
    Definir exit Como Logico
    exit <- Falso
    
    Repetir
		Limpiar Pantalla
        Escribir '�Cu�l operaci�n quieres realizar?'
        Escribir '1. Calculadora'
        Escribir '2. Figuras (�reas y Per�metros)'
        Escribir '3. Gesti�n de Cartera'
        Escribir '4. Salir'
        Leer ejercicio

        Segun ejercicio Hacer
            Caso 1:
                Repetir
					Limpiar Pantalla
                    Escribir 'Operaciones de la calculadora'
                    Escribir '1. Suma'
                    Escribir '2. Resta'
                    Escribir '3. Multiplicaci�n'
                    Escribir '4. Divisi�n'
                    Escribir '5. Residuo'
                    Escribir '6. Potencia'
                    Escribir '7. Regresar al men� principal'
                    Leer operacion

                    Si operacion >= 1 Y operacion <= 6 Entonces
                        Escribir 'Inserte el valor de A:'
                        Leer num1
                        Escribir 'Inserte el valor de B:'
                        Leer num2
                    FinSi

                    Segun operacion Hacer
                        Caso 1:
                            Escribir 'El resultado es: ', operacionSumar(num1, num2)
                        Caso 2:
                            Escribir 'El resultado es: ', operacionRestar(num1, num2)
                        Caso 3:
                            Escribir 'El resultado es: ', operacionMultiplicar(num1, num2)
                        Caso 4:
                            Escribir 'El resultado es: ', operacionDividir(num1, num2)
                        Caso 5:
                            Escribir 'El resultado es: ', operacionResiduo(num1, num2)
                        Caso 6:
                            Escribir 'El resultado es: ', operacionPotencia(num1, num2)
                    FinSegun
                Hasta Que operacion = 7
            Caso 2:
                Repetir
					Limpiar Pantalla
                    Escribir 'Operaciones de �reas y per�metros'
                    Escribir '1. Cuadrado'
                    Escribir '2. C�rculo'
                    Escribir '3. Regresar al men� principal'
                    Leer operacion

                    Segun operacion Hacer
                        Caso 1:
                            Escribir 'Inserte el valor del lado del cuadrado:'
                            Leer l
                            operacionCuadrado(l)
							Esperar Tecla
							
                        Caso 2:
                            Escribir 'Inserte el valor del radio del c�rculo:'
                            Leer radio
                            operacionCirculo(radio)
							Esperar Tecla
							
                    FinSegun
                Hasta Que operacion = 3
            Caso 3:
                Repetir
					Limpiar Pantalla
                    Escribir 'Operaciones de la cartera'
                    Escribir '1. Vender art�culos'
                    Escribir '2. Pagar gastos'
                    Escribir '3. Pagar facturas'
                    Escribir '4. Cobrar servicios'
                    Escribir '5. Mostrar saldo'
                    Escribir '6. Regresar al men� principal'
                    Leer operacion

                    Segun operacion Hacer
                        Caso 1:
                            Escribir 'Ingrese el importe por la venta de art�culos:'
                            Leer valor
                            saldo <- vender_articulos(valor)
                            Escribir 'Nuevo saldo: ', saldo
                        Caso 2:
                            Escribir 'Ingrese el importe a pagar en gastos:'
                            Leer valor
                            saldo <- pago_gastos(valor)
                            Escribir 'Nuevo saldo: ', saldo
                        Caso 3:
                            Escribir 'Ingrese el importe a pagar en facturas:'
                            Leer valor
                            saldo <- pago_facturas(valor)
                            Escribir 'Nuevo saldo: ', saldo
                        Caso 4:
                            Escribir 'Ingrese el importe a cobrar por servicios:'
                            Leer valor
                            saldo <- cobrar_servicios(valor)
                            Escribir 'Nuevo saldo: ', saldo
                        Caso 5:
                            Escribir 'Saldo actual: ', saldo
                    FinSegun
                Hasta Que operacion = 6
            Caso 4:
                Escribir 'Saliste del programa'
                exit <- Verdadero
        FinSegun
    Hasta Que exit
FinAlgoritmo
