import java.util.Scanner;

public class taller2 {

    public static void main(String[] args) {
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

    public static void ejercicio2() {

    }
}
