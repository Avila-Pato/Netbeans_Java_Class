
package logica.sobrecargaysobrescritura;


public class Perro extends AnimalPerroSobrecritura{
    
    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;
    
    //Constructores
    
    //Getter and setters

    @Override
    public void HacerSonido() {
        System.out.println("hola soy un perro ladrando digo guau guau");
    }
    
    
    
}
