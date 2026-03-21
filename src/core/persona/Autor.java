/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.megaferia.editorial.Editorial;
import core.megaferia.libros.Libro;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Autor extends Persona{
    private ArrayList<Libro> libros;

    public Autor(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<Libro>();
    }
    
    public int obtenerNumEditoriales(){
        ArrayList<Editorial> editoriales = new ArrayList<Editorial>();
        for(Libro l : libros){
            Editorial editorial = l.getEditorial();
            if(!editoriales.contains(editorial)){
                editoriales.add(editorial);
            }
        } 
        return editoriales.size();
    }
    
    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
}
