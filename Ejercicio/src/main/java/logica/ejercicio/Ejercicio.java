
package logica.ejercicio;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio {

    public static void main(String[] args) {
       
        List<Videojuego> listaVideojuegos = new ArrayList<>();
        
        // crear nuevos videojuegos
        
        Videojuego juego1 = new Videojuego(123,"Gta", "Pc", 4, "bronce");
        Videojuego juego2 = new Videojuego(124,"Residen evil", "PlayStation", 2, "ORO");
        Videojuego juego3 = new Videojuego(125,"Lol", "Pc", 10, "Croaca");
        Videojuego juego4 = new Videojuego(126,"MarioBros ", "Xbox", 1, "plata");
        Videojuego juego5 = new Videojuego(127,"Minecraft", "Pc", 100, "Platino");
        
        // referencia a la lista
        listaVideojuegos.add(juego1);
        listaVideojuegos.add(juego2);
        listaVideojuegos.add(juego3);
        listaVideojuegos.add(juego4);
        listaVideojuegos.add(juego5);
        
        
        // recorrer la arraylist
        listaVideojuegos.forEach(juegos -> System.out.println("la cantidad de judarores son" + juegos.getCanJugdores()));
        listaVideojuegos.forEach(juegos -> System.out.println("la cantidad de titulos son" + juegos.getTitulo()));
        listaVideojuegos.forEach(juegos -> System.out.println("la cantidad de Consolas son" + juegos.getConsola()));
        
        
        // cambio de nombre y jugaadores metodo set
        juego1.setTitulo("Modificando titulo");
        juego1.setCanJugdores(2121212);
        
        // recorrer araylist Unicamente la que tenga la xbox
        for(Videojuego juego : listaVideojuegos) {
            if (juego.getConsola().equals("Xbox")){
                  System.out.println("la consola se encuntra "+ juego );
            }else{
                System.out.println("no esta");
            }
                
            }
        }
    }
