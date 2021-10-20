package problemas.figuras;

public class Triangulo extends FiguraPlana {

    // ATRIBUTOS
    double a;
    double b;
    double c;

    // CONSTRUCTORES

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // SOBRE ESCRITURA DE LOS METODOS HEREDADOS

    @Override
    public double calcularArea() {
        double sP = (a + b + c)/2;
        return Math.sqrt(sP*(sP-a)*(sP-b)*(sP-c));
    }

    @Override
    public double calcularPerimetro() {
        return (this.a + this.b + this.c);
    }
}
