package ejercicio6;

public class Tablet extends Dispositivos implements Conectable {

    public Tablet(String estado, String marca) {
        super(estado,marca);
    }

    @Override
    public void encender() {
        //System.out.println("El telefono esta " + getEstado());
        if(estado.equals("apagado")) {
            estado = "encendido";
        }
        else {
            System.out.println("El telefono ya se encuentra encendido");
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Dispositivo: Tablet");
        System.out.println("Estado: " + getEstado());
        System.out.println("marca: " + getMarca());
    }

    @Override
    public void conectarWifi()  {
        System.out.println("La Tablet se ha conectado a la red Wifi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("La tablet se ha desconectado de la red Wifi");
    }
}