public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double areaCirculo = calculadora.calcularAreaCirculo(5);
        double areaRectangulo = calculadora.calcularAreaRectangulo(6, 7);
        double promedio = calculadora.calcularPromedio(9, 10, 11);

        System.out.println("El area del circulo de radio 5 es igual a: " + areaCirculo);
        System.out.println("El area del rectangulo de base 6 y altura 7 es igual a: " + areaRectangulo);
        System.out.println("El promedio de 9, 10 y 11: " + promedio);

        CuentaBancaria cuentaDePedro = new CuentaBancaria("Pedro", TipoDeCuenta.CORRIENTE, 35_000);
        System.out.println(cuentaDePedro.titular);
        System.out.println(cuentaDePedro.tipoDeCuenta);
        System.out.println(cuentaDePedro.saldo);

        var palabra = "12";

        System.out.println(palabra.getClass().getSimpleName());

        palabra = "Hola";

    }
}
