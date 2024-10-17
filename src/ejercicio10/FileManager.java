package ejercicio10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private String path;
    private String figuraNoValida = "Figura no valida";

    ArrayList<Figura> figuras = new ArrayList<>();
    ArrayList<String> figurasToPrint = new ArrayList<>();

    public FileManager(String path) {
        this.path = path;
    }


    public boolean Exists(){
        File file = new File(path);
        return file.exists() && !file.isDirectory();
    }


    public boolean colorEsValido(String color){
        String[] estructuraColor = color.split("#");
        return estructuraColor.length > 1;
    }

    public void importFromFile(){
        try{
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            while((linea = bufferedReader.readLine()) != null){
                String[] contenido = linea.split(" ");

                switch (contenido[0]) {
                    case "rectangulo":
                    colorEsValido(contenido[5]);
                    if(colorEsValido(contenido[5]) ){
                        Rectangulo rectangulo = new Rectangulo(contenido[0], contenido[1], contenido[2], contenido[3], contenido[4], contenido[5]);
                        figuras.add(rectangulo);    
                        figurasToPrint.add(rectangulo.toString());
                    } else{
                        figurasToPrint.add(figuraNoValida);
                        System.out.println(figuraNoValida);
                    }
                        break;
                    
                    case "circulo":
                    colorEsValido(contenido[4]);
                    if(colorEsValido(contenido[4])){
                        Circulo circulo = new Circulo(contenido[0], contenido[1], contenido[2], contenido[3], contenido[4]);
                        figuras.add(circulo);    
                        figurasToPrint.add(circulo.toString());

                    } else{
                        figurasToPrint.add(figuraNoValida);
                        System.out.println(figuraNoValida);
                    }
                        break;

                    case "cuadrado":
                    colorEsValido(contenido[3]);
                    if(colorEsValido(contenido[3])){
                        Cuadrado cuadrado = new Cuadrado(contenido[0], contenido[1], contenido[2], contenido[3]);
                        figuras.add(cuadrado);    
                        figurasToPrint.add(cuadrado.toString());

                    }else{
                        figurasToPrint.add(figuraNoValida);
                        System.out.println(figuraNoValida);
                    }
                        break;

                    default:
                        break;
                }
            }
            fileReader.close();
            bufferedReader.close();
        }
        catch(IOException e){
            System.out.println("Error" + e);
        }
    }

    public ArrayList<Figura> getDataFromFile(){
        return figuras;
    }

    public void exportToFile(){
        String nuevoArchivo = "C:\\Users\\ALUMNO\\IdeaProjects\\Emily\\src\\ejercicio10\\resultados.txt";
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(nuevoArchivo));
            for (String figura: figurasToPrint ) {
                bufferedWriter.write(figura);
                bufferedWriter.newLine();
            }

            System.out.println("Archivo creado correctamente.");
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e);
        }
        
    }
}
