public class funciones {
    public static void HelloWorld() {
        System.out.println("Hola mundo");
    }

    public static boolean esVerdadera(String palabra) {
        if(palabra.equals("Lunes"))
            return true;
        else
            return false;
    }

     public static String diaDeLaSemana(int dia){
        switch(dia){
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            default:
                return "Dia no valido";
        }
     }

    public static void main(String[] args) {
        HelloWorld();
        boolean esLunes = esVerdadera("Lunes");  // Asignamos el resultado de la función a una variable booleana.
        System.out.println(esVerdadera("Lunes"));
        System.out.println("Es lunes" + esLunes);

        String dia = diaDeLaSemana(1);
        System.out.println("El dia es: " + dia);

    }
}