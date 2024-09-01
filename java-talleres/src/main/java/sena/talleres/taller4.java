package sena.talleres;

import java.util.Scanner;


public class taller4 {

  // Codigo revisado y corregido
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Integer opcion = 0;

    try {

      do {

        System.out.println("Escriba el numero del ejercicio que desea");

        if (scanner.hasNextInt()) {
          opcion = scanner.nextInt();
        } else {
          System.out.println("Error en " + scanner);
        }
        switch (opcion) {
          case 1:
            System.out.println("Apto para prestar servicio? " + ejercicio1());
            Thread.sleep(3000);
            break;
          case 2:
            System.out.println("El resultado factorial es: " + ejercicio2());
            Thread.sleep(3000);
            break;
          case 3:
            System.out.println("El area de su figura es: " + ejercicio3());
            Thread.sleep(3000);
            break;
          case 4:
            System.out.println(ejercicio4());
            Thread.sleep(3000);
            break;
          case 5:
            System.out.println("El resultado de su operacion es: " + ejercicio5());
            Thread.sleep(3000);
            break;
          case 6:
            System.out.println("El numero es primo? " + ejercicio6());
            Thread.sleep(3000);
            break;
          case 0:
            System.out.println("Saliendo del programa...");
            break;
          default:
            System.out.println(
                "Opción no válida. Por favor, elija un número entre 1 y 6 o 0 para salir.");
            break;
        }
      } while (opcion != 0);

      scanner.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  // Codigo revisado y corregido
  public static Boolean ejercicio1() {

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    System.out.print("Digite su edad: ");
    Integer edad = input.nextInt();

    System.out.print("Escriba true si es colombiano o false en caso contrario: ");
    Boolean nacionalidad = input.nextBoolean();

    input.nextLine();
    System.out.print("Es Mujer (F) o Hombre (M): ");
    String sexo = input.nextLine().toLowerCase();

    while ((sexo.length() != 1) || !(sexo.equals("f")) && !(sexo.equals("m"))) {

      System.out.print("Error, vuelva a escribir el sexo: ");
      sexo = input.nextLine().toLowerCase();
    }

    System.out.print("Ha prestado anteriormente el servicio militar? true o false ");
    Boolean definicionMilitar = !input.nextBoolean();

    System.out.print("Tiene atecendes penales: true si tiene y false si no tiene ");
    Boolean atecendes = !input.nextBoolean();

    Boolean prestacionServicio =
        ((nacionalidad)
                && (definicionMilitar)
                && (atecendes)
                && (sexo.equals("m"))
                && (edad >= 18)
                && (edad <= 24))
            ? true
            : false;

    return prestacionServicio;
  }

  // Codigo revisado y corregido
  static Integer ejercicio2() {

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    System.out.print("Escriba el numero que deseé: ");
    Integer numero = input.nextInt();
    Integer resultado = numero;

    for (Integer i = numero - 1; i > 1; i--) {

      resultado *= i;
    }

    return resultado;
  }

  // Codigo revisado y corregido
  static Integer ejercicio3() {

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    System.out.println("Digite la base de su rectagunlo:");
    Integer base = input.nextInt();

    System.out.println("Digite la altura de su rectagunlo:");
    Integer altura = input.nextInt();

    Integer area = base * altura;

    return area;
  }

  // Codigo revisado y corregido
  static String ejercicio4() {

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    System.out.println("Escriba el numero que desee");
    Integer number = input.nextInt();

    String texto =
        (number == 0)
            ? "El numero es cero"
            : (number > 0)
                ? (number % 2 == 0)
                    ? "El numero es positivo y par"
                    : "El numero es positivo e impar"
                : (number % 2 == 0)
                    ? "El numero es negativo y par"
                    : "El numero es negativo e impar";
    return texto;
  }

  // Codigo revisado y corregido
  static Integer ejercicio5() {

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    Integer resultado = 0;

    System.out.println("Escriba la operacion que quiera");
    Integer operacion = input.nextInt();
    System.out.println("Escriba el numero A y B");
    Integer a = input.nextInt();
    Integer b = input.nextInt();

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
        while ((a == 0) && (b == 0)) {

          System.out.println("Datos Erroneos, vuelva a digitarlos");
          a = input.nextInt();
          b = input.nextInt();
        }

        resultado = a / b;

        break;

      default:
        System.out.println("Operacion Invalida");
        break;
    }

    return resultado;
  }

  // Codigo revisado y corregido
  static Boolean ejercicio6() {

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    Boolean esPrimo = true;
    Integer x = 2;

    System.out.println("Escriba el numero que desee");
    Integer numero = input.nextInt();

    while ((esPrimo) && (x < numero)) {
      if (numero % x == 0) {
        esPrimo = false;
      }
      x++;
    }
    return esPrimo;
  }
}
