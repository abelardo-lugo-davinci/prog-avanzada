package primerexamen.primerproblema;

public class TetraedroRegular extends FiguraTridimensional{

    // ATRIBUTOS
    double arista;

    // CONSTANTE
    static final int CARAS = 4;

    // CONSTRUCTORES

    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    public TetraedroRegular() {
        // this(1);
        this.arista = 1;
    }

    // Definición de los métodos abstractos heredados

    @Override
    public double calcularVolumen() {
        return Math.sqrt(2)*Math.pow(arista,3)/12;
    }

    @Override
    public double calcularArea() {
        return Math.sqrt(3)*Math.pow(arista,2);
    }

    // Método toString

    @Override
    public String toString() {
        return "La figura es un " + this.getClass().getSimpleName();
    }

}
