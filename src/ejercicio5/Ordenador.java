package ejercicio5;

class Ordenador implements Conectable, Recargable {
    @Override
    public void encender() {
        System.out.println("El ordenador esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El ordenador esta apagado");
    }

    @Override
    public void cargar() {
        System.out.println("El ordenador esta cargando");
    }

    @Override
    public void nivelDeBateria() {
        System.out.println("El ordenador tiene un nivel de bateria alto");
    }
}
