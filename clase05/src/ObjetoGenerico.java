public class ObjetoGenerico<T> {

    T objeto;

    ObjetoGenerico(T objeto) {
        this.objeto = objeto;
    }

    T obtenerObjeto() {
        return this.objeto;
    }

    <V> boolean compararObjeto(V otroObjeto) {
        return objeto.getClass() == otroObjeto.getClass();
    }

}
