import java.util.Scanner;

public class DivisionEntreCeroSinManejoDeExcepciones {

    public static int cociente (int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.println("Ingrese un número entero");
        int numerador = scanner.nextInt();
        System.out.println("Ingrese un número entero");
        int denominador = scanner.nextInt();

        int resultado = cociente(numerador, denominador);

        System.out.println("El cociente es: " + resultado);

    }



}
