package logica.diferenciasarraylistlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Asegúrate de que la clase Persona está en el paquete correcto o importada si está en otro paquete

public class DiferenciasArrayListLinkedList {

    public static void main(String[] args) {
        
        // ArrayList
        List<Persona> listArray = new ArrayList<>();
        listArray.add(new Persona(1, "Lusito", 23));
        listArray.add(new Persona(2, "Gabriel", 23));
        listArray.add(new Persona(3, "Pancho", 23));
        listArray.add(new Persona(4, "Maria", 23));
        
        // LinkedList
        LinkedList<Persona> listaLinked = new LinkedList<>();
        listaLinked.add(new Persona(1, "Pepito", 32));
        listaLinked.add(new Persona(2, "Gabriel", 32));
        listaLinked.add(new Persona(3, "Pancho", 32));
        listaLinked.add(new Persona(4, "Maria", 32));
        
        // Remove in ArrayList
        listArray.remove(1); // Removes "Gabriel" (index starts at 0)
        
        // Remove in LinkedList
        String nombreBorrar = "Gabriel";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break; // stop searching after removing
            }
        }
        
        // Print results
        System.out.println("------LUEGO DE ELIMINAR----------");
        
        // ForEach ArrayList
        System.out.println("----------ARRAYLIST---------");
        listArray.forEach(persona -> System.out.println("Nombre: " + persona.getNombre()));
         
        // ForEach LinkedList
        System.out.println("----------LINKEDLIST---------");
        listaLinked.forEach(persona -> System.out.println("Nombre: " + persona.getNombre()));
        
        // Size of the lists
        System.out.println("---------TAMAÑO DE LAS LISTAS---------");
        System.out.println("ArrayList size: " + listArray.size());
        System.out.println("LinkedList size: " + listaLinked.size());
        
        // First and last element in LinkedList
        System.out.println("------------PRIMER Y ÚLTIMO OBJETO SOLO PARA LINKED LIST---------");
        if (!listaLinked.isEmpty()) {
            System.out.println("Primero en LinkedList: " + listaLinked.getFirst().toString());
            System.out.println("Último en LinkedList: " + listaLinked.getLast().toString());
        } else {
            System.out.println("La LinkedList está vacía.");
        }
        
        // Clear all lists
        System.out.println("----------------------BORRANDO TODAS LAS LISTAS------------");        
        listArray.clear();
        listaLinked.clear();
        
        // Check if lists are empty
        System.out.println("-------------¿ESTÁ VACÍA ALGUNA LISTA?-------");
        System.out.println("ArrayList está vacía: " + listArray.isEmpty());
        System.out.println("LinkedList está vacía: " + listaLinked.isEmpty());
    }
}
