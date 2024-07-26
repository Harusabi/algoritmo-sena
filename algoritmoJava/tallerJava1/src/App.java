import java.util.Scanner;

public class App {
    static void ejercicio1() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite su edad: ");
        int edad = input.nextInt();

        System.out.println("Escriba true si es colombiano o false en caso contrario: ");
        boolean nacionalidad = input.nextBoolean();

        input.nextLine();
        System.out.println("Es Mujer (F) o Hombre (M)");
        String sexo = input.nextLine().toLowerCase();

        System.out.println("Ha prestado anteriormente el servicio militar? true o false");
        boolean definicionMilitar = !input.nextBoolean();

        System.out.println("Tiene atecendes penales: true si tiene y false si no tiene ");
        boolean atecendes = !input.nextBoolean();

        if (nacionalidad && definicionMilitar && atecendes && sexo.equals("m") && edad >= 18 && edad <= 24) {

            System.out.println("Esta apto para prestar servicio militar");

        } else
            System.out.println("No esta apto para prestar servicio militar");

        input.close();

    }

    static int ejercicio2() {

        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el numero que deseé: ");
        int numero = input.nextInt();
        int resultado = numero;

        for (int i = numero - 1; i <= 1; i--) {

            resultado *= i;

        }

        input.close();
        return resultado;
    }

    static int ejercicio3() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite la base de su rectagunlo:");
        int base = input.nextInt();

        System.out.println("Digite la altura de su rectagunlo:");
        int altura = input.nextInt();

        int area = base * altura;

        input.close();

        if (base == 0 && altura == 0) {
            System.out.print("Datos invalidos");
        }
        return area;

    }

    static String ejercicio4() {

        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el numero que desee");
        int number = input.nextInt();
        String texto = "";

        if (number % 2 == 0) {

            if (number < 0)
                texto = "Su numero es par y negativo";
            if (number == 0)
                texto = "Su numero es par y cero";
            else
                texto = "Su numero es par y positivo";

        }

        if (number % 2 != 0) {

            if (number < 0)
                texto = "Su numero es impar y negativo";
            if (number == 0)
                texto = "Su numero es impar y cero";
            else
                texto = "Su numero es impar y positivo";

        }

        input.close();
        return texto;
    }

    static int ejercicio5() {

        Scanner input = new Scanner(System.in);
        int resultado = 0;

        System.out.println("Escriba la operacion que quiera");
        int operacion = input.nextInt();
        System.out.println("Escriba el numero A y B");
        int a = input.nextInt();
        int b = input.nextInt();

        switch (operacion) {
            case 1:

                resultado = a + b;

                break;
            case 2:

                resultado = a - b;

                break;
            case 3:

                resultado = a * b;

                break;
            case 4:

                if (a != 0 && b != 0) {
                    resultado = a / b;
                } else
                    System.out.println("Numeros invalidos");

                break;

            default:
                System.out.println("Operacion Invalida");
                break;
        }

        input.close();
        return resultado;
    }

    static boolean ejercicio6() {

        Scanner input = new Scanner(System.in);
        boolean esPrimo = false;

        System.out.println("Escriba el nummero que desee");
        int numero = input.nextInt();

        for (int x = 1; x < numero; x++) {
            System.out.println("null");
        }

        return esPrimo;
    }

    public static void main(String[] args) {
        System.out.println(ejercicio5());
    }

}
