package ejercicio4;

class CuentaCorriente extends CuentaBancaria{
    private int envios;

    CuentaCorriente(double saldo, int envios) {
        super(saldo);
        this.envios = envios;
    }

    public void mostrarInformacion(){
        System.out.println("Cuenta corriente: ");
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Envios realizados: " + envios);
    }
}
