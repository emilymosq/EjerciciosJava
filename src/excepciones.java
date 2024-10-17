public class excepciones {

    public static void ArithmeticExceptionFunction () {
        try {
            int resultado = 10/0;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Error procede de: " + 0);
        }
    }

    public static void ArrayIndexExceptionFunction() {
        int [] numeros = {1, 2, 3, 4, 5};
        try {
            System.out.println(numeros[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
       // ArithmeticExceptionFunction();
        ArrayIndexExceptionFunction();
    }
}
