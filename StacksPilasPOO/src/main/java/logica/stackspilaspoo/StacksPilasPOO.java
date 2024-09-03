
package logica.stackspilaspoo;

import java.util.Stack;

public class StacksPilasPOO {

    public static void main(String[] args) {
       Stack<Integer> pila = new Stack<Integer>();
       
        System.out.println("Pila vacia ? " + pila);
        System.out.println("Esta vacia ? " + pila.isEmpty());
       
       
       //Agregar
       pila.push(1);
       pila.push(2);
       pila.push(3);
       pila.push(4);
       pila.push(5);
       
       //Recoriido
       pila.forEach(pilita -> System.out.println(pilita));
       
       //Mostrar
        System.out.println("Pila" + pila);
        System.out.println("Pila esta vacia ? " + pila.isEmpty());
        
        pila.pop(); // ELIMINAR EL ULTIMO REGISTRO QUE ENTRO
        System.out.println("rsta el 3? " + pila.search(3)); //Elemento para buscar por numero lo muestra
        System.out.println("ultimo agregado: " + pila.peek()); // cual fue el ultimo elemento que se agrego
    }
}
