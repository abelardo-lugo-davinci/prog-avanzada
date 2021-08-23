public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuentaDeArsen = new CuentaBancaria();

        cuentaDeArsen.tipoDeCuenta = "Cuenta de corriente";
        cuentaDeArsen.titular = "Arsen";
        cuentaDeArsen.saldo = 50_000;

        System.out.println("El titular de la cuenta es: " + cuentaDeArsen.titular);
        System.out.println("El saldo de la cuenta es: " + cuentaDeArsen.saldo);
        System.out.println("El tipo de cuenta es " + cuentaDeArsen.tipoDeCuenta);

        cuentaDeArsen.ingresarDinero(1000);

        System.out.println("El titular de la cuenta es: " + cuentaDeArsen.titular);
        System.out.println("El saldo de la cuenta es: " + cuentaDeArsen.saldo);
        System.out.println("El tipo de cuenta es " + cuentaDeArsen.tipoDeCuenta);

        cuentaDeArsen.sacarDinero(30000);

        System.out.println("El titular de la cuenta es: " + cuentaDeArsen.titular);
        System.out.println("El saldo de la cuenta es: " + cuentaDeArsen.saldo);
        System.out.println("El tipo de cuenta es " + cuentaDeArsen.tipoDeCuenta);

        double saldo = cuentaDeArsen.obtenerSaldo();

        System.out.println(saldo);

    }
}
