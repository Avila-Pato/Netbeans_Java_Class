//put(K key, V value): Asocia el valor especificado con la clave en el mapa, devolviendo el valor anterior asociado o null.
//get(Object key): Obtiene el valor asociado con la clave especificada, o null si la clave no está presente.
//containsKey(Object key): Verifica si el mapa contiene una entrada con la clave especificada.
//containsValue(Object value): Verifica si el mapa contiene una entrada con el valor especificado.
//remove(Object key): Elimina la entrada para la clave especificada y devuelve el valor asociado o null si la clave no estaba presente.
//Set<K> keySet(): Devuelve un conjunto de todas las claves en el mapa.

package logica.hashmap_paraambienteweb;

import java.util.HashMap;
import java.util.Map;

public class HashMap_paraAmbienteWeb {

    public static void main(String[] args) {
        // Crear un HashMap para almacenar empleados con sus códigos de identificación
        Map<Integer, String> MapaEmpleados = new HashMap<>();
        
        // Agregar entradas al mapa usando el método put
        MapaEmpleados.put(1523, "Hola MUNDO");
        MapaEmpleados.put(1524, "eL PRINCIPITO");
        MapaEmpleados.put(1525, "el caballero de la armadura");
        
        // Comprobar si un valor específico está presente en el mapa
        boolean estaono = MapaEmpleados.containsValue("el caballero de la armadura");
        
        // Comprobar si una clave específica está presente en el mapa
        boolean estaKey = MapaEmpleados.containsKey(1543);
        
        // Mostrar el resultado de la búsqueda usando operador ternario
        String resultado = estaono ? "El valor 'el caballero de la armadura' se encuentra en el mapa." 
                                   : "El valor 'el caballero de la armadura' no está en el mapa.";
                                   
        // Mostrar el resultado de la búsqueda de la clave usando operador ternario
        String resultadoKey = estaKey ? "La clave 1543 se encuentra en el mapa." 
                                      : "La clave 1543 no está en el mapa.";
        
        // Imprimir resultados
        System.out.println(resultado);
        System.out.println(resultadoKey);
    }
}

