
package logica.ejerciciointegrador;


public class Bulbasaur extends  Pokemon implements IPlanta{

    public Bulbasaur() {
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
    public void atacarDrenaje() {
        System.out.println("Ataque drenaje!! se intoxica..");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Ataque paralizante!! no hace daño y explota..");

    }
    
}
