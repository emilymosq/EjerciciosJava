package ejercicio7;

abstract class Empleado {
    private String nombre;
    private double salarioBase;
    private double bono;

    public Empleado(String nombre, double salarioBase, double bono) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public abstract double calcularSalario();
}
