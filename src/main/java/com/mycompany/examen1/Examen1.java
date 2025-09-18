package com.mycompany.examen1;

import com.mycompany.examen1.Cuadro;
import com.mycompany.examen1.Evaluacion;
import com.mycompany.examen1.Galeria;
import com.mycompany.examen1.Persona;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.Year;


public class Examen1 {
    

    private static ArrayList<Galeria> galerias = new ArrayList<>();
    private static ArrayList<Persona> personas = new ArrayList<>();
    private static ArrayList<Cuadro> cuadros = new ArrayList<>();
    private static ArrayList<Evaluacion> evaluaciones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    


    public static void main(String[] args) {
        while (true) {
            System.out.println("-------------SISTEMA DE ARTE -------------");
            System.out.println("1. Ingresar Galeria");
            System.out.println("2. Ingresar Critico");
            System.out.println("3. Ingresar Cuadro");
            System.out.println("4. Ingresar Evaluacion");
            System.out.println("5. Ver Resultados");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextByte();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ingresarGaleria();
                    break;
                case 2:
                    ingresarCritico();
                    break;
                case 3:
                    ingresarCuadro();
                    break;
                case 4:
                    ingresarEvaluacion();
                    break;
                case 5:
                    verResultados();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    static void ingresarGaleria() {
        System.out.print("Codigo galeria: ");
        String codigo = scanner.nextLine();

        System.out.print("Nombre galeria: ");
        String nombre = scanner.nextLine();
        if (nombre.trim().isEmpty()) {
            System.out.println("El nombre de la galeria no puede estar vacio");
            return;
        }

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        if (ciudad.trim().isEmpty()) {
            System.out.println("La ciudad no puede estar vacia");
            return;
        }

        galerias.add(new Galeria(codigo, nombre, ciudad));
        System.out.println("Galeria agregada!");
    }

    static void ingresarCritico() {
        System.out.print("Nombre critico: ");
        String nombre = scanner.nextLine();
        if (nombre.trim().isEmpty()) {
            System.out.println("El nombre del critico no puede estar vacio");
            return;
        }

        System.out.print("RUT: ");
        String rut = scanner.nextLine();

        System.out.print("Especialidad: ");
        String especialidad = scanner.nextLine();

        System.out.print("Años experiencia: ");
        int experiencia = scanner.nextInt();
        scanner.nextLine();
        if (experiencia < 0 || experiencia > 80) {
            System.out.println("Experiencia inválida. Debe estar entre 0 y 80 años");
            return;
        }

        Critico critico = new Critico(nombre, rut, especialidad, experiencia);
        personas.add(critico);
        System.out.println("Critico agregado!");
    }

    static void ingresarCuadro() {
        if (galerias.isEmpty()) {
            System.out.println("Agregue una galeria para continuar");
            return;
        }

        System.out.print("Codigo cuadro: ");
        String codigo = scanner.nextLine();

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        if (titulo.trim().isEmpty()) {
            System.out.println("El titulo no puede estar vacio");
            return;
        }

        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        if (autor.trim().isEmpty()) {
            System.out.println("El autor no puede estar vacio");
            return;
        }

        System.out.print("Año: ");
        int año = scanner.nextInt();
        scanner.nextLine();
        int añoActual = Year.now().getValue();
        if (año < 1500 || año > añoActual) {
            System.out.println("Año inválido. Debe estar entre 1500 y " + añoActual);
            return;
        }

        System.out.println("Galerias disponibles:");
        for (int i = 0; i < galerias.size(); i++) {
            System.out.println((i + 1) + ". " + galerias.get(i).getNombre());
        }
        System.out.print("Elige una galeria: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        if (option < 1 || option > galerias.size()) {
            System.out.println("Opcion de galeria inválida");
            return;
        }

        cuadros.add(new Cuadro(codigo, titulo, autor, año, galerias.get(option - 1)));
        System.out.println("Cuadro agregado!");
    }

    static void ingresarEvaluacion() {
        if (cuadros.isEmpty() || personas.isEmpty()) {
            System.out.println("Ingrese cuadro y criticos primero");
            return;
        }

        System.out.println("Cuadros disponibles:");
        for (int i = 0; i < cuadros.size(); i++) {
            System.out.println((i + 1) + ". " + cuadros.get(i).getTitulo());
        }
        System.out.print("Elige cuadro: ");
        int opcionCuadro = scanner.nextInt();
        scanner.nextLine();
        if (opcionCuadro < 1 || opcionCuadro > cuadros.size()) {
            System.out.println("Opcion de cuadro inválida");
            return;
        }

        System.out.println("Criticos disponibles:");
        int contador = 1;
        ArrayList<Critico> criticosDisponibles = new ArrayList<>();
        for (Persona p : personas) {
            if (p instanceof Critico) {
                System.out.println(contador + ". " + p.getNombre());
                criticosDisponibles.add((Critico) p);
                contador++;
            }
        }
        if (criticosDisponibles.isEmpty()) {
            System.out.println("No hay criticos disponibles");
            return;
        }

        System.out.print("Elige critico: ");
        int opcionCritico = scanner.nextInt();
        scanner.nextLine();
        if (opcionCritico < 1 || opcionCritico > criticosDisponibles.size()) {
            System.out.println("Opcion de critico inválida");
            return;
        }

        System.out.print("Calificacion (0-70): ");
        int calificacion = scanner.nextInt();
        scanner.nextLine();
        if (calificacion < 0 || calificacion > 70) {
            System.out.println("Calificacion inválida. Debe estar entre 0 y 70");
            return;
        }

        String codigoCuadro = cuadros.get(opcionCuadro - 1).getCodigo();
        String rutCritico = criticosDisponibles.get(opcionCritico - 1).getRut();

        evaluaciones.add(new Evaluacion(codigoCuadro, rutCritico, calificacion));
        System.out.println("Evaluacion agregada!");
    }

    static void verResultados() {
        for (Evaluacion eval : evaluaciones) {
            Cuadro cuadro = buscarCuadro(eval.getCodigoCuadro());
            Persona critico = buscarPersona(eval.getRutCritico());

            if (cuadro != null && critico != null) {
                // En lugar del operador ternario, usamos if-else simple
                String resultado;
                if (eval.getCalificacion() > 40) {
                    resultado = "EXHIBIR";
                } else {
                    resultado = "GUARDAR";
                }

                System.out.println("Cuadro: " + cuadro.getTitulo());
                System.out.println("Critico: " + critico.getNombre());
                System.out.println("Calificacion: " + eval.getCalificacion());
                System.out.println("Resultado: " + resultado);
            }
        }
    }

    static Cuadro buscarCuadro(String codigo) {
        for (int i = 0; i < cuadros.size(); i++) {
            Cuadro c = cuadros.get(i);
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    static Persona buscarPersona(String rut) {
        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);
            if (p.getRut().equals(rut)) {
                return p;
            }
        }
        return null;

    }
}
