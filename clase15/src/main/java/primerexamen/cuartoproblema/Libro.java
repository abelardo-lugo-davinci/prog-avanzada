package primerexamen.cuartoproblema;

public class Libro extends Producto {

    // Hereda nombre y precio de producto

    // ATRIBUTOS
    String isbn;

    // CONSTRUCTORES

    public Libro(String nombre, double precio, String isbn) {
        super(nombre, precio);
        this.isbn = isbn;
    }

    // METODOS


    @Override
    public void rebajarPrecio(double porcentaje) {
        this.precio = this.precio*(100-porcentaje)/100;
    }

}
