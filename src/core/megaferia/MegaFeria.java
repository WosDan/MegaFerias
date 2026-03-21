/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia;

import core.megaferia.editorial.Editorial;
import core.megaferia.libros.Libro;
import core.persona.Autor;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class MegaFeria {
    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    public MegaFeria() {
        this.stands = crearStands();
    }
    
    public MegaFeria(ArrayList<Editorial> editoriales) {
        this.stands = crearStands();
        this.editoriales = editoriales;
    }
    
    public ArrayList<Libro> buscarLibros(Autor autor){
        ArrayList<Libro> librosPorAutor = new ArrayList<Libro>();
        for(Editorial editorial : editoriales){
            ArrayList<Libro> libros = editorial.getLibros();
            for(Libro libro : libros){
                ArrayList<Autor> autores = libro.getAutores();
                if(autores.contains(autor)){
                    librosPorAutor.add(libro);
                }
            }         
        }
        
        return librosPorAutor;
    }
    
    public ArrayList<Libro> buscarLibros(String formato){
        ArrayList<Libro> librosPorFormato = new ArrayList<Libro>();
        for(Editorial editorial : editoriales){
            ArrayList<Libro> libros = editorial.getLibros();
            for(Libro libro : libros){
                if(formato.equals(libro.getFormato())){
                    librosPorFormato.add(libro);
                }
            }         
        }
        
        return librosPorFormato;
    }
    
    public ArrayList<String> buscarFormatos(String nombreLibro){
        ArrayList<String> formatos = new ArrayList<String>();
        for(Editorial editorial : editoriales){
            ArrayList<Libro> libros = editorial.getLibros();
            for(Libro libro : libros){
                String titulo = libro.getTitulo();                
                String formato = libro.getFormato();
                if(nombreLibro.equals(titulo) && !formatos.contains(formato)){
                    formatos.add(formato);
                }
            }         
        }
        return formatos;
    }
    
    public Autor obtenerAutorMaxEditoriales(){
        int maxEditoriales = 0;
        
        for(Editorial editorial : editoriales){
            ArrayList<Autor> autores = editorial.obtenerAutores();
            for(Autor autor : autores){
                int editorialesDelAutor = autor.obtenerNumEditoriales();
                if(editorialesDelAutor >= maxEditoriales){
                    maxEditoriales = editorialesDelAutor;
                }
            }         
        }
        
        ArrayList<Autor> autoresConMasEditoriales = new ArrayList<Autor>();
        for(Editorial editorial : editoriales){
            ArrayList<Autor> autores = editorial.obtenerAutores();
            for(Autor autor : autores){
                if(autor.obtenerNumEditoriales() == maxEditoriales){
                    autoresConMasEditoriales.add(autor);
                }
            }
        }
        
        //Hice que retornara el autor con mas editoriales de forma aleatoria entre
        //los que más tiene. Por qué, porque en el UML sale que debe retornar Autor,
        //y no Lista de Autores, y me pareció que era más gracioso así.
        return autoresConMasEditoriales.get((int) (Math.random() * (autoresConMasEditoriales.size())));
    }
    
    private ArrayList<Stand> crearStands(){
        return new ArrayList<Stand>();
    }
    
    public void crearStand(int id, float precio){
        this.stands.add(new Stand(id, precio));
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }

    public void setStands(ArrayList<Stand> stands) {
        this.stands = stands;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList<Editorial> editoriales) {
        this.editoriales = editoriales;
    }
}
