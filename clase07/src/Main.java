import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*

        Rectangulo primeraFigura = new Rectangulo("Rectángulo");
        primeraFigura.dibujar();
*/

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.println(numeros);
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);

        numeros.forEach(numero -> System.out.println(numero));
        numeros.forEach(numero -> System.out.println(numero*numero));
        System.out.println(numeros);
        numeros.removeIf(numero -> numero<=5);
        System.out.println(numeros);

        ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();

        

    }
}
