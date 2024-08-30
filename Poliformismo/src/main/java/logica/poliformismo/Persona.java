
package logica.poliformismo;


public class Persona {
    int id;
    String dni;
    String nombre;
    String dnapellido;
    String domicilio;
    String telefono;
    
    
    
public Persona( ) {
    
 }

    public Persona(int id, String dni, String nombre, String dnapellido, String domicilio, String telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.dnapellido = dnapellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDnapellido() {
        return dnapellido;
    }

    public void setDnapellido(String dnapellido) {
        this.dnapellido = dnapellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

};

    
