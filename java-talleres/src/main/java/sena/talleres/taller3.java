
package sena.talleres;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Taller3 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer opcion = 0;

        try {

            do {

                System.out.println("Numero del ejercicio 0 para finalizar programa");
                System.out.print("Opcion: ");

                if (input.hasNextInt()) {
                    opcion = input.nextInt();
                } else {
                    System.out.println("Error en el escaner");
                }
                switch (opcion) {
                case 1:
                    System.out.println(ejercicio1());
                    Thread.sleep(3000);
                    break;
                case 2:
                    System.out.println(ejercicio2());
                    Thread.sleep(3000);
                    break;
                case 3:
                    System.out.println(ejercicio3());
                    Thread.sleep(3000);
                    break;
                case 4:
                    System.out.println(ejercicio4());
                    Thread.sleep(3000);
                    break;
                case 5:
                    System.out.println(ejercicio5());
                    Thread.sleep(3000);
                    break;
                case 6:
                    System.out.println(ejercicio6());
                    Thread.sleep(3000);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija un número entre 1 y 6 o 0 para salir.");
                    break;
                }
            } while (opcion != 0);

            input.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //
    // 1. ¿Realiza un algoritmo el cual me permita ver los números pares e impares
    // digitados por un usuario, los cuales deberán ser llenados antes en un solo
    // vector y al final debe recorrer dicho vector y mostrar primero los impares
    // luego los pares en orden según el consecutivo del número? Ejemplo: el usuario
    // digita 11,4,5,1,3,6,8,9,3,2 Deberá mostrar primero: 1,3,3,5,9,11. Deberá
    // mostrar segundo: 2,4,6,8.

    static String ejercicio1() {

        System.out.print("Digite n veces para digitar numero: ");
        int limite = input.nextInt();
        int[] arrayIntegers = new int[limite];

        for (int i = 0; i < limite; i++) {

            System.out.println(MessageFormat.format("Digite el numero #{0}", i));
            int number = input.nextInt();
            arrayIntegers[i] = number;

        }

        Arrays.sort(arrayIntegers);
        String text = "Numeros pares: ";

        for (int i = 0; i < limite; i++) {

            text = (arrayIntegers[i] % 2 == 0) ? text.concat(MessageFormat.format("{0} ", arrayIntegers[i]))
                    : text.concat("");

        }

        text = text.concat("\nNumeros impares: ");

        for (int i = 0; i < limite; i++) {

            text = (arrayIntegers[i] % 2 != 0) ? text.concat(MessageFormat.format("{0} ", arrayIntegers[i]))
                    : text.concat("");

        }

        return text;

    }

    //
    // 2. ¿Realiza un algoritmo que guarde los nombres de un cliente en un vector y
    // luego recorra el vector y cuente muestre cuantos tienen el mismo nombre?
    // Ejemplo: juan, Carlos, juan, Alberto Juan: 2 Carlos: 1 Alberto: 1

    static String ejercicio2() {

        ArrayList<String> nombreStrings = new ArrayList<String>();

        boolean ciclo = true;
        String text = "";

        while (ciclo) {

            System.out.print("Escriba el nombre del empleado, escribir :q para dejar de escribir: ");
            String nombre = input.nextLine().toLowerCase();

            ciclo = (nombre.equals(":q") ? false : true);

            nombreStrings.add(nombre);

        }

        nombreStrings.removeLast();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(nombreStrings);

        for (String nombres : linkedHashSet) {

            int contador = 0;

            for (String strings : nombreStrings) {

                contador = (nombres.equals(strings)) ? contador + 1 : contador + 0;

            }

            text = text.concat(MessageFormat.format("El nombre {0} se repite {1}\n", nombres.toUpperCase(), contador));

        }

        return text;

    }

    //
    // 3.¿Realiza un algoritmo que guarde las notas de los estudiantes en un vector
    // y calcule el promedio de sus notas según la materia (la nota máxima será 100,
    // se gana la materia con 70 hacia delante y se pierde con 69 hacia abajo) y al
    // final se recorrerá un vector y se le dirá a acaba estudiante que materias
    // perdió? Ejemplo: Juan: en matemáticas, primera nota: 50, segunda nota: 40;
    // tercera nota: 70, el promedio fue 60, al final deberá recorrer todas las
    // materias de todos los estudiantes, decir cuales perdió o gano.

    static String ejercicio3() {

        boolean booleanEstudiante = true;
        boolean booleanMaterias = true;
        boolean booleanNotas = true;

        String text = "";
        String materia = "";

        HashMap<String, Integer> notasMaterias = new LinkedHashMap<String, Integer>();

        System.out.println(
                "Escriba :q para cambiar de materia, :q! para cambiar estudiante y :q!! para salir del bucle\n");
        for (int i = 1; booleanEstudiante; i++) {

            System.out.print(MessageFormat.format("Escriba el nombre del estudiante #{0}: ", i));
            String estudiante = input.nextLine();

            text = text.concat(MessageFormat.format("\n{0}:\n\t", estudiante));

            for (int y = 1; booleanMaterias; y++) {

                System.out.print(MessageFormat.format("Escriba el nombre de la materia #{0}: ", y));
                materia = input.nextLine();

                int totalNota = 0;

                for (int x = 1; booleanNotas; x++) {

                    System.out.print(MessageFormat.format("Ingrese la nota #{0} de {1}: ", x, materia));
                    String entradaDatos = input.nextLine().toLowerCase();

                    Pattern pattern = Pattern.compile(":q|:q!|:q!!");
                    Matcher matcher = pattern.matcher(entradaDatos);

                    booleanNotas = !(matcher.matches());
                    booleanMaterias = (!(booleanNotas) && (entradaDatos.equals(":q!"))) ? false : booleanMaterias;
                    booleanEstudiante = (!(booleanNotas) && !(booleanMaterias) && (entradaDatos.equals(":q!!"))) ? false
                            : booleanEstudiante;

                    pattern = Pattern.compile("\\d+");
                    matcher = pattern.matcher(entradaDatos);
                    if (matcher.matches()) {

                        int nota = Integer.parseInt(entradaDatos);
                        notasMaterias.put(MessageFormat.format("Nota #{0}", x), nota);

                        totalNota += nota;

                    }
                }

                text = text.concat(MessageFormat.format("{0}: Aprobado({1})\n\t{2}\n\t", materia,
                        totalNota / notasMaterias.size() > 69, notasMaterias.toString()));
                booleanNotas = true;

            }
            booleanMaterias = true;
        }

        return text;

    }

    //
    // 4. ¿Realiza un algoritmo para digitar artículos en un vector, deberá llevar
    // su código, nombre, el precio, el iva, la cantidad y su total, al final debe
    // mostrar los artículos en orden según su código y el nombre, el precio, el
    // iva, la cantidad y su total?

    static String ejercicio4() {

        ArrayList<ArrayList<String>> articuloString = new ArrayList<ArrayList<String>>();

        boolean booleanEntradaDatos = true;

        String codigoProducto = "";
        String nombreProducto = "";
        String precioProducto = "";
        String ivaProducto = "";
        String cantidadProducto = "";

        System.out.println("Digite :q para dejar de pedir datos");

        while (booleanEntradaDatos) {

            System.out.print("Digite el codigo del producto en formato numerico: ");
            codigoProducto = input.nextLine();

            if (codigoProducto.contentEquals(":q")) {
                System.out.println("Se ha dejado de recibir datos");
                booleanEntradaDatos = false;
                break;
            } else {
                Integer.parseInt(codigoProducto);
            }

            System.out.print("Escriba el nombre del producto: ");
            nombreProducto = input.nextLine();

            System.out.print("Digite el precio del producto: ");
            precioProducto = input.nextLine();
            Integer.parseInt(precioProducto);

            System.out.print("Digite el IVA del producto: ");
            ivaProducto = input.nextLine();
            Integer.parseInt(ivaProducto);

            System.out.print("Digite la cantidad del producto: ");
            cantidadProducto = input.nextLine();
            Integer.parseInt(cantidadProducto);

            double precioTotal = Double.parseDouble(precioProducto) * Integer.parseInt(cantidadProducto)
                    * (1 + Double.parseDouble(ivaProducto) / 100);

            ArrayList<String> articulo = new ArrayList<>();

            articulo.add(codigoProducto);
            articulo.add(nombreProducto);
            articulo.add(precioProducto);
            articulo.add(ivaProducto);
            articulo.add(cantidadProducto);
            articulo.add(String.valueOf(precioTotal));

            articuloString.add(articulo);

        }

        Collections.sort(articuloString, (a, b) -> a.get(0).compareTo(b.get(0)));

        return articuloString.toString();

    }

    //
    // 5. ¿Realiza un algoritmo en cual el usuario digitara números a los cuales él
    // les desea calcular sus tablas de multiplicar hasta 10, todos los cálculos
    // deben ir en un solo vector, al final las tablas las mostrar en orden de mayor
    // a menor?

    static String ejercicio5() {

        ArrayList<Integer> numerosList = new ArrayList<Integer>();

        boolean booleanEntradaDatos = true;

        while (booleanEntradaDatos) {

            System.out.print("Digite el numero que desee: ");
            String numeroString = input.nextLine();

            if (numeroString.contentEquals(":q")) {

                System.out.println("Se ha dejado de recibir datos");
                booleanEntradaDatos = false;
                break;

            }

            numerosList.add(Integer.parseInt(numeroString));

        }

        Collections.sort(numerosList, (a, b) -> b.compareTo(a));

        ArrayList<String> tablaMultiplicacion = new ArrayList<String>();

        for (int numero : numerosList) {

            for (int x = 10; x >= 1; x--) {

                tablaMultiplicacion.add(tablaMultiplicacion.size(),
                        MessageFormat.format("{0} x {1} = {2}\n", numero, x, numero * x));

            }

        }

        return tablaMultiplicacion.toString();
    }

    //
    // 6. ¿Realiza un algoritmo el cual un usuario deberá llenar el vector con datos
    // tipo decimal? Primero debe recorre el vector, ordenarlo en orden ascendente
    // de menor a mayor y mostrarlos los datos del vector (ejemplo: 1,2,3,4,5).
    // Segundo debe recorre el vector, ordenarlo en orden descendente de mayor a
    // menor y mostrarlos los datos del vector (ejemplo: 5,4,3,2,1). Al final deberá
    // eliminar los números repetidos y mostrar los datos quedan en el vector.
    static String ejercicio6() {

        ArrayList<Double> numerosList = new ArrayList<Double>();

        boolean booleanEntradaDatos = true;

        String text = "Orden Ascedente: ";

        System.out.println("Escribir :q para dejar de escribir");

        while (booleanEntradaDatos) {

            System.out.print("Digite el numero que desee: ");
            String numeroString = input.nextLine();

            if (numeroString.contentEquals(":q")) {

                System.out.println("Se ha dejado de recibir datos");
                booleanEntradaDatos = false;
                break;

            }

            numerosList.add(Double.parseDouble(numeroString));

        }

        Collections.sort(numerosList, (a, b) -> a.compareTo(b));

        for (double numero : numerosList) {

            text = text.concat(String.format("%1$,.1f ", numero));

        }

        Collections.sort(numerosList, (a, b) -> b.compareTo(a));

        text = text.concat("\nOrden Descedente: ");

        for (double numero : numerosList) {

            text = text.concat(String.format("%1$,.1f ", numero));

        }

        Set<Double> listaLimpia = new HashSet<Double>(numerosList);

        text = text.concat("\nOrden Descedente y sin duplicado: ");

        for (double numero : listaLimpia) {

            text = text.concat(String.format("%1$,.1f ", numero));

        }

        return text;
    }

}