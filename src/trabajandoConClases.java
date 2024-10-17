public class trabajandoConClases {
    public static void main(String[] args) {

//        Calculadora calculadora = new Calculadora();
//        try {
//            double resultadoDivision = calculadora.dividir(10, 2);
//            System.out.println("Resultado de la division: " + resultadoDivision);
//        }
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }

        Figura circulo = new Circulo(5);
        circulo.mostrarFigura();
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());
        System.out.println(circulo);
    }
}
