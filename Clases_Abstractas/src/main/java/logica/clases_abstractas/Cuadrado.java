
package logica.clases_abstractas;

public class Cuadrado extends Figura{

    private double lado;
  
    
    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
    
    @Override
    public double ClcularArea() {
         double resultado = lado * lado;
         return  resultado;
    };
}
