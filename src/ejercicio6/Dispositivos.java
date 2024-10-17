package ejercicio6;

abstract class Dispositivos {
    public String estado;
    public String marca;

    public Dispositivos(String marca, String estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract void encender();
    public abstract void mostrarInformacion();
}
