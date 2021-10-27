package primerexamen.primerproblema;

public class Cubo extends FiguraTridimensional{

    // ATRIBUTOS
    double arista;

    // CONSTANTE
    static final int CARAS = 6;

    // CONSTRUCTORES

    public Cubo(double arista) {
        this.arista = arista;
    }

    public Cubo() {
        // this(1);
        this.arista = 1;
    }

    // Definición de los métodos abstractos heredados

    @Override
    public double calcularVolumen() {
        return Math.pow(arista,3);
    }

    @Override
    public double calcularArea() {
        return 6*Math.pow(arista,2);
    }

    // Método toString

    @Override
    public String toString() {
        return "La figura es un " + this.getClass().getSimpleName();
    }

}
