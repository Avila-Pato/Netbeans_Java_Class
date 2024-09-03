
package logica.relaciones_entre_clases_en_1_a_1_y_1_a_n;


public class Propietario_1_a_1 {
    
    private long id;
    private String nombre;
    private String apellido;
    // Relacion 1 a 1
    private Propietario_1_a_1 prop;

    public Propietario_1_a_1() {
    }

    public Propietario_1_a_1(long id, String nombre, String apellido, Propietario_1_a_1 prop) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.prop = prop;
    }

    public Propietario_1_a_1 getProp() {
        return prop;
    }

    public void setProp(Propietario_1_a_1 prop) {
        this.prop = prop;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
