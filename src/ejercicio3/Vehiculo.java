package ejercicio3;

public class Vehiculo {
    private double velocidadMaxima;
    private String marca;

    public Vehiculo (double velocidadMaxima, String marca){
        this.velocidadMaxima = velocidadMaxima;
        this.marca = marca;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
