package ejercicio3;

public class Coche extends Vehiculo{
    private double capacidadCombustible;

    public Coche(double capacidadCombustible, int velocidadMaxima, String marca) {
        super(velocidadMaxima, marca);
        this.capacidadCombustible = capacidadCombustible;
    }

    public void mostrarInfo() {
        System.out.println("Coche: ");
        System.out.println("marca: " + getMarca());
        System.out.println("Velocidad maxima: " + getVelocidadMaxima());
        System.out.println("Capacidad de combustible: " + capacidadCombustible);
    }

    public void acelerar(){
        System.out.println("El coche esta acelerando");
    }
}
