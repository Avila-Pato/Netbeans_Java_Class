/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1;

/**
 *
 * @author pavil
 */
public class Evaluacion {
     private String codigoCuadro;
    private String rutCritico;
    private int calificacion;
    
    public Evaluacion(String codigoCuadro, String rutCritico, int calificacion) {
        this.codigoCuadro = codigoCuadro;
        this.rutCritico = rutCritico;
        this.calificacion = calificacion;
    }
    
    public String getCodigoCuadro() {
        return codigoCuadro;
    }
    
    public void setCodigoCuadro(String codigoCuadro) {
        this.codigoCuadro = codigoCuadro;
    }
    
    public String getRutCritico() {
        return rutCritico;
    }
    
    public void setRutCritico(String rutCritico) {
        this.rutCritico = rutCritico;
    }
    
    public int getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
}
