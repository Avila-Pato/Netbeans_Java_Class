
package logica.poliformismo;


public class Jefe  extends Persona{
    
    String supervisorString;
    
    public Jefe(){
        
    }

    public Jefe(String supervisorString, int id, String dni, String nombre, String dnapellido, String domicilio, String telefono) {
        super(id, dni, nombre, dnapellido, domicilio, telefono);
        this.supervisorString = supervisorString;
    }

    public String getSupervisorString() {
        return supervisorString;
    }

    public void setSupervisorString(String supervisorString) {
        this.supervisorString = supervisorString;
    }
    
    
}
