package ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        Coche coche1 = new Coche(100, 200, "Ford");
        Bicicleta bicicleta1 = new Bicicleta(15, "Trek", "Mountain Bike");

        coche1.acelerar();
        bicicleta1.acelerar();

        coche1.mostrarInfo();
        bicicleta1.mostrarInfo();
    }
}
