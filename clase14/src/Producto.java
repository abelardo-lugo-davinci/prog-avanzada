public abstract class Producto {

    // Clase Superior

    // ATRIBUTOS
    String nombre;
    double precio;
    static final double iva = 0.21;

    // CONSTRUCTORES

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // METODOS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void consultarIva() {
        System.out.println("El iva de los productos es " + iva);
    }

    public abstract void rebajarPrecio(double porcentaje);

    @Override
    public String toString() {
        return "Este producto se llama " + this.nombre + " y su precio " + this.precio;
    }

}
