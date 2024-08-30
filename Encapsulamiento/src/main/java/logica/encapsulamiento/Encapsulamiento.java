

package logica.encapsulamiento;


public class Encapsulamiento {

    public static void main(String[] args) {
       
        
        Alumno alum = new Alumno();
        Alumno alum2 = new Alumno(12,  "hola" , "Que hace");
        
        System.out.println("id" + alum2.getId());
        System.out.println("nombre" + alum2.getNombre());
        System.out.println("apellido" + alum2.getApellido());
        
        
    }
}
