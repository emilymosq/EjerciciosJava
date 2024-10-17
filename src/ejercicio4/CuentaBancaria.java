package ejercicio4;

abstract class CuentaBancaria {
    private double saldo;

    CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Depositar(){
       System.out.println("Deposito realizado con éxito");
   }

    public void Retirar(){
        System.out.println("Retiro realizado con éxito");
    }
}
