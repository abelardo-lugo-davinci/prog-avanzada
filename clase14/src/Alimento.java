public class Alimento extends Producto {

    // ATRIBUTOS
    String productor;
    String distribuidor;

    // CONSTRUCTORES

    public Alimento(String nombre, double precio, String productor, String distribuidor) {
        super(nombre, precio);
        this.productor = productor;
        this.distribuidor = distribuidor;
    }

    public Alimento(String nombre, double precio, String distribuidor) {
        super(nombre, precio);
        this.distribuidor = distribuidor;
    }

    // METODOS


    @Override
    public void rebajarPrecio(double porcentaje) {
        this.precio = this.precio*(100-porcentaje)/100;
    }

    @Override
    public String toString() {
        return "Este producto se llama " + this.nombre + " y su precio " + this.precio + " y es dstribuido por " + this.distribuidor;
    }

}
