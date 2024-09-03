package logica.enums;

// Definición del enum fuera de la clase principal
enum DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}

public class EjemploEnum {

    public static void main(String[] args) {
        // Uso del enum
        DiaSemana dia = DiaSemana.LUNES;
        System.out.println("Día de la semana: " + dia);

        // Uso del método values() para recorrer todos los valores del enum
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println("Día: " + d);
        }
    }
}
