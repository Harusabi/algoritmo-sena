package sena.talleres;

import java.util.Scanner;

public class ExamenCiclo {

  public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    ejercicio2();
  }

  // 1. Realiza un algoritmo que simule las operaciones básicas de un cajero automático: consulta de
  // saldo, depósito, retiro y transferencia de dinero.
  static double ejercicio1() {
    int opcion;
    double saldo = 0d;

    do {

      System.out.println("\n");
      System.out.println(
          "1. Consultar Saldo\n"
              + "2. Depositar Saldo\n"
              + "3. Retirar Saldo\n"
              + "4. Transferir Saldo\n"
              + "0. Salir");

      System.out.print("Digite la operacion que quiere hacer: ");
      opcion = input.nextInt();

      switch (opcion) {
        case 1:
          System.out.printf("Su saldo es %1$,.2f\n", saldo);
          break;

        case 2:
          System.out.print("Digite el saldo que va a depositar: ");
          double saldoDepositar = input.nextDouble();
          saldo += saldoDepositar;
          break;

        case 3:
          System.out.print("Digite el saldo que va a retirar: ");
          double saldoRetiro = input.nextDouble();
          saldo -= saldoRetiro;

          System.out.printf("Acaba de retirar %1$,.2f\n", saldoRetiro);
          break;

        case 4:
          System.out.print("Digite el saldo que va a transferir: ");
          double saldoTransferido = input.nextDouble();
          saldo -= saldoTransferido;

          System.out.printf("Acaba de transferir %1$,.2f\n", saldoTransferido);
          break;

        case 0:
          System.out.println("Saliendo ...");
          break;

        default:
          System.out.println("Opcion Invalida");
          break;
      }

    } while (opcion != 0);
    return saldo;
  }

  // 2. Realiza un algoritmo que calcule el IMC (Indice de Masa Corporal) para N cantidad de
  // personas en un gimnasio según la siguiente formula:
  //
  // IMC = Peso (Kg) / Altura (m) ^ 2

  static StringBuilder ejercicio2() {

    System.out.print("Digite N personas a tomar datos: ");
    int n = input.nextInt();
    StringBuilder text = new StringBuilder();

    for (int i = 0; i < n; i++) {

      System.out.printf("Digite el peso (Kg) de la persona %1$d: ", (i + 1));
      int peso = input.nextInt();

      System.out.printf("Digite la altura (m) de la persona %1$d: ", (i + 1));
      double altura = input.nextDouble();

      double imc = peso / (altura * altura);

      text.append("La persona " + (i + 1) + " ")
          .append(
              (imc < 18.5)
                  ? "tiene bajo peso o delgado\n"
                  : (imc > 18.5 && imc < 25)
                      ? "peso es adecuado o acetable\n"
                      : (imc >= 25 && imc < 30)
                          ? "tiene sobrepeso o sobrepeso\n"
                          : (imc >= 30 && imc < 35)
                              ? "tiene obesidad grado 1 o obesidad\n"
                              : (imc >= 35 && imc < 40)
                                  ? "tiene obesidad tipo 2 o obesidad\n"
                                  : "null");
    }
    return text;
  }

  static Double ejercicio3() {
    System.out.print("Digite la cantidad de camisas a llevar: ");
    int cantidadCamisas = input.nextInt();

    System.out.print("Digite el precio de cada camisa: ");
    double precioCamisa = input.nextDouble();

    if (cantidadCamisas <= 0) {
      return null; // O manejar este caso de otra manera
    }

    double precioTotalSinDescuento = precioCamisa * cantidadCamisas;
    double descuento = (cantidadCamisas >= 3) ? 0.20 : 0.10;
    double precioFinal = precioTotalSinDescuento * (1 - descuento);

    return precioFinal;
  }
}
