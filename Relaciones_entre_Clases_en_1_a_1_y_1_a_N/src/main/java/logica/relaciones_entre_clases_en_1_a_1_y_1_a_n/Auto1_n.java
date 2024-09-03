
package logica.relaciones_entre_clases_en_1_a_1_y_1_a_n;

import java.util.List;


public class Auto1_n {
    
    private long id;
    private String marca;
    private String modelo;
    
     public Auto1_n () {
        
    }

    @Override
    public String toString() {
        return "Auto1_n{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietarios=" + listaPropietarios + '}';
    }
    
    private List<Propietario_1_a_n> listaPropietarios;

    public Auto1_n(long id, String marca, String modelo, List<Propietario_1_a_n> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }
    public List<Propietario_1_a_n> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario_1_a_n> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
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
