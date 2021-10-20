package problemas.figuras;

public class Rectangulo extends FiguraPlana {

    // ATRIBUTOS

    int base;
    int altura;

    // CONSTRUCTORES

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // SOBRE ESCRITURA DE LOS METODOS HEREDADOS
    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*base+2*altura;
    }
}
