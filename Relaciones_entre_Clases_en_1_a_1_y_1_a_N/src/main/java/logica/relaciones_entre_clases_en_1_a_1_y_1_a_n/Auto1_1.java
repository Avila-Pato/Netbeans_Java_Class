
package logica.relaciones_entre_clases_en_1_a_1_y_1_a_n;


public class Auto1_1 {
    
    private long id;
    private String marca;
    private String modelo;
    
    public Auto1_1 () {
        
    }

    public Auto1_1(long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
