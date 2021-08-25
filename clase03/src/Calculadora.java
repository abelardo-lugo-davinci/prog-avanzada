public class Calculadora {

    double calcularAreaCirculo (double radio) {
        return Math.PI * radio * radio;
    }

    double calcularAreaRectangulo(double altura, double base) {
        return base * altura;
    }

    double calcularPromedio(double ... numeros) {
        double sumatoria = 0;
        for(int i = 0; i < numeros.length; i++) {
            sumatoria += numeros[i];
        }
        return sumatoria / numeros.length;
    }

}
