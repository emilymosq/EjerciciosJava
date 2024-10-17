package ejercicio13;

import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private int Edad;
    private double Salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        Edad = edad;
        Salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", Edad=" + Edad +
                ", Salario=" + Salario +
                '}';
    }
}
