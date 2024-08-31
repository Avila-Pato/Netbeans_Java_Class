
package logica.interfaces;

public class Cuadrado implements Figura, Dibujable{

    private double lado;
  
    
    public Cuadrado() {
        
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double ClcularArea() {
         double resultado = lado * lado;
         return  resultado;
    };

    @Override
    public void dibujar() {
        System.out.println("Hola ando dibujando un cuadrado");
    }
}
