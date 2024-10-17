package ejercicio7;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", 5000, 1000);
        Programador programador = new Programador("Carlos", 3000, 500);

        gerente.iniciarSesion("JuanG", "password123");
        programador.iniciarSesion("CarlosP", "password456");

        System.out.println("\nInformacion del gerente");
        gerente.mostrarInfo();
        System.out.println("\nInformacion del programador");
        programador.mostrarInfo();

        gerente.cerrarSesion();
        programador.cerrarSesion();
    }
}
