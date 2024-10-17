package ejercicio4;

class CuentaAhorros extends CuentaBancaria {
    private int interesAnual;

    CuentaAhorros(double saldo, int interesAnual) {
        super(saldo);
        this.interesAnual = interesAnual;
    }

    public void mostrarInformacion(){
        System.out.println("Cuenta ahorro: ");
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Interes anual: " + interesAnual);
    }
}
