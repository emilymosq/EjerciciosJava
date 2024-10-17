package ejercicio5;

class Telefono implements Conectable, Recargable {
    @Override
    public void encender() {
        System.out.println("El telefono esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El telefono esta apagado");
    }

    @Override
    public void cargar() {
        System.out.println("El telefono se ha cargado");
    }

    @Override
    public void nivelDeBateria() {
        System.out.println("El telefono tiene un nivel de bateria alto");
    }
}
