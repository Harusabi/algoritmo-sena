import java.text.MessageFormat;
import java.util.Scanner;

public class taller2 {


    public static void main(String[] args) {

        // System.out.println(ejercicio2());
        ejercicio4();
    }

    /*
     * Realiza un algoritmo el cual me permita realizar el cálculo de una
     * calculadora (suma, resta, multiplicación, división, residuo, potencia)
     * y en el cual pueda elegir por el
     * usuario la opción deseada
     */

    static void ejercicio1() {

        Scanner dei = new Scanner(System.in);
        int c = 0;
        int opciones = 0;
        int resultado = 0;

        do {

            System.out.println("1.sumar");
            System.out.println("2.restar");
            System.out.println("3.multiplicar");
            System.out.println("4.dividir");
            System.out.println("5.potenciar");
            System.out.println("6.residuo");
            System.out.println("7.salir");

            opciones = dei.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("suma");
                    System.out.println("-------------------");
                    System.out.println("digite numero #1");
                    int n1 = dei.nextInt();

                    System.out.println("digite numero #1");
                    int n111 = dei.nextInt();

                    System.out.println("la suma es : " + resultado);

                    break;

                case 2:
                    System.out.println("resta");
                    System.out.println("-------------------");
                    System.out.println("digite numero #1");
                    int n2 = dei.nextInt();
                    System.out.println("digite numero #2 ");
                    int n3 = dei.nextInt();

                    System.out.println("la resta es : " + resultado);
                    break;
                case 3:
                    System.out.println(" operacion multiplicacion");

                    System.out.println("-------------------");

                    System.out.println("digite numero #1");

                    int n5 = dei.nextInt();
                    System.out.println("digite numero #2 ");
                    int n4 = dei.nextInt();

                    System.out.println("la multiplicacion es : " + resultado);
                    break;
                case 4:
                    System.out.println("divicion");
                    System.out.println("-------------------");
                    System.out.println("digite numero #1");
                    int n6 = dei.nextInt();
                    System.out.println("digite numero #2 ");
                    int n7 = dei.nextInt();
                    if (n7 == 0) {
                        System.out.println("error no se puede dividir por 0");
                    } else {
                        System.out.println("la divicion es  : " + resultado);
                    }

                    break;
                case 5:
                    System.out.println("operacion potencia ");
                    System.out.println("-------------------");
                    System.out.println("digite numero a potenciar ");
                    double n8 = dei.nextInt();

                    System.out.println("digite numero de la elevacion ");
                    double n9 = dei.nextInt();

                    System.out.println("la potencia es  : " + resultado);
                    break;
                case 6:
                    System.out.println("operacion residuo");
                    System.out.println("-------------------");
                    System.out.println("digite numero #1");
                    int n10 = dei.nextInt();
                    System.out.println("digite numero #2 ");
                    int n11 = dei.nextInt();

                    System.out.println("el residuo es  : " + resultado);
                    break;
                case 7:
                    c = 100;
                    break;
                default:
                    System.out.println("la hemos liado digite una opcion ");
                    break;

            }
        } while (opciones == 7);
    }

    /*
     * Realiza un algoritmo el cual me muestre solo los números pares digitados
     * por el usuario, use ciclo for
     */
    static String ejercicio2() {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Digite n veces para pedir numero");
        int n = input.nextInt();
        String text = "Sus numeros pares son: \n";

        for (int i = 1; i <= n; i++) {

            System.out.print(MessageFormat.format("Escriba el numero {0} deseado: ", i));
            int number = input.nextInt();

            text = (number % 2 == 0) ? text.concat(MessageFormat.format("{0} ", number)) : null;

        }
        return text;
    }

    /*
     * Realiza un algoritmo el cual me permita realizar el cálculo de las tablas
     * de multiplicar de un número, use ciclo while?
     * Ejemplo: 1X1, 1X2, 1X3 ……. 1X10.
     */

    static String ejercicio3() {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
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

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Digite n empleados: ");
        int n = input.nextInt();
        int sueldoMinimo = 0;
        int sueldoMaximo = 0;
        Double totalDouble = 0d;
        String text = "";

        for (int i = 1; i <= n; i++) {

            System.out.print(MessageFormat.format("Digite sueldo del empleado #{0}: ", i));
            int sueldo = input.nextInt();

            totalDouble += sueldo;

            sueldoMaximo = Math.max(sueldoMaximo, sueldo);
            sueldoMinimo = Math.min(sueldoMaximo, sueldo);

        }

        text = text.concat(
                String.format("%1$s %4$,.0f %2$s %5$,d %3$s %6$,d",
                        "El sueldo promedio es ", "\nEl sueldo maximo es ",
                        "\nEl sueldo minimo es ", totalDouble / n, sueldoMaximo, sueldoMinimo));

        return text;

    }

    /*
     * 5. ¿Realice un algoritmo que me calcule la nota promedio de varios
     * estudiantes con N
     * materias, use ciclo while?
     */

    /*
     * 6. Realice un algoritmo que me muestre el cálculo, de las bonificaciones y
     * sueldo total de N
     * trabajadores, la fórmula del sueldo total seria la siguiente, use ciclos
     */
}
