/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ejerciciointegrador;

/**
 *
 * @author Pato
 */
public class EjercicioIntegrador {

    public static void main(String[] args) {
       
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        
        // Llamando a los atacantes

         squirtle.atacarBurbubja();
         charmander.atacatLanzaLllamas();
         bulbasaur.atacarParalizar();
         pikachu.atacatPuñoTrueno();
        
    }
}
