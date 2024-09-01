package logica.ejerciciointegrador;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
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


        // Implementes!!
    @Override
    public void atacatPuñoFuego() {
        System.out.println("Puño Fuego!!!.. se quema");
    }

    @Override
    public void atacatLanzaLllamas() {
        System.out.println("Lanzallamas!! quema a su entrenador..");
    }

    @Override
    public void atacatAscuas() {
        System.out.println("Aspuas!! se pinche y explota..");
    }

}
