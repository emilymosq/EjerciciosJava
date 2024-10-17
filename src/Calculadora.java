public class Calculadora {
    public double dividir(double numerador, double denominador) throws ArithmeticException  {
        if (denominador == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre 0");
        }
        return numerador / denominador;
    }

    public int factorial (int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Error: El número debe ser positivo");
        }
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }


}
