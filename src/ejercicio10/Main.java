package ejercicio10;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager("C:\\Users\\ALUMNO\\IdeaProjects\\Emily\\src\\ejercicio10\\figuras.txt");
        fileManager.importFromFile();
        fileManager.exportToFile();

    }
}
