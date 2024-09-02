
package logica.sobrecargaysobrescritura;


public class Gato extends AnimalPerroSobrecritura{

    @Override
    public void HacerSonido() {
        System.out.println("Soy un gato sobrescribiendo miau");
        }
    
}
