/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.megaferia.libros.Libro;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Autor extends Persona{
    private ArrayList<Libro> libros;

    public Autor(ArrayList<Libro> libros, String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = libros;
    }
    
    public int obtenerNumEditoriales(){
        return 1;   
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
