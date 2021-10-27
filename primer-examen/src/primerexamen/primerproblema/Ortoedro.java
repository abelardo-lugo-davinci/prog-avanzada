package primerexamen.primerproblema;

public class Ortoedro extends FiguraTridimensional{

    // ATRIBUTOS
    double ancho;
    double base;
    double altura;

    // CONSTANTE
    static final int CARAS = 6;

    // CONSTRUCTORES

    public Ortoedro(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    public Ortoedro() {
        // this(1, 1, 1);
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }

    // Definición de los métodos abstractos heredados

    @Override
    public double calcularVolumen() {
        return ancho*base*altura;
    }

    @Override
    public double calcularArea() {
        return 2*(ancho*base)+2*(ancho*altura)+2*(base*altura);
    }

    // Método toString

    @Override
    public String toString() {
        return "La figura es un " + this.getClass().getSimpleName();
    }

}
