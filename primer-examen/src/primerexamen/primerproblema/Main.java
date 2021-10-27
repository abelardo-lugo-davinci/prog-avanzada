package primerexamen.primerproblema;

public class Main {

    public static void main(String[] args) {

        System.out.println(FiguraTridimensional.DIMENSIONES);
        System.out.println(Ortoedro.DIMENSIONES);
        System.out.println(Ortoedro.CARAS);

        Ortoedro ortoedro = new Ortoedro(1, 2, 3);
        System.out.println(ortoedro);
        System.out.println(ortoedro.calcularVolumen());
        System.out.println(ortoedro.calcularArea());

        Cubo cubo = new Cubo(2);
        System.out.println(cubo);
        System.out.println(cubo.calcularVolumen());
        System.out.println(cubo.calcularArea());

        TetraedroRegular tetraedroRegular = new TetraedroRegular(3);
        System.out.println(tetraedroRegular);
        System.out.println(tetraedroRegular.calcularVolumen());
        System.out.println(tetraedroRegular.calcularArea());

    }

}
