public class Rectangulo extends FiguraPlana {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Este es un: " + this.getClass().getSimpleName());
    }
}
