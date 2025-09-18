/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1;

/**
 *
 * @author pavil
 */
public class Cuadro {
     private String codigo;
    private String titulo;
    private String autor;
    private int año;
    private Galeria galeria;
    
    public Cuadro(String codigo, String titulo, String autor, int año, Galeria galeria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.galeria = galeria;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getAño() {
        return año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    
    public Galeria getGaleria() {
        return galeria;
    }
    
    public void setGaleria(Galeria galeria) {
        this.galeria = galeria;
    }
}
