package ejercicio12;

import java.io.*;

public class ObjetoMain {
    public static void main(String[] args) {
        Persona persona = new Persona("Antonio", 23);

        try(FileOutputStream fileOutputStream = new FileOutputStream("src/ejercicio12/persona.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
                objectOutputStream.writeObject(persona);
            }
        catch (IOException e){
            System.out.println(e);
        }
        leerArchivo();
    }

    public static void leerArchivo(){
        Persona persona2 = null;
        try(FileInputStream fileInputStream = new FileInputStream("src/ejercicio12/persona.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            persona2 = (Persona) objectInputStream.readObject();
            System.out.println(persona2.toString());
        }catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
