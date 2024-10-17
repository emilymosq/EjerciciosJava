package ejercicio6;

public class TelefonoInteligente extends Dispositivos implements Conectable {
    public TelefonoInteligente(String estado, String marca) {
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
        System.out.println("Dispositivo: Telefono Inteligente");
        System.out.println("Estado: " + estado);
        System.out.println("marca: " + getMarca());
    }

    @Override
    public void conectarWifi() {
        System.out.println("El telefono se ha conectado a la red Wifi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("El telefono se ha desconectado de la red Wifi");
    }

}
