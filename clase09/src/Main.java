import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Declarar el ArrayList
        ArrayList<String> carros = new ArrayList<String>();

        System.out.println(carros);
        // Agregamos elementos al ArraysList mediante el método .add
        carros.add("Ford");
        carros.add("Toyota");
        carros.add("Chevrolet");
        carros.add("Toyota");
        carros.add("Fiat");
        System.out.println(carros);

        // Método sort de la clase Collections
        Collections.sort(carros);
        System.out.println(carros);

        // Uso del método get para obtener un elemento del ArrayList
        System.out.println(carros.get(1));

        // Uso del método set para modificar (o setear) un elemento del ArrayList
        carros.set(1, "Mercedes");
        System.out.println(carros);

        // Uso del método size para obtener el tamaño del ArrayList
        System.out.println(carros.size());

        // Uso del método clear para borrar todos los elementos del ArrayList
        // carros.clear();
        // System.out.println(carros);

        HashSet<String> equipos = new HashSet<String>();

        System.out.println(equipos);
        equipos.add("Independiente");
        equipos.add("Velez");
        equipos.add("River");
        equipos.add("Colón");

        System.out.println(equipos);

        equipos.add("River");
        System.out.println(equipos);

        System.out.println(equipos.size());
        System.out.println(equipos.remove("River"));
        System.out.println(equipos);
        System.out.println(equipos.contains("Velez"));
        System.out.println(equipos.contains("velez"));

        HashMap< String, String> capitales = new HashMap<String, String>();
        System.out.println(capitales);

        capitales.put("Argentina", "Buenos Aires");
        capitales.put("Chile", "Santiago");
        capitales.put("Uruguay", "Montevideo");
        capitales.put("Ecuador", "Quito");

        System.out.println(capitales);

        System.out.println(capitales.get("Argentina"));
        System.out.println(capitales.keySet());

        System.out.println(capitales.values());


        capitales.remove("Ecuador");
        System.out.println(capitales);
        System.out.println(capitales.size());
        capitales.put("Argentina", "La Plata");
        System.out.println(capitales);
        capitales.replace("Argentina", "CABA");
        System.out.println(capitales);

        for (String capital: capitales.values() ) {
            System.out.println(capital);
        }

        for (String pais: capitales.keySet()) {
            System.out.println(pais);
        }

        for (String pais: capitales.keySet()) {
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        }

        capitales.clear();
        System.out.println(capitales);
        System.out.println(capitales.size());
    }

}
