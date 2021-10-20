package problemas.catalogopeliculas;

/*
Cree una clase llamada películas con los atributos titulo (String), año (int) y duracion en minutos (int).
*/

public class Pelicula {

    // ATRIBUTOS
    String titulo;
    int anio;
    int duracion;

    // CONSTRUCTORES

    public Pelicula(String titulo, int anio, int minutos){
        this.titulo = titulo;
        this.anio = anio;
        this.duracion = minutos;
    }

    public Pelicula(String titulo){
        this.titulo = titulo;
        // this.anio = 0;
        // this.minutos = 0;
    }

    // METODOS

    // Getters y Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
