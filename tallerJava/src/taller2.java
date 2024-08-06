import java.text.MessageFormat;
import java.util.Scanner;

public class taller2 {

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

    /*
     * Realiza un algoritmo el cual me permita realizar el cálculo de una
     * calculadora (suma, resta, multiplicación, división, residuo, potencia)
     * y en el cual pueda elegir por el
     * usuario la opción deseada
     */

    static String ejercicio1() {

        int opcion = 0;
        String text = "";

        try {
            System.out.println("1.sumar\n2.restar\n3.Multiplicar\n4.Dividir\n5.Potencia\n6.Residuo");
            System.out.print("Opcion: ");
            opcion = input.nextInt();

            System.out.print("Digite n1: ");
            Integer n1 = input.nextInt();
            System.out.print("Digite n2: ");
            Integer n2 = input.nextInt();

            switch (opcion) {
                case 1:

                    text = text.concat(String.format("%1$,d + %2$,d = %3$,d", n1, n2, n1 + n2));
                    break;
                case 2:

                    text = text.concat(String.format("%1$,d - %2$,d = %3$,d", n1, n2, n1 - n2));
                    break;
                case 3:

                    text = text.concat(String.format("%1$,d * %2$,d = %3$,d", n1, n2, n1 * n2));
                    break;
                case 4:

                    if (n1 == 0 || n2 == 0) {
                        text = "Datos Invalidos!";
                        break;
                    }
                    text = text.concat(String.format("%1$,d / %2$,d = %3$,d", n1, n2, n1 / n2));
                    break;
                case 5:

                    text = text.concat(String.format("%1$,d ^ %2$,d = %3$,d", n1, n2, n1 ^ n2));
                    break;
                case 6:

                    text = text.concat(String.format("%1$,d % %2$,d = %3$,d", n1, n2, n1 % n2));
                    break;
                case 7:

                    text = "......Saliendo del programa......";
                    Thread.sleep(2000);
                    break;

                default:
                    System.out.println("Opcion Invalida!");
                    break;
            }

        } catch (Exception e) {
            text = String.format("Excepcion: %1$s", e);
        }
        return text;
    }

    /*
     * Realiza un algoritmo el cual me muestre solo los números pares digitados
     * por el usuario, use ciclo for
     */
    static String ejercicio2() {

        System.out.print("Digite n veces para pedir numero: ");
        int n = input.nextInt();
        String text = "Sus numeros pares son \n";

        for (int i = 1; i <= n; i++) {

            System.out.print(MessageFormat.format("Escriba el numero {0} deseado: ", i));
            int number = input.nextInt();

            text = (number % 2 == 0) ? text.concat(MessageFormat.format("{0} ", number)) : text.concat("");

        }
        return text;
    }

    /*
     * Realiza un algoritmo el cual me permita realizar el cálculo de las tablas
     * de multiplicar de un número, use ciclo while?
     * Ejemplo: 1X1, 1X2, 1X3 ……. 1X10.
     */

    static String ejercicio3() {

        int i = 1;
        String text = "Tabla Multiplicar\n";

        System.out.print("Escriba el numero de la tabla: ");
        int n = input.nextInt();

        while (i <= 10) {

            text = text.concat(MessageFormat.format("{0}x{1} = {2}\n", n, i, n * i));
            i++;

        }

        return text;

    }

    /*
     * Realiza un algoritmo que me calcule el sueldo promedio de N empleados de
     * una empresa, cuantos ganan más de un sueldo mínimo y cuantos ganan menos de
     * ese sueldo, use ciclo for
     */

    static String ejercicio4() {

        System.out.print("Digite n empleados: ");
        int n = input.nextInt();

        int sueldoMinimo = 0;
        int sueldoMaximo = 0;

        Double totalDouble = 0d;

        String format = "El sueldo promedio es %1$,.0f\nEl sueldo maximo es %2$,d\nEl sueldo minimo es %3$,d";
        String text = "";

        for (int i = 1; i <= n; i++) {

            System.out.print(MessageFormat.format("Digite sueldo del empleado #{0}: ", i));
            int sueldo = input.nextInt();

            totalDouble += sueldo;

            sueldoMaximo = Math.max(sueldoMaximo, sueldo);
            sueldoMinimo = Math.min(sueldoMaximo, sueldo);

        }

        text = text.concat(
                String.format(format, totalDouble / n, sueldoMaximo, sueldoMinimo));

        return text;

    }

    /*
     * 5. ¿Realice un algoritmo que me calcule la nota promedio de varios
     * estudiantes con N materias, use ciclo while?
     */
    static String ejercicio5() {

        System.out.print("Digite n estudiantes: ");
        int nEstudiantes = input.nextInt();

        Double totalNota = 0d;
        String text = "";

        int i = 1;
        while (i <= nEstudiantes) {

            System.out.print(MessageFormat.format("Escriba n materia para el estudiante {0}: ", i));
            int nMaterias = input.nextInt();

            for (int x = 1; x <= nMaterias; x++) {

                System.out.print(MessageFormat.format("Digite la nota del estudiante {01} materia {1}: ", i, x));
                double nota = input.nextDouble();
                totalNota = Double.sum(totalNota, nota);

            }

            text = text
                    .concat(String.format("El promedio del estudiante %1$d es %2$.1f\n", i,
                            totalNota / nMaterias));
            totalNota = 0d;
            i++;

        }

        return text;

    }

    /*
     * 6. Realice un algoritmo que me muestre el cálculo, de las bonificaciones y
     * sueldo total de N trabajadores, la fórmula del sueldo total seria la
     * siguiente, use ciclos
     * 
     * Tipo empleado Bonificación Formula General
     * A 20% Sueldo=Sueldo + (Sueldo*20%)
     * B 30% Sueldo=Sueldo + (Sueldo*30%)
     * C 40% Sueldo=Sueldo + (Sueldo*40%)
     */
    static String ejercicio6() {

        System.out.print("Digite n trabajadores: ");
        int nTrabajadores = input.nextInt();
        input.nextLine();

        String format = "Trabajador %1$d es tipo %2$c con sueldo %3$,.1f aplicando bonificacion %4$,.1f\n";
        String text = "";

        for (int i = 1; i <= nTrabajadores; i++) {

            System.out.print(MessageFormat.format("Digite el tipo del trabjador #{0}: ", i));
            Character tipoEmpleado = input.nextLine().charAt(0);

            System.out.print(MessageFormat.format("Digite el sueldo del trabjador #{0}: ", i));
            Double sueldo = input.nextDouble();
            input.nextLine();

            switch (Character.toLowerCase(tipoEmpleado)) {
                case 'a':

                    text = text.concat(String.format(format, i, Character.toUpperCase(tipoEmpleado), sueldo,
                            sueldo + (sueldo * 0.2)));
                    break;

                case 'b':

                    text = text.concat(String.format(format, i, Character.toUpperCase(tipoEmpleado), sueldo,
                            sueldo + (sueldo * 0.3)));
                    break;

                case 'c':

                    text = text.concat(String.format(format, i, Character.toUpperCase(tipoEmpleado), sueldo,
                            sueldo + (sueldo * 0.4)));
                    break;

                default:

                    System.out.println("Datos Invalidos");
                    break;
            }

        }
        return text;

    }

}
