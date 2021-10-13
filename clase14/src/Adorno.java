public class Adorno extends Producto {

    // Hereda de Productos todos los atributos

    // ATRUBUTOS

    // CONSTRUCTORES

    public Adorno(String nombre, double precio) {
        super(nombre, precio);
    }

    public Adorno(String nombre) {
        super(nombre, 0);
    }

    // METODOS

    @Override
    public void rebajarPrecio(double porcentaje) {}

}
