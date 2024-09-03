
package logica.ejercicio;


public class Videojuego {
    
    private int codigo;
    private String titulo;
    private String consola;
    private int canJugdores;
    private String categoria;

    
    public Videojuego() {
    }

    public Videojuego(int codigo, String titulo, String consola, int canJugdores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.canJugdores = canJugdores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCanJugdores() {
        return canJugdores;
    }

    public void setCanJugdores(int canJugdores) {
        this.canJugdores = canJugdores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", canJugdores=" + canJugdores + ", categoria=" + categoria + '}';
    }
    
}
