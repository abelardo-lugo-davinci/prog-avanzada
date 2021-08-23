public class CuentaBancaria {
    String titular;
    String tipoDeCuenta;
    double saldo;

    void sacarDinero(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta (String nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }

    double obtenerSaldo() {
        return saldo;
    }

}
