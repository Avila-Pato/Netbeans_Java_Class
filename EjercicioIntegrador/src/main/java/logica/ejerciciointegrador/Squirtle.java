

package logica.ejerciciointegrador;


public class Squirtle extends  Pokemon implements IAgua {

    public Squirtle() {
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
    public void atacarHidroBomba() {
        System.out.println("Hidrobromba!!!! se ahoga..");

    }

    @Override
    public void atacarBurbubja() {
    System.out.println("AtaqueBurbuja!!!! se ahoga..");
    }

    @Override
    public void atacarPistolaAgua() {
         System.out.println("Ataque pistola!!!! Piun piun ");
    }
    
}

