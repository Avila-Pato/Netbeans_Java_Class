
package logica.ejerciciointegrador;


public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    

   @Override
    protected void atacarPlacaje() {
        System.out.println("Placaje!!!! ratatatata!!");
    }

    @Override
    protected void atacatArañaso() {
    System.out.println("Arañazo!!!! ratatatata!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Mordiscasoo!! se muere..");
    }

    @Override
    public void atacarImapactrueno() {
        System.out.println("Impactruenooooo!!!! CHUUUUUUUUUUUU!!");
    }

    @Override
    public void atacatPuñoTrueno() {
        System.out.println("Puño truenoo!!!! RATATATATATA!!");

    }
    
}