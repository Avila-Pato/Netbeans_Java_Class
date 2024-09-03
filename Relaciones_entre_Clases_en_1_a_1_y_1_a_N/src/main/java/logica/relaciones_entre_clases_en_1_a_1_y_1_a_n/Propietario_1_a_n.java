
package logica.relaciones_entre_clases_en_1_a_1_y_1_a_n;


public class Propietario_1_a_n {
    
    private long id;
    private String nombre;
    private String apellido;
   

    public Propietario_1_a_n() {
    }

    @Override
    public String toString() {
        return "Propietario_1_a_n{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public Propietario_1_a_n(long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
   
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
