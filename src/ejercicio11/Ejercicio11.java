package ejercicio11;

import java.io.*;

public class Ejercicio11 {

    public static void leerArchivo(){
        File file = new File("C:\\Users\\ALUMNO\\IdeaProjects\\Emily\\src\\ejercicio11\\entrada.txt");
        byte[] bytes = new byte[(int) file.length()];

        try(FileInputStream fileInputStream = new FileInputStream(file)){
            fileInputStream.read();
        } catch (IOException e) {
            System.out.println("error: " + e);
        }

    }

    public static void escribirArchivo(){
        String nuevoArchivo = "src/salida.bin";
        FileOutputStream fileOutputStream = null;

        try{
            File archivo= new File("C:\\Users\\ALUMNO\\IdeaProjects\\Emily\\src\\ejercicio11\\salida.bin");
            fileOutputStream = new FileOutputStream(archivo);
            ObjectOutputStream escribir = new ObjectOutputStream(fileOutputStream);

            escribir.writeObject(new File(nuevoArchivo));
            escribir.close();
            fileOutputStream.close();
        }
        catch (IOException e) {
            System.out.println("error: " + e);
        }
    }
    public static void main(String[] args) {
        File archivo= new File("C:\\Users\\ALUMNO\\IdeaProjects\\Emily\\src\\ejercicio11\\entrada.txt");
        File archivoNuevo= new File("C:\\Users\\ALUMNO\\IdeaProjects\\Emily\\src\\ejercicio11\\salida.bin");

        try{
            FileInputStream fileInputStream = new FileInputStream(archivo);
            byte[] bytes = new byte[(int) archivo.length()];
            fileInputStream.read();

           FileOutputStream fileOutputStream = new FileOutputStream(archivoNuevo);
           fileOutputStream.write(bytes);
           fileOutputStream.close();
           fileInputStream.close();





        }
        catch (IOException e) {
            System.out.println("error: " + e);
        }
    }
}
