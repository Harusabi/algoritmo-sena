
package sena.talleres;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;
import java.text.MessageFormat;

public class ExamenBucles {

    private static Scanner input = new Scanner(System.in).useLocale(Locale.US);

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

    /*
     * 1. Realiza un algoritmo usando ciclos el cual me pida N cantidad de
     * artículos, se deberá aplicar a algunos productos descuentos en porcentajes
     * (ejemplo 10%, 15%, 20%) el porcentaje lo digita el usuario, al final deberá
     * mostrar el total de los artículos, el descuento general y el valor total a
     * pagar.
     */

    static String ejercicio1() {

        System.out.print("Digite la cantidad de articulos: ");
        int nProducto = input.nextInt();

        double descuentoGeneral = 0d;
        String text = "";

        double totalPagar = 0d;

        for (int i = 1; i <= nProducto; i++) {

            System.out.print(MessageFormat.format("Digite el valor del articulo {0}: ", i));
            double valorProducto = input.nextDouble();

            System.out.print(MessageFormat.format("Digite el porcentaje de descuento del articulo {0}: ", i));
            double descuentoProducto = input.nextDouble();

            if (descuentoProducto != 0) {

                descuentoGeneral += valorProducto * (descuentoProducto / 100);
                valorProducto = valorProducto - (valorProducto * (descuentoProducto / 100));

            }

            totalPagar += valorProducto;

            text = text.concat(String.format("Producto N%1$d su descuento es %2$.0f%% el valor es %3$,.1f\n", i,
                    descuentoProducto, valorProducto));

        }

        text = text.concat(String.format("\nEl descuento general fue de %1$,.1f\nEl total a pagar es %2$,.2f",
                descuentoGeneral, totalPagar));

        return text;

    }

    /*
     * 2. Realiza un algoritmo que solicite las edades de un grupo de personas,
     * calcule el promedio de esas edades, cuanto hay mayores de edad, cuantos
     * menores, cuantos son bebes (0-3), cuantos son adultos mayores.
     */

    static String ejercicio2() {

        boolean booleanEdades = true;
        input.nextLine();

        int adultoMayorCantidad = 0;
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int bebesCantidad = 0;

        String edadString = "";
        String text = "";

        System.out.println("Digite :q para dejar de escribir");

        for (int i = 1; booleanEdades; i++) {

            System.out.print(MessageFormat.format("Digite la edad {0}: ", i));
            edadString = input.nextLine();

            if (!edadString.equals(":q")) {

                adultoMayorCantidad = (Integer.parseInt(edadString) >= 65) ? adultoMayorCantidad + 1
                        : adultoMayorCantidad;

                mayoresEdad = ((Integer.parseInt(edadString) >= 18) && (Integer.parseInt(edadString) < 65))
                        ? mayoresEdad + 1
                        : mayoresEdad;

                menoresEdad = ((Integer.parseInt(edadString) > 3) && (Integer.parseInt(edadString) < 18))
                        ? menoresEdad + 1
                        : menoresEdad;

                bebesCantidad = ((Integer.parseInt(edadString) > 0) && (Integer.parseInt(edadString) <= 3))
                        ? bebesCantidad + 1
                        : bebesCantidad;

            } else {

                booleanEdades = false;

            }

        }

        text = text.concat(MessageFormat.format(
                "Cantidad adulto mayor {0}\nCantidad mayores edad {1}\nCantidad menores de edad {2}\nCantidad bebes {3}",
                adultoMayorCantidad, mayoresEdad, menoresEdad, bebesCantidad));

        return text;

    }

    /*
     * 3. Realiza un algoritmo usando el ciclo while el cual me pida las notas de N
     * estudiantes de un 1 curso, que calcule si la nota promedio es mayor a 3 el
     * estudiante gano la materia sino le toca recuperar, al final me debe mostrar
     * el promedio general del curso, la nota más baja y la más alto
     */

    static String ejercicio3() {

        HashMap<String, Double> notasEstudiante = new LinkedHashMap<String, Double>();

        System.out.print("Digite n cantidad notas: ");
        int nCantidad = input.nextInt();

        String text = "";

        double nota = 0d;
        double totalNota = 0d;

        int i = 1;

        while (i <= nCantidad) {

            System.out.print(MessageFormat.format("Digite la nota del estudiante {0}: ", i));
            nota = input.nextDouble();

            notasEstudiante.put(MessageFormat.format("Estudiante {0}", i), nota);

            i++;

        }

        for (String notaMateria : notasEstudiante.keySet()) {

            if (notasEstudiante.get(notaMateria) > 3) {

                text = text.concat(
                        MessageFormat.format("El {0} gano con {1}\n", notaMateria, notasEstudiante.get(notaMateria)));

            } else {

                text = text.concat(
                        MessageFormat.format("El {0} perdio con {1}\n", notaMateria, notasEstudiante.get(notaMateria)));

            }

            totalNota += notasEstudiante.get(notaMateria);

        }

        text = text.concat(MessageFormat.format("El promedio es {0}", totalNota / notasEstudiante.size()));

        return text;
    }

}