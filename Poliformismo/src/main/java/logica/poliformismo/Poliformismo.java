//El polimorfismo en Java es un concepto fundamental de la programación orientada 
//a objetos (OOP) que permite a las clases utilizar métodos de otras clases a través 
//de una interfaz común. Existen dos tipos principales de polimorfismo en Java:


package logica.poliformismo;

public class Poliformismo {

    public static void main(String[] args) {
        
        Persona vector [] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();
        
        Persona perso = new Persona();
        Consultor consul = new Consultor();
        
        
        
        perso = consul ;
        
        
        
    }
}
