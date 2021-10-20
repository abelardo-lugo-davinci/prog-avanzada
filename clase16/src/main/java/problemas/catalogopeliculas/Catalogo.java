package problemas.catalogopeliculas;

/*
Y una clase llamada catálogo con los atributos nombre (String), peliculas (ArrayList).
Y los métodos agregar y borrar películas.
*/

import java.util.ArrayList;

public class Catalogo {

    // ATRIBUTOS
    String nombre;
    Categoria categoria;
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    // CONSTRUCTORES

    public Catalogo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // METODOS

    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public void agregarPelicula(String titulo, int anio, int duracion){
        Pelicula pelicula = new Pelicula(titulo, anio, duracion);
        this.peliculas.add(pelicula);
        // this.peliculas.add(new Pelicula(titulo, anio, duracion));
    }

    public void borrarPelicula(Pelicula pelicula) {
        this.peliculas.remove(pelicula);
    }

    public void borrarPelicula(String titulo) {
        this.peliculas.removeIf(pelicula -> (pelicula.titulo == titulo) );
    }

    public void borrarPelicula(int anio) {
        this.peliculas.removeIf(pelicula -> (pelicula.anio == anio) );
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}
