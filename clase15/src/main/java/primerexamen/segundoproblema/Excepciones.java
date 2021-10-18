package primerexamen.segundoproblema;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Excepciones {

    public static int cociente(int numerador, int denominador)
            throws ArithmeticException {
        return numerador / denominador;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/*
        try{
            // Instrucciones a ejecutar en caso que el código funcione de manera correcta
        }catch(){
            // Instrucciones a ejecutar en la primera excepción
        }catch(){
            //  Instrucciones a ejecutar en la segunda excepción
        }finally{
            // Instrucciones con o sin excepción, finaliza el cuerpo de la excepción
        }
*/

        try {
            System.out.println("Ingrese un número entero:");
            int numerador = scanner.nextInt();
            System.out.println("Ingrese un número entero:");
            int denominador = scanner.nextInt();

            int resultado = cociente(numerador, denominador);

            System.out.println("El cociente es: " + resultado);

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Por favor, Ingrese solo números enteros");
        } catch ( ArithmeticException arithmeticException) {
            System.out.println("No se puede dividir entre cero");
        } finally {
            System.out.println("El Scanner tiene una excepción, en caso de ingresar un tipo de dato distinto");
            System.out.println("La división que se acabo de realizar está protegida de excepciones aritméticas");
        }

    }
}
