

//1 a 1 un objeto de una clase solo puede relacionarse con una de otra
//1 a n un objeto de una clase solo puede relacionarse con muchas de otra



//n a 1 la inversa de 1 a n [mismo tipo de relacion pero cambia el sentido]
//n a n Muchos de objetos de una clase pueden relacionarce con muchas de otras



package logica.relaciones_entre_clases_en_1_a_1_y_1_a_n;

import java.util.ArrayList;
import java.util.List;


public class Relaciones_entre_Clases_en_1_a_1_y_1_a_N {

    public static void main(String[] args) {
        
      Auto1_n auto1 = new Auto1_n();
      auto1.setId(1L);
      auto1.setMarca("Renault");
      auto1.setModelo("Dulter");
      
      // creando lista de propietarios
        List<Propietario_1_a_n> listaPropietarios = new ArrayList <>();
        
        Propietario_1_a_n prop1 = new Propietario_1_a_n();
        Propietario_1_a_n prop2 = new Propietario_1_a_n();
        
        // seteando valores
        
        prop1.setId(53L);
        prop1.setNombre("Patricio");
        prop1.setApellido("Avila");
        
        // seteando valores
        
        prop2.setId(11L);
        prop2.setNombre("Isais");
        prop2.setApellido("Avila");
        
        // guardando valores
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        // asignado valures
        auto1.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto " + auto1.getMarca()+ " " + auto1.getModelo()
        + "Tiene como propietario a " + auto1.getListaPropietarios().toString());
        
        
    }
}
