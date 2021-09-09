public abstract class FiguraPlana {

    protected String tipoFigura;

    public FiguraPlana(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraPlana{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}
