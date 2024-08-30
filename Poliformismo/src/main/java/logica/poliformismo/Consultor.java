
package logica.poliformismo;


public class Consultor extends Persona{

  
    String nombre_consulttor;
    int num_consultor;
    
    public Consultor() {
        
    }

    public Consultor(String nombre_consulttor, int num_consultor, int id, String dni, String nombre, String dnapellido, String domicilio, String telefono) {
        super(id, dni, nombre, dnapellido, domicilio, telefono);
        this.nombre_consulttor = nombre_consulttor;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consulttor() {
        return nombre_consulttor;
    }

    public void setNombre_consulttor(String nombre_consulttor) {
        this.nombre_consulttor = nombre_consulttor;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }

    
}
