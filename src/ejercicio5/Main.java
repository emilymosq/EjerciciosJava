package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Conectable telefono = new Telefono();
        Conectable ordenador = new Ordenador();
        Recargable telefonoR = new Telefono();
        Recargable ordenadorR = new Ordenador();

        telefono.encender();
        ordenador.encender();

        telefono.apagar();
        ordenador.apagar();

        telefonoR.cargar();
        telefonoR.nivelDeBateria();

        ordenadorR.cargar();
        ordenadorR.nivelDeBateria();

    }
}
