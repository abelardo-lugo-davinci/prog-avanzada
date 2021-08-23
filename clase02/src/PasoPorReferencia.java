public class PasoPorReferencia {
    public static void main(String[] args) {
        int variable1 = 45;
        int variable2 = variable1;

        System.out.println(variable1);
        System.out.println(variable2);

        variable1 = 34;

        System.out.println(variable1);
        System.out.println(variable2);

        CuentaBancaria cuentaDeJuan = new CuentaBancaria();
        cuentaDeJuan.saldo = 35_000;

        CuentaBancaria cuentaDeAna = new CuentaBancaria();
        cuentaDeAna.saldo = cuentaDeJuan.saldo;

        System.out.println(cuentaDeJuan.saldo);
        System.out.println(cuentaDeAna.saldo);

        cuentaDeAna.saldo = 40_000;

        System.out.println(cuentaDeJuan.saldo);
        System.out.println(cuentaDeAna.saldo);


    }
}
