

package logica.trycatch;


public class TryCatch {

    public static void main(String[] args) {
        
        
        int edad [] = {12, 32, 32};
        
        try {
          System.out.println("la edad de la pocicion 4 es " + edad[4]);
        } catch (Exception e) {
            System.out.println("La Pociciona la que quieres acceder no existe ");
        }
                
    }
}
