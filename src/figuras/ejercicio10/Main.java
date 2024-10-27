package figuras.ejercicio10;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager("C:\\Users\\Emily Mosquera\\OneDrive\\Documents\\ejercicios-java\\ejercicio10\\figuras.txt");
        fileManager.importFromFile();
        fileManager.exportToFile();

    }
}
