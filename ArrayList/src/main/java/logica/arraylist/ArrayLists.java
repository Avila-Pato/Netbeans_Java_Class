package logica.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists  {

    public static void main(String[] args) {
        // ArrayList para guardar personas dentro
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(0, "Patricio", 25));

        // Recorrer la lista con un índice
        for (int i = 0; i < lista.size(); i++) {
            String nombre = lista.get(i).getNombre(); // Obtener el nombre de la persona
            System.out.println("Prueba forINT " + nombre);
        }

        // Usar un bucle for-each
        for (Persona person : lista) {
            System.out.println(person.getNombre()); // Imprimir el nombre de cada persona
        }
    }
}