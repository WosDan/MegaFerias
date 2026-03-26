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
        MegaFeria megaferia = new MegaFeria();
        
        // Paso (2)
        megaferia.crearStand(15772000, 75000.0f);
        megaferia.crearStand(15772100, 90000.0f);
        megaferia.crearStand(15772200, 100000.0f);
        megaferia.crearStand(15772300, 145000.0f);
        megaferia.crearStand(15772400, 50000.0f);
        
        // Paso (3)
        Narrador narrador = new Narrador("Juan Perez", 1234871246);
        
        // Paso (4) x3
        Gerente gerente1 = new Gerente("Pablo Ramos", 1234951134);
        Gerente gerente2 = new Gerente("John Doe", 1234951134);
        Gerente gerente3 = new Gerente("Maria Mercedes", 1234951134);
        
        // Paso (5) x3
        Editorial editorial1 = new Editorial("980147523-9", "Planeta", "Cra 52 # 45 - 62", gerente1);
        Editorial editorial2 = new Editorial("980897423-3", "Nova", "Cra 72 # 98 - 153", gerente2);
        Editorial editorial3 = new Editorial("981874133-6", "Norma", "Cra 21 # 27 - 35", gerente3);
        
        // Paso (6) x3
        megaferia.addEditorial(editorial1);
        megaferia.addEditorial(editorial2);
        megaferia.addEditorial(editorial3);
        
        // Paso (7) x5
        megaferia.getStand(15772000).addEditorial(editorial1);
        editorial1.addStand(megaferia.getStand(15772000));
        
        megaferia.getStand(15772100).addEditorial(editorial1);
        editorial1.addStand(megaferia.getStand(15772100));
        
        megaferia.getStand(15772200).addEditorial(editorial2);
        editorial2.addStand(megaferia.getStand(15772200));
        
        megaferia.getStand(15772300).addEditorial(editorial3);
        editorial3.addStand(megaferia.getStand(15772300));
        
        megaferia.getStand(15772400).addEditorial(editorial2);
        editorial2.addStand(megaferia.getStand(15772400));
        
        Autor Wanki = new Autor("Wanki", 5);
        Autor Carlos = new Autor("Carlos", 6);
        Autor Mafe = new Autor("Mafe", 7);
        Autor Manuel = new Autor("Manuel", 8);

        Narrador Salma = new Narrador("Salma", 9);
        Narrador Blanco = new Narrador("Sebastián", 10);
        Narrador Miguel = new Narrador("Miguel", 11);
        Narrador Felipe = new Narrador("Felipe", 12);
        
        LibroImpreso Java = new LibroImpreso(350, 50, "Java", new ArrayList<Autor>(List.of(Wanki, Carlos)), "978-1", "Ficción", "Físico", 45000f, editorial1);
        LibroImpreso algoritmosMafe = new LibroImpreso(120, 50, "Algoritmos Mafe", new ArrayList<>(List.of(Mafe)), "978-2", "Educativo", "Físico", 32000f, editorial2);
        
        LibroDigital guiaSpring = new LibroDigital(true, new ArrayList<>(List.of("://oracle.com", "://java.com")), "Guía Spring", new ArrayList<>(List.of(Manuel)), "978-3", "Tecnología", "PDF", 15000f, editorial3);
        LibroDigital sistemasOperativos = new LibroDigital(false, new ArrayList<>(), "Sistemas Operativos", new ArrayList<>(List.of(Carlos, Manuel)), "978-4", "Educativo", "EPUB", 18000f, editorial1);
    
        AudioLibro poemasWanki = new AudioLibro(180, Salma, "Poemas de Wanki", new ArrayList<>(List.of(Wanki)), "978-5", "Lírico", "MP3", 20000f, editorial2);
        AudioLibro relatosManuel = new AudioLibro(90, Felipe, "Relatos de Manuel", new ArrayList<>(List.of(Manuel)), "978-6", "Suspenso", "WAV", 25000f, editorial1);
        
        LibroImpreso guiaSpringFisico = new LibroImpreso(400, 20, "Guía Spring", new ArrayList<>(List.of(Manuel)), "978-3-F", "Tecnología", "Físico", 55000f, editorial1);
        AudioLibro guiaSpringAudio = new AudioLibro(300, Blanco, "Guía Spring", new ArrayList<>(List.of(Manuel)), "978-3-A", "Tecnología", "MP3", 25000f, editorial2);
        
        LibroImpreso cocinaWanki = new LibroImpreso(150, 30, "Cocina Java", new ArrayList<>(List.of(Wanki)), "979-1", "Hogar", "Físico", 30000f, editorial3);
        LibroDigital poemasWankiDigital = new LibroDigital(true, new ArrayList<>(List.of("://wanki.com")), "Poemas de Wanki", new ArrayList<>(List.of(Wanki)), "979-2", "Lírico", "PDF", 10000f, editorial3);
    
        LibroImpreso proyectoFinal = new LibroImpreso(500, 10, "Proyecto Final", new ArrayList<>(List.of(Wanki, Carlos, Mafe, Manuel)), "999-0", "Educativo", "Físico", 80000f, editorial3);
    
        
        ///Añadido mío
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
    
    /*
    public static void mainViejo() {
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
        megaferia.getStand(0).addEditorial(Planeta);
        Planeta.addStand(megaferia.getStand(0));
        
        Editorial Penguin = new Editorial("000001", "Penguin", "N/A", gerente2);
        editoriales.add(Penguin);
        megaferia.getStand(1).addEditorial(Penguin);
        megaferia.getStand(2).addEditorial(Penguin);
        Penguin.addStand(megaferia.getStand(1));
        Penguin.addStand(megaferia.getStand(2));
        
        Editorial Norma = new Editorial("000002", "Norma", "N/A", gerente3);
        editoriales.add(Norma);
        megaferia.getStand(3).addEditorial(Norma);
        Norma.addStand(megaferia.getStand(3));
        
        Editorial Alfaguara = new Editorial("000003", "Alfaguara", "N/A", gerente4);
        editoriales.add(Alfaguara);
        megaferia.getStand(1).addEditorial(Alfaguara);
        Alfaguara.addStand(megaferia.getStand(1));
        
        Editorial Skala = new Editorial("000004", "Skala", "N/A", gerente5);
        editoriales.add(Skala);
        megaferia.getStand(4).addEditorial(Alfaguara);
        Alfaguara.addStand(megaferia.getStand(4));
        
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
    */
    
}
