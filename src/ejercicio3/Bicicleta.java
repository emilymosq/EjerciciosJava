package ejercicio3;

public class Bicicleta extends Vehiculo {
    private String tipoBicicleta;

    public Bicicleta(double velocidadMaxima, String marca, String tipoBicicleta) {
        super(velocidadMaxima, marca);
        this.tipoBicicleta = tipoBicicleta;
    }


    public void acelerar(){
        System.out.println("La bicicleta esta acelerando");
    }

    public void mostrarInfo() {
        System.out.println("Bicicleta: ");
        System.out.println("marca: " + getMarca());
        System.out.println("Velocidad maxima: " + getVelocidadMaxima());
        System.out.println("Tipo de Bicicleta: " + tipoBicicleta);
    }
}
