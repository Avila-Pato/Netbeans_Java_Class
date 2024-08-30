
package logica.poo;


public class POO {

    public static void main(String[] args) {
        
        Alumno alumo1 = new Alumno(1," Patricio", "Avila");
        System.out.println("la id del alumno es " + alumo1.getId());
        System.out.println("el Nombre es" + alumo1.getNombre());
        System.out.println("el apellido es" + alumo1.getApellido());
    }
}
