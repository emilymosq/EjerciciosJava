package ejercicio13;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        boolean seguir = true;
        while(seguir){
            System.out.println("Para agregar empleados pon el numero 1, para salir del bucle pon el numero 2.");
            int numero = scanner.nextInt();

            if(numero == 1){
                System.out.println("Agrega un nombre");
                String nombre = scanner.next();
                System.out.println("Agrega una edad");
                int edad = scanner.nextInt();
                System.out.println("Agrega un salario");
                double salario = scanner.nextDouble();
                empleados.add(new Empleado(nombre, edad, salario));
            }
            if(numero == 2){
                seguir = false;
            }
            else{
                System.out.println("Ingresa los numeros correctos");
            }
        }
        ingresarEnArchivo(empleados);
        mostrarInfoArchivo();
    }
    public static void ingresarEnArchivo(ArrayList<Empleado> empleados){
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/ejercicio13/empleados.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(empleados);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void mostrarInfoArchivo(){
        ArrayList<Empleado> empleado2 = null;
        try(FileInputStream fileInputStream = new FileInputStream("src/ejercicio13/empleados.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            empleado2 = (ArrayList<Empleado>) objectInputStream.readObject();
            System.out.println(empleado2.toString());
        }catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
