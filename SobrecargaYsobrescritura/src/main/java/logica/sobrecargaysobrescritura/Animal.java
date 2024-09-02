
package logica.sobrecargaysobrescritura;


public class Animal {
    
    private int id_animal;
    private String descripcionString;
    
    //Otro metodos SOBRECARGA!!!
    
    public void HacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void HacerSonido(String nombreAnimal) {
        System.out.println("El animal" + nombreAnimal + "hace un sonido" );
    };
    public void HacerSonido(String nombreAnimal, String  tipoSonido){
            System.out.println("El animal" + nombreAnimal + "hace un sonido de tipo " + tipoSonido);
    };
    
    
    
 
    
    
}
