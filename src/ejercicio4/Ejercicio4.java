package ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1000, 5);
        CuentaAhorros cuentaAhorros = new CuentaAhorros(1000, 5);

        cuentaCorriente.Depositar();
        cuentaAhorros.Depositar();

        cuentaAhorros.mostrarInformacion();
        cuentaCorriente.mostrarInformacion();
    }
}
