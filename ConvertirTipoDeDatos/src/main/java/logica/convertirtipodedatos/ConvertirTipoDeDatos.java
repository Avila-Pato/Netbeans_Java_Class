package logica.convertirtipodedatos;

public class ConvertirTipoDeDatos {

    public static void main(String[] args) {
        
        //Entero y  Double
        String cantidad = "87";
        String precio = "873.11";

        int canEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);

        System.err.println("el pecio de los alimentos son: " + canEntero * precioDouble);

        // Pasar a string
        int edad = 30;
        double estatura = 1.43;

        String edadsString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);

        System.out.println("edad " + edadsString + " estatura " + estaturaString);
    }
}
