package ejercicio7;

public class Programador extends Empleado implements Autenticable, Bonificable{
    public Programador(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase, bono);
    }

    @Override
    public void iniciarSesion(String usuario, String contraseña) {
        System.out.println("Ha iniciado sesión como programador");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Ha cerrado sesión como programador");
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()+getBono();
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Bono: " + getBono());
        System.out.println("Salario: " + getSalarioBase());
        System.out.println("Salario + bono: " + calcularSalario());
    }
}