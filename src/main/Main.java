/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import core.megaferia.MegaFeria;
import core.megaferia.editorial.Editorial;
import core.megaferia.libros.AudioLibro;
import core.megaferia.libros.Libro;
import core.megaferia.libros.LibroDigital;
import core.megaferia.libros.LibroImpreso;
import core.persona.Autor;
import core.persona.Gerente;
import core.persona.Narrador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MegaFeria megaferia = new MegaFeria();
        
        megaferia.crearStand(0, 1000);
        megaferia.crearStand(1, 2000);
        megaferia.crearStand(2, 1500);
        megaferia.crearStand(3, 1000);
        megaferia.crearStand(4, 2000);
        
        Gerente gerente = new Gerente("Eduardo", 0);
        Gerente gerente2 = new Gerente("Sebastian", 1);
        Gerente gerente3 = new Gerente("Daniel", 2);
        Gerente gerente4 = new Gerente("Andoceano", 3);
        Gerente gerente5 = new Gerente("Cristina", 4);
        
        ArrayList<Editorial> editoriales = new ArrayList<Editorial>();
        
        Editorial Planeta = new Editorial("000000", "Planeta", "N/A", gerente);
        editoriales.add(Planeta);
        
        Editorial Penguin = new Editorial("000001", "Penguin", "N/A", gerente2);
        editoriales.add(Penguin);
        
        Editorial Norma = new Editorial("000002", "Norma", "N/A", gerente3);
        editoriales.add(Norma);
        
        Editorial Alfaguara = new Editorial("000003", "Alfaguara", "N/A", gerente4);
        editoriales.add(Alfaguara);
        
        Editorial Skala = new Editorial("000004", "Skala", "N/A", gerente5);
        editoriales.add(Skala);
        
        megaferia.setEditoriales(editoriales);
        
        //String nombre, int cedula
        Autor Wanki = new Autor("Wanki", 5);
        Autor Carlos = new Autor("Carlos", 6);
        Autor Mafe = new Autor("Mafe", 7);
        Autor Manuel = new Autor("Manuel", 8);
        //Se setea posterior cuales son sus libros pero si se inicializa la lista, 
        //en este caso lo implementaré en el constructor de los libros, añadiéndolos al crearlos;
        
        Narrador Salma = new Narrador("Salma", 9);
        Narrador Blanco = new Narrador("Sebastián", 10);
        Narrador Miguel = new Narrador("Miguel", 11);
        Narrador Felipe = new Narrador("Felipe", 12);
        //Se setea posterior cuales son sus audiolibros pero si se inicializa la lista,
        //en este caso lo implementaré en el constructor de los audioLibros, añadiendolos al crearlos;
        
        //Super
        //String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial
        //AudioLibro int duracion, Narrador narrador
        //LibroDigital boolean hasHipervinculo, ArrayList<String> hipervinculos
        //LibroImpreso int paginas, int numEjemplares
        
        //Aclaración: Lo único generado con IA son los objetos de los libros que 
        //se hicieron a partir de autores, narradores y editoriales, escritos por WisDan.
        
        LibroImpreso Java = new LibroImpreso(350, 50, "Java", new ArrayList<Autor>(List.of(Wanki, Carlos)), "978-1", "Ficción", "Físico", 45000f, Planeta);
        LibroImpreso algoritmosMafe = new LibroImpreso(120, 50, "Algoritmos Mafe", new ArrayList<>(List.of(Mafe)), "978-2", "Educativo", "Físico", 32000f, Penguin);
        
        LibroDigital guiaSpring = new LibroDigital(true, new ArrayList<>(List.of("://oracle.com", "://java.com")), "Guía Spring", new ArrayList<>(List.of(Manuel)), "978-3", "Tecnología", "PDF", 15000f, Norma);
        LibroDigital sistemasOperativos = new LibroDigital(false, new ArrayList<>(), "Sistemas Operativos", new ArrayList<>(List.of(Carlos, Manuel)), "978-4", "Educativo", "EPUB", 18000f, Alfaguara);
    
        AudioLibro poemasWanki = new AudioLibro(180, Salma, "Poemas de Wanki", new ArrayList<>(List.of(Wanki)), "978-5", "Lírico", "MP3", 20000f, Skala);
        AudioLibro relatosManuel = new AudioLibro(90, Felipe, "Relatos de Manuel", new ArrayList<>(List.of(Manuel)), "978-6", "Suspenso", "WAV", 25000f, Planeta);
        
        //Versiones extra para que se pueda usar
        LibroImpreso guiaSpringFisico = new LibroImpreso(400, 20, "Guía Spring", new ArrayList<>(List.of(Manuel)), "978-3-F", "Tecnología", "Físico", 55000f, Planeta);
        AudioLibro guiaSpringAudio = new AudioLibro(300, Blanco, "Guía Spring", new ArrayList<>(List.of(Manuel)), "978-3-A", "Tecnología", "MP3", 25000f, Skala);
        
        LibroImpreso cocinaWanki = new LibroImpreso(150, 30, "Cocina Java", new ArrayList<>(List.of(Wanki)), "979-1", "Hogar", "Físico", 30000f, Norma);
        LibroDigital poemasWankiDigital = new LibroDigital(true, new ArrayList<>(List.of("://wanki.com")), "Poemas de Wanki", new ArrayList<>(List.of(Wanki)), "979-2", "Lírico", "PDF", 10000f, Alfaguara);
    
        LibroImpreso proyectoFinal = new LibroImpreso(500, 10, "Proyecto Final", new ArrayList<>(List.of(Wanki, Carlos, Mafe, Manuel)), "999-0", "Educativo", "Físico", 80000f, Penguin);
    
        ArrayList<Libro> librosDeManuel = megaferia.buscarLibros(Manuel);
        System.out.println("Manuel tiene: " + librosDeManuel.size() + " libros en la feria.");
        
        System.out.println("\n");
        
        ArrayList<String> formatosGuia = megaferia.buscarFormatos("Guía Spring");
        // Debería retornar ["PDF", "Físico", "MP3"] gracias a los libros creados antes.
        System.out.println("Formatos disponibles para 'Guía Spring':");
        for (String formato : formatosGuia) {
            System.out.println("- " + formato);
        }        
        
        System.out.println("\n");
        
        ArrayList<Libro> soloAudios = megaferia.buscarLibros("MP3");
        for (Libro libro : soloAudios) {
            System.out.println("Título: " + libro.getTitulo() + 
                               " | Editorial: " + libro.getEditorial().getNombre() + 
                               " | Precio: $" + libro.getValor());
        }

        System.out.println("\n");
        
        Autor masExitoso = megaferia.obtenerAutorMaxEditoriales();
        System.out.println("El autor con más presencia es: " + masExitoso.getNombre());

    }
    
}
