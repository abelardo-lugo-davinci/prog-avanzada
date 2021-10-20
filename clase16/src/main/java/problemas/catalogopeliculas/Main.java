package problemas.catalogopeliculas;

/*
Cree una clase llamada películas con los atributos titulo (String), año (int) y duracion en minutos (int).
Y una clase llamada catálogo con los atributos nombre (String), peliculas (ArrayList). Y los métodos borrar y agregar películas.
 */

public class Main {
    public static void main(String[] args) {

        Pelicula primeraPelicula = new Pelicula("Matrix", 2000, 150);
        Pelicula segundaPelicula = new Pelicula("Matrix", 2000, 150);

        System.out.println(primeraPelicula.equals(segundaPelicula));
        System.out.println(primeraPelicula.hashCode());
        System.out.println(segundaPelicula.hashCode());

        System.out.println(primeraPelicula.anio);

        Catalogo primerCatalogo = new Catalogo("Peliculas de Accion",Categoria.ACCION);

        System.out.println(primerCatalogo.peliculas);



    }
}
