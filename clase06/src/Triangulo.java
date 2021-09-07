public class Triangulo extends FiguraPlana {

    int a;
    int b;
    int c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcularPerimetro() {
        return a + b + c;
    }

    @Override
    public double calcularArea() {
        int sP = (a + b + c) / 2;
        return Math.sqrt(sP*(sP-a)*(sP-b)*(sP-c));
    }
}
