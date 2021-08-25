public class CuentaBancaria {
    String titular;
    TipoDeCuenta tipoDeCuenta;
    double saldo;

    /*
    public static final String TIPO_AHORRO = "ahorro";
    public static final String TIPO_NOMINA = "nómina";
    */

    CuentaBancaria(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    void sacarDinero(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    double obtenerSaldo() {
        return saldo;
    }

}
