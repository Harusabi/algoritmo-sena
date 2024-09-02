package sena.talleres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

  public static Random random = new Random();
  public static Scanner input = new Scanner(System.in);
  static ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

  public static void main(String[] args) {
    System.out.println(ejercicio8(5, 6, 10));
  }

  // 1. ¿Realiza un algoritmo el cual me permita calcular, la multiplicación de la columna 3 y la
  // división de la columna 4 de una matriz de (4,4), recuerde que no se puede dividir un cero?

  static String ejercicio1() throws ArithmeticException {

    for (int x = 0; x < 4; x++) {
      matriz.add(new ArrayList<>());
      for (int y = 0; y < 4; y++) {
        matriz.getLast().add(random.nextInt(99));
      }
    }

    Integer multiplicacion = matriz.stream().mapToInt(num -> num.get(2)).reduce(1, (a, b) -> a * b);
    OptionalDouble division =
        matriz.stream()
            .mapToDouble(num -> num.get(3))
            .reduce(
                (a, b) -> {
                  if (a == 0 | b == 0) {
                    throw new ArithmeticException("Division por 0");
                  }
                  return a / b;
                });

    return String.format(
        "Resultado Multiplicacion: %1$,d\nResultado Division: %2$.3e\n",
        multiplicacion, division.getAsDouble());
  }

  // 2. ¿Realiza un algoritmo el cual me permita calcular, la suma de la fila 2 y la suma de la fila
  // 1 de una matriz de (4,5)?

  static String ejercicio2() {

    for (int x = 0; x < 4; x++) {
      matriz.add(new ArrayList<>());
      for (int y = 0; y < 5; y++) {
        matriz.getLast().add(random.nextInt(99));
      }
    }

    Integer sumcol1 = matriz.get(0).stream().mapToInt(Integer::intValue).sum();
    Integer sumcol2 = matriz.get(1).stream().mapToInt(Integer::intValue).sum();

    return String.format(
        "Resultado Columna 1: %1$,d\nResultado Columna 2: %2$,d\n", sumcol1, sumcol2);
  }

  // 3. ¿Realiza un algoritmo que me pida un número y luego reste el número con los números en una
  // matriz de (6,6)?

  static ArrayList<ArrayList<Integer>> ejercicio3() {

    for (int x = 0; x < 6; x++) {
      matriz.add(new ArrayList<>());
      for (int y = 0; y < 6; y++) {
        matriz.getLast().add(random.nextInt(99));
      }
    }

    System.out.print("Escriba el numero que desea restar: ");
    int restador = input.nextInt();

    matriz =
        matriz.stream()
            .map(
                fila ->
                    fila.stream()
                        .map(elemento -> elemento - restador)
                        .collect(Collectors.toCollection(ArrayList::new)))
            .collect(Collectors.toCollection(ArrayList::new));

    return matriz;
  }

  // 4. ¿Realiza un algoritmo el cual me permita calcular la suma de dos matrices de (3,3) como lo
  // muestra el ejemplo, se debe crear una nueva matriz con el resultado de la operación?
  // Ejemplo:
  // A)
  // 2 4 8
  // 20 10 5
  // 5 4 3
  // B)
  // 1 11 7
  // 3 4 6
  // 9 2 2

  // Resultado=A+B

  // 3 15 15
  // 23 14 11
  // 14 6 5

  static ArrayList<ArrayList<Integer>> ejercicio4() {

    ArrayList<ArrayList<Integer>> matriz1 = new ArrayList<>();
    ArrayList<ArrayList<Integer>> matriz2 = new ArrayList<>();
    ArrayList<ArrayList<Integer>> sumaArrayLists = new ArrayList<>();

    matriz1 =
        IntStream.range(0, 6)
            .mapToObj(
                x ->
                    IntStream.range(0, 6)
                        .mapToObj(y -> random.nextInt(99))
                        .collect(Collectors.toCollection(ArrayList::new)))
            .collect(Collectors.toCollection(ArrayList::new));

    matriz2 =
        IntStream.range(0, 6)
            .mapToObj(
                x ->
                    IntStream.range(0, 6)
                        .mapToObj(y -> random.nextInt(99))
                        .collect(Collectors.toCollection(ArrayList::new)))
            .collect(Collectors.toCollection(ArrayList::new));

    for (int x = 0; x < matriz1.size(); x++) {

      ArrayList<Integer> filaList = new ArrayList<>();

      for (int y = 0; y < matriz1.size(); y++) {

        filaList.addLast(matriz1.get(x).get(y) + matriz2.get(x).get(y));
      }

      sumaArrayLists.add(filaList);
    }

    return sumaArrayLists;
  }

  // 5. ¿Realiza un algoritmo el cual me permita calcular el promedio de cualquier matriz sin
  // importar sus dimensiones en las siguientes posiciones como lo muestra el ejemplo?
  // Ejemplo:
  // A)
  // 2 4 8
  // 20 10 5
  // 5 4 3

  static String ejercicio5(int colum, int fila, int limite_relleno) {

    matriz =
        IntStream.range(0, fila)
            .mapToObj(
                x ->
                    IntStream.range(0, colum)
                        .mapToObj(y -> random.nextInt(0, limite_relleno))
                        .collect(Collectors.toCollection(ArrayList::new)))
            .collect(Collectors.toCollection(ArrayList::new));

    int sumFila = matriz.get(0).stream().mapToInt(Integer::intValue).sum();
    int sumCol = matriz.stream().mapToInt(num -> num.get(1)).sum();
    double promedio = (double) (sumFila + sumCol) / matriz.size();

    matriz.forEach(
        row ->
            System.out.println(
                row.stream().map(String::valueOf).collect(Collectors.joining("\t"))));

    return String.format("\nPromedio de la matriz: %1$.3f", promedio);
  }

  // 6. ¿Realiza un algoritmo el cual me permita calcular el promedio de cualquier matriz sin
  // importar sus dimensiones en las siguientes posiciones como lo muestra el ejemplo?
  // Ejemplo:
  // A)
  // 2 4 8
  // 20 10 5
  // 5 4 3

  static String ejercicio6(int colum, int fila, int limite_relleno) {

    matriz =
        IntStream.range(0, fila)
            .mapToObj(
                x ->
                    IntStream.range(0, colum)
                        .mapToObj(y -> random.nextInt(0, limite_relleno))
                        .collect(Collectors.toCollection(ArrayList::new)))
            .collect(Collectors.toCollection(ArrayList::new));

    double sum = IntStream.range(0, Math.min(fila, colum)).map(x -> matriz.get(x).get(x)).sum();
    double promedio = sum / Math.min(fila, colum);

    matriz.forEach(
        row ->
            System.out.println(
                row.stream().map(String::valueOf).collect(Collectors.joining("|\t|"))));

    return String.format("Promedio de la matriz: %1$.3f", promedio);
  }

  // 7. ¿Realiza un algoritmo el cual me permita ver los números ceros, pares e impares digitados
  // por un usuario, los cuales deberán ser llenados antes en una matriz y al final debe recorrer
  // dicha matriz y mostrar primero los ceros, impares luego los pares en orden según el consecutivo
  // del número?
  // Ejemplo: el usuario digita 11,4,5,1,3,6,8,9,3,2
  // Deberá mostrar primero: 1,3,3,5,9,11.
  // Deberá mostrar segundo: 2,4,6,8.

  static HashMap<String, String> ejercicio7(int colum, int fila, int limite_relleno) {

    matriz =
        IntStream.range(0, fila)
            .mapToObj(
                x ->
                    IntStream.range(0, colum)
                        .mapToObj(y -> random.nextInt(0, limite_relleno))
                        .collect(Collectors.toCollection(ArrayList::new)))
            .collect(Collectors.toCollection(ArrayList::new));

    matriz.forEach(System.out::println);
    // System.out.println("\nMatriz Ordenada");
    // matriz =
    //     matriz.stream()
    //         .map(
    //             y -> {
    //               y.sort(null);
    //               return y;
    //             })
    //         .collect(Collectors.toCollection(ArrayList::new));
    // matriz.forEach(System.out::println);
    System.out.println("\nResultado");

    ArrayList<Integer> listaNum =
        matriz.stream().flatMap(ArrayList::stream).collect(Collectors.toCollection(ArrayList::new));
    listaNum.sort(null);

    HashMap<String, String> resultados = new LinkedHashMap<String, String>();
    resultados.put(
        "Numeros Ceros",
        listaNum.stream()
            .filter(n -> n == 0)
            .map(String::valueOf)
            .collect(Collectors.joining(", ")));

    resultados.put(
        "Numeros Pares",
        listaNum.stream()
            .filter(n -> n != 0 && n % 2 == 0)
            .map(String::valueOf)
            .collect(Collectors.joining(", ")));

    resultados.put(
        "Numeros Impares",
        listaNum.stream()
            .filter(n -> n % 2 != 0)
            .map(String::valueOf)
            .collect(Collectors.joining(", ")));

    System.out.println(listaNum);
    return resultados;
  }

  // 8. ¿Realiza un algoritmo el cual me permita ver los números impares digitados por un usuario,
  // los cuales deberán ser llenados antes en una matriz, el tamaño de la matriz lo coloca el
  // usuario?
  //

  static String ejercicio8(int colum, int fila, int limite_relleno) {

    matriz =
        IntStream.range(0, fila)
            .mapToObj(
                x ->
                    IntStream.range(0, colum)
                        .mapToObj(y -> random.nextInt(0, limite_relleno))
                        .collect(Collectors.toCollection(ArrayList::new)))
            .collect(Collectors.toCollection(ArrayList::new));

    // System.out.println("\nMatriz Ordenada");
    // matriz =
    //     matriz.stream()
    //         .map(
    //             y -> {
    //               y.sort(null);
    //               return y;
    //             })
    //         .collect(Collectors.toCollection(ArrayList::new));
    // matriz.forEach(System.out::println);

    ArrayList<Integer> listaNum =
        matriz.stream().flatMap(ArrayList::stream).collect(Collectors.toCollection(ArrayList::new));
    listaNum.sort(null);

    return String.format(
        "Numeros impares: %1$s",
        listaNum.stream()
            .filter(n -> n % 2 != 0)
            .map(String::valueOf)
            .collect(Collectors.joining(", ")));
  }
}
