
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class taller3 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio3();
    }

    /*
     * 1. ¿Realiza un algoritmo el cual me permita ver los números pares e impares
     * digitados por un
     * usuario, los cuales deberán ser llenados antes en un solo vector y al final
     * debe recorrer dicho vector
     * y mostrar primero los impares luego los pares en orden según el consecutivo
     * del número?
     * Ejemplo: el usuario digita 11,4,5,1,3,6,8,9,3,2
     * Deberá mostrar primero: 1,3,3,5,9,11.
     * Deberá mostrar segundo: 2,4,6,8.
     */
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

    /*
     * 2. ¿Realiza un algoritmo que guarde los nombres de un cliente en un vector y
     * luego recorra el vector y cuente muestre cuantos tienen el mismo nombre?
     * Ejemplo: juan, Carlos, juan, Alberto
     * Juan: 2
     * Carlos: 1
     * Alberto: 1
     */

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

    /*
     * 3.¿Realiza un algoritmo que guarde las notas de los estudiantes en un vector
     * y calcule el promedio de sus notas según la materia (la nota máxima será 100,
     * se gana la materia con 70 hacia delante y se pierde con 69 hacia abajo) y al
     * final se recorrerá un vector y se le dirá a acaba estudiante que materias
     * perdió?
     * Ejemplo: Juan: en matemáticas, primera nota: 50, segunda nota: 40;
     * tercera nota: 70, el promedio fue 60, al final deberá recorrer todas las
     * materias de todos los estudiantes, decir cuales perdió o gano.
     */

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

    /*
     * 4. ¿Realiza un algoritmo para digitar artículos en un vector, deberá llevar
     * su código, nombre, el precio, el iva, la cantidad y su total, al final debe
     * mostrar los artículos en orden según su código y el nombre, el precio, el
     * iva, la cantidad y su total?
     */
    /*
     * 5. ¿Realiza un algoritmo en cual el usuario digitara números a los cuales él
     * les desea calcular sus tablas de multiplicar hasta 10, todos los cálculos
     * deben ir en un solo vector, al final las tablas las mostrar en orden de mayor
     * a menor?
     */
    /*
     * 6. ¿Realiza un algoritmo el cual un usuario deberá llenar el vector con datos
     * tipo decimal? Primero debe recorre el vector, ordenarlo en orden ascendente
     * de menor a mayor y mostrarlos los
     * datos del vector (ejemplo: 1,2,3,4,5).
     * Segundo debe recorre el vector, ordenarlo en orden descendente de mayor a
     * menor y mostrarlos los datos del vector
     * (ejemplo: 5,4,3,2,1).
     * Al final deberá eliminar los números repetidos y mostrarlos datos quedan en
     * el vector.
     */

}