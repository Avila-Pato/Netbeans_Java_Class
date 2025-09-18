
package com.mycompany.examen1;

public class Critico extends Persona {
    
    private String especialidad;
    private int experiencia; 
    
    public Critico(String nombre, String rut, String especialidad, int experiencia) {
        super(nombre, rut);
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public int getExperiencia() {
        return experiencia;
    }
    
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
