package ejercicio6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TelefonoInteligente telefonoInteligente = new TelefonoInteligente("apagado", "");
        System.out.println("Introduce la marca del telefono: ");
        String marcaDispositivo = scanner.nextLine();

        telefonoInteligente.setMarca(marcaDispositivo);
        telefonoInteligente.encender();
        telefonoInteligente.mostrarInformacion();
        telefonoInteligente.conectarWifi();
        telefonoInteligente.desconectarWifi();

        Tablet tablet = new Tablet("apagado", "");

        System.out.println("Introduce la marca del dispositivo: ");
        String marcaTablet = scanner.nextLine();

        tablet.setMarca(marcaTablet);
        tablet.encender();
        tablet.mostrarInformacion();
        tablet.conectarWifi();
        tablet.desconectarWifi();

        try (FileReader fr = new FileReader("C:\\Users\\ALUMNO\\IdeaProjects\\Emily\\src\\ejercicio6\\mis-dispositivos")) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        scanner.close();
    }
}
