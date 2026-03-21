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
        return new ArrayList<Libro>();
    }
    
    public ArrayList<Libro> buscarLibros(String formato){
        return new ArrayList<Libro>();
    }
    
    public ArrayList<String> buscarFormatos(String nombreLibro){
        return new ArrayList<String>();
    }
    
    public Autor obtenerAutorMaxEditoriales(){
        return new Autor(new ArrayList<Libro>(), "", 0);
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
