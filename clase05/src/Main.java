public class Main {

    public static void main(String[] args) {

        ObjetoGenerico<String> primerObjeto = new ObjetoGenerico<>("Hola mundo");

        int numero = 3;

        ObjetoGenerico<Integer> segundoObjeto = new ObjetoGenerico<>(numero);
        String cadena = "Saludo";

        System.out.println(primerObjeto.compararObjeto(segundoObjeto));
        System.out.println(primerObjeto.compararObjeto(cadena));
        System.out.println(segundoObjeto.compararObjeto(cadena));

    }
}
