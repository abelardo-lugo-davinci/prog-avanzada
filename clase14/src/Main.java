public class Main {
    public static void main(String[] args) {

        Adorno primerAdorno = new Adorno("Muñeco de porcelana");

        System.out.println(primerAdorno.getPrecio());

        System.out.println(Producto.iva);
        Producto.consultarIva();

    }
}
