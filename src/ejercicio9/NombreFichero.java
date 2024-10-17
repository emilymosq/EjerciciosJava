package ejercicio9;

import java.util.ArrayList;
import java.io.*;

public class NombreFichero {
    public static void main(String[] args) {
        ArrayList<Character>vocales = new ArrayList<>();
        try {

            File file = new File("C:\\Users\\ALUMNO\\IdeaProjects\\Emily\\src\\ejercicio9\\archivo");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Archivo creado correctamente.");
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            if (linea!= null) {
                for (char v : linea.toLowerCase().toCharArray()) {
                    if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                        vocales.add(v);
                    }
                }
                System.out.println("Número de vocales en la primera línea: " + vocales.size());
            }

            br.close();
            fr.close();


        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (char vocal : vocales) {
            System.out.println(vocal);
        }
    }
}