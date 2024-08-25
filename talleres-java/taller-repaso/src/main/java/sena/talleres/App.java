package sena.talleres;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiFunction;

public class App {

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        ejercicio15();
        // Integer opcion = 0;

        // try {

        // do {

        // System.out.println("Numero del ejercicio 99 para finalizar programa");
        // System.out.print("Opcion: ");

        // if (input.hasNextInt()) {
        // opcion = input.nextInt();
        // } else {
        // System.out.println("Error en el escaner");
        // }
        // switch (opcion) {
        // case 1:
        // System.out.println(ejercicio1());
        // Thread.sleep(3000);
        // break;
        // case 2:
        // System.out.println(ejercicio2());
        // Thread.sleep(3000);
        // break;
        // case 3:
        // System.out.println(ejercicio3());
        // Thread.sleep(3000);
        // break;
        // case 4:
        // System.out.println(ejercicio4());
        // Thread.sleep(3000);
        // break;
        // case 5:
        // System.out.println(ejercicio5());
        // Thread.sleep(3000);
        // break;
        // case 6:
        // System.out.println(ejercicio6());
        // Thread.sleep(3000);
        // break;
        // case 12:
        // // System.out.println(ejercicio12(12, 40000));
        // Thread.sleep(3000);
        // break;
        // case 99:
        // System.out.println("Saliendo del programa...");
        // break;
        // default:
        // System.out.println("Opción no válida. Por favor, elija un número entre 1 y 6
        // o 0 para salir.");
        // break;
        // }
        // } while (opcion != 0);

        // input.close();

        // } catch (Exception e) {
        // System.out.println(e);
        // }

    }

    //
    // 1. Un hombre compra un artículo a un precio dado. Determine el precio al
    // cual debe venderlo si desea ganar el 30%.

    static double ejercicio1() {
        System.out.print("Escriba el precio que desee: ");
        double precio = input.nextDouble();

        return precio + (precio * 0.3);
    }

    //
    // 2. Ingresar 10 números (edades de personas) y luego hallar y mostrar su
    // promedio.

    static double ejercicio2() {
        int totalEdades = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(MessageFormat.format("Escriba la edad N{0}", i));
            int edad = input.nextInt();

            totalEdades += edad;
        }

        return totalEdades / 10;
    }

    //
    // 3. En un centro comercial se descuenta 30% del precio al cliente si el valor
    // a pagarse es mayor a $300. Dado un valor de precio, muestre lo que
    // debe pagar el cliente.

    static double ejercicio3() {
        System.out.print("Escriba el valor a pagar: ");
        double precio = input.nextDouble();

        precio = (precio >= 300) ? precio + (precio * 0.3) : precio;

        return precio;
    }

    //
    // 4. Una tienda de frutas y verduras ofrece las manzanas con descuento según la
    // siguiente tabla:
    //
    // Numero de kilos comprados------% Descuento
    // 0 – 2------0%
    // 2.01 – 5------10%
    // 5.01 – 10------15 %
    // 10.01 en adelante------20%
    //
    // Dado el precio por kilo, y el peso, determinar cuánto pagará una persona que
    // compre manzanas es esa frutería.

    static double ejercicio4() {
        BiFunction<Double, Double, Double> incrementoFunction = (x, y) ->
            x + (x * y);

        System.out.print("Digite el precio del kilo de manzanas: ");
        double precioKilo = input.nextDouble();

        System.out.print("Digite los kilos de manzanas llevados: ");
        double kilos = input.nextDouble();

        precioKilo = ((kilos > 0) && (kilos < 2))
            ? precioKilo
            : ((kilos > 2) && (kilos < 5))
                ? incrementoFunction.apply(precioKilo, kilos)
                : ((kilos > 5) && (kilos < 10)
                        ? incrementoFunction.apply(precioKilo, kilos)
                        : incrementoFunction.apply(precioKilo, kilos));

        return precioKilo;
    }

    //
    // 5 Un hombre desea saber cuánto dinero se genera por concepto de intereses
    // sobre la cantidad que tiene en inversión en el banco. El decidirá reinvertir
    // los intereses siempre y cuando estos excedan a $7000, y en ese caso desea
    // saber cuánto dinero tendrá finalmente en su cuenta.

    static String ejercicio5() {
        final double interes = 0.1d;

        double conceptoInteres = 0d;
        double montoFinal = 0d;

        System.out.print("Escriba el monton invertido inicialmente: ");
        double montoInicial = input.nextDouble();

        System.out.print("Escriba tiempo en meses que invertira el monto: ");
        double lapsoTiempo = input.nextDouble();

        for (int i = 1; i <= lapsoTiempo; i++) {
            montoInicial = (montoInicial * interes > 7000)
                ? +montoInicial * interes
                : montoInicial;
            conceptoInteres += montoInicial * interes;
        }

        return String.format(
            "El monto inicial %1$,.2f$$ con interes %2$d%% en concepto de interes obtuvo %3$,.2f tuvo un monto final de %4$,.1f",
            montoInicial,
            interes * 100,
            conceptoInteres,
            montoFinal
        );
    }

    //
    // 6 Determinar si un alumno aprueba o reprueba un curso, sabiendo que
    // aprobara si su promedio de tres calificaciones es mayor o igual a 70;
    // reprueba en caso contrario

    static boolean ejercicio6() {
        int notaTotal = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Escriba la nota N%1$d", i);
            int nota = input.nextInt();
            notaTotal += nota;
        }

        return (notaTotal / 3) >= 70;
    }

    //
    // 7 Una persona enferma, que pesa 70 kg, se encuentra en reposo y desea saber
    // cuántas calorías consume su cuerpo durante todo el tiempo que realice una
    // misma actividad. Las actividades que tiene permitido realizar son únicamente
    // dormir o estar sentado en reposo. Los datos que tiene son que estando dormido
    // consume 1.08 calorías por minuto y estando sentado en reposo consume 1.66
    // calorías por minuto.

    static String ejercicio7() {
        final double consumoCaloriaDormido = 1.08d;
        final double consumoCaloriaSentado = 1.66d;

        System.out.print("Tipo de actividad\n1. Dormir\n2. Sentado en Reposo");
        int actividad = input.nextInt();

        System.out.print("Tiempo en la actividad: ");
        int tiempo = input.nextInt();

        if (actividad == 1) {
            return String.format(
                "Mientra durmio quemo %1$.2f",
                consumoCaloriaDormido * tiempo
            );
        } else if (actividad == 2) {
            return String.format(
                "Mientra estuvo sentado en reposo quemo %1$.2f",
                consumoCaloriaSentado * tiempo
            );
        } else {
            return null;
        }
    }

    //
    // 8 Hacer un algoritmo que calcule el total a pagar por la compra de camisas.
    // Si se compran tres camisas o más se aplica un descuento del 20% sobre el
    // total de la compra y si son menos de tres camisas un descuento del 10%

    static Double ejercicio8() {
        BiFunction<Double, Double, Double> incrementoFunction = (x, y) ->
            x + (x * y);

        System.out.print("Digite el precio de las camisas");
        double precioCamisa = input.nextDouble();

        System.out.print("Digite la cantidad de camisas a llevar");
        int cantidadCamisas = input.nextInt();

        Double precioTotal = (cantidadCamisas > 0)
            ? (cantidadCamisas < 3)
                ? incrementoFunction.apply(precioCamisa, 0.2)
                : incrementoFunction.apply(precioCamisa, 0.3)
            : null;

        return precioTotal;
    }

    //
    // 9 Una empresa quiere hacer una compra de varias piezas de la misma clase a
    // una fábrica de refacciones. La empresa, dependiendo del monto total de la
    // compra, decidirá qué hacer para pagar al fabricante. Si el monto total de la
    // compra excede de $500 000 la empresa tendrá la capacidad de invertir de su
    // propio dinero un 55% del monto de la compra, pedir prestado al banco un 30% y
    // el resto lo pagara solicitando un crédito al fabricante. Si el monto total de
    // la compra no excede de $500 000 la empresa tendrá capacidad de invertir de su
    // propio dinero un 70% y el restante 30% lo pagara solicitando crédito al
    // fabricante. El fabricante cobra por concepto de intereses un 20% sobre la
    // cantidad que se le pague a crédito.

    static void ejercicio9() {
        System.out.print("Ingrese el monto total de la compra: ");
        double montoTotal = input.nextDouble();

        double inversionPropia, prestamoBanco, creditoFabricante, intereses;

        if (montoTotal > 500000) {
            inversionPropia = montoTotal * 0.55;
            prestamoBanco = montoTotal * 0.30;
            creditoFabricante = montoTotal * 0.15;
        } else {
            inversionPropia = montoTotal * 0.70;
            prestamoBanco = 0;
            creditoFabricante = montoTotal * 0.30;
        }

        intereses = creditoFabricante * 0.20;

        System.out.println("Desglose de pagos:");
        System.out.printf("Inversión propia: $%.2f%n", inversionPropia);
        System.out.printf("Préstamo del banco: $%.2f%n", prestamoBanco);
        System.out.printf("Crédito del fabricante: $%.2f%n", creditoFabricante);
        System.out.printf("Intereses por el crédito: $%.2f%n", intereses);
        System.out.printf("Total a pagar: $%.2f%n", montoTotal + intereses);
    }

    //
    // 10 Leer 2 números; si son iguales que los multiplique, si el primero es mayor
    // que el segundo que los reste y si no que los sume.

    static int ejercicio10() {
        System.out.print("Digite el numero 1 y despues el 2");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 > n2) {
            return n1 - n2;
        } else if (n1 == n2) {
            return n1 * n2;
        } else {
            return n1 + n2;
        }
    }

    //
    // 11 Leer tres números diferentes e imprimir el número mayor de los tres.

    static Integer ejercicio11() {
        ArrayList<Integer> numerosList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print(MessageFormat.format("Digite el numero {0}: ", i));
            int numero = input.nextInt();
            numerosList.add(numero);
        }

        Collections.sort(numerosList, Collections.reverseOrder());

        return numerosList.get(0);
    }

    //
    // 12 Determinar la cantidad de dinero que recibirá un trabajador por concepto
    // de las horas extras trabajadas en una empresa, sabiendo que cuando las horas
    // de trabajo exceden de 40, el resto se consideran horas extras y que estas se
    // pagan al doble de una hora normal cuando no exceden de 8; si las horas extras
    // exceden de 8 se pagan las primeras 8 al doble de lo que se pagan las horas
    // normales y el resto al triple.

    static double ejercicio12(int horasTrabajada, double pagoHora) {
        double salarioTotal = (horasTrabajada > 40)
            ? (horasTrabajada - 40 <= 8)
                ? 40 * pagoHora + ((horasTrabajada - 40) * (pagoHora * 2))
                : 40 * pagoHora +
                ((8 * pagoHora * 2) + (horasTrabajada - 48) * pagoHora * 3)
            : horasTrabajada * pagoHora;

        return salarioTotal;
    }

    //
    // 13 El IMSS requiere clasificar a las personas que se jubilaran en el año de
    // 1997. Existen tres tipos de jubilaciones: por edad, por antigüedad joven y
    // por antigüedad adulta. Las personas adscritas a la jubilación por edad deben
    // tener 60 años o más y una antigüedad en su empleo de menos de 25 años. Las
    // personas adscritas a la jubilación por antigüedad joven deben tener menos de
    // 60 años y una antigüedad en su empleo de 25 años o más. Las personas
    // adscritas a la jubilación por antigüedad adulta deben tener 60 años o más y
    // una antigüedad en su empleo de 25 años o más. Determinar en qué tipo de
    // jubilación, quedara adscrita una persona.

    static String ejercicio13(int edad, int antiguedadEmpleo) {
        return ((edad >= 60) && (antiguedadEmpleo < 25))
            ? "Jubilacion por Edad"
            : ((edad > 60) && (antiguedadEmpleo >= 25))
                ? "Jubilacion por Antiguedad Joven"
                : ((edad >= 60) && (antiguedadEmpleo >= 25))
                    ? "Jubilacion por Antiguedad Adulta"
                    : null;
    }

    //
    // 14 Hacer un algoritmo para calcular la suma de los primeros cien números
    // utilizando un clico repetitivo.

    static int ejercicio14() {
        int sumaTotal = 0;

        for (int i = 1; i <= 100; i++) {
            sumaTotal += i;
        }

        return sumaTotal;
    }

    //
    // 15 una persona debe realizar un muestreo de 50 personas para determinar el
    // promedio de peso de los niños jóvenes adultos y viejos que existen en una
    // zona habitacional, se determinó las categorías con base en las siguiente
    // tabla
    //
    // Categoria-----Edad
    // Ninos-----0-12
    // Jovenes-----13-29
    // Adultos-----30-59
    // Viejos----- >60

    static String ejercicio15() {
        HashMap<Integer, String> pesoHashMap = new HashMap<>();
        String text = "";

        for (int i = 1; i <= 50; i++) {
            int peso = random.nextInt(80);

            String string = ((peso >= 0) && (peso <= 12))
                ? "Nino"
                : ((peso >= 13) && (peso <= 29))
                    ? "Jovenes"
                    : ((peso >= 30) && (peso <= 59))
                        ? "Adulto"
                        : (peso >= 60) ? "Viejo" : null;

            pesoHashMap.put(peso, string);
        }
        return text;
    }
    // 16 desarrollar un algoritmo que lea como dato el valor de n y calcule los
    // valores de la ecuacion : y=3x^2-25
    // Para x inicial en x=2.8 e incremetal en 0.01, el proceso debe repetirse hasta
    // que Y= 0 , o si no se cumple esta condicion hasta que hallan calculado n
    // valores de Y
}
