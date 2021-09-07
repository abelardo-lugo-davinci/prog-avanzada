import java.util.ArrayList;

public class ArreglosDeLista {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.println(numeros);

        for (int i = 1; i <= 50 ; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);

        numeros.removeIf(numero -> (numero%2 != 0));

        System.out.println(numeros);

        ArrayList<Integer> segundaLista = new ArrayList<Integer>();

        numeros.forEach(numero -> segundaLista.add(2*numero));
        numeros.forEach(numero -> System.out.println(numero));

        System.out.println(segundaLista);

        ArrayList<String> equipos = new ArrayList<String>();

        equipos.add("Real Madrid");
        equipos.add("Barcelona");
        System.out.println(equipos);
        equipos.add("Atlético de Madrid");
        equipos.add("Valencia");
        equipos.add("Villareal");
        equipos.add("Real Betis");
        System.out.println(equipos);
        equipos.add(4, "Celta de Vigo");
        System.out.println(equipos);
        equipos.set(4,"Deportivo La Coruña");
        System.out.println(equipos);
        System.out.println(equipos.indexOf("Real Madrid"));
        System.out.println(equipos.indexOf("Celta de Vigo"));
        System.out.println(equipos.indexOf("Deportivo La Coruña"));

        equipos.forEach(equipo -> System.out.println("El equipo " + equipo + " está en la posición " + (equipos.indexOf(equipo) + 1)));



    }

}
