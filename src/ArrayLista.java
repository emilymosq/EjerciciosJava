import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (int numero: numeros) {
            System.out.println(numero);
        }

        ArrayList<Character> letras = new ArrayList<>();

        letras.add('a');
        letras.add('b');
        letras.add('c');
        letras.add('d');
        letras.add('e');

        for (char letra: letras) {
            System.out.println(letra);
        }

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 25, 25));
        personas.add(new Persona("Maria", 30, 30));
        personas.add(new Persona("Pedro", 28, 28));
        personas.add(new Persona("Ana", 27, 27));

        for (Persona persona: personas) {
            System.out.println(persona.toString());
        }
        int i = 0;
        while(i < personas.toArray().length) {

        }
    }
}