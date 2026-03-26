/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia.editorial;

import core.megaferia.libros.Libro;
import core.megaferia.Stand;
import core.persona.Autor;
import core.persona.Gerente;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Editorial {
    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public Editorial(String nit, String nombre, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<Libro>();
        this.stands = new ArrayList<Stand>();
    }
    
    public Editorial(String nit, String nombre, String direccion, Gerente gerente) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.libros = new ArrayList<Libro>();
        this.stands = new ArrayList<Stand>();
    }
    
    public ArrayList<Autor> obtenerAutores(){
        ArrayList<Autor> autores = new ArrayList<Autor>();
        
        for(Libro libro : libros){
            for(Autor autor : libro.getAutores()){
                if(!autores.contains(autor)){
                    autores.add(autor);
                }
            }
        }
        
        return autores;
    }
    
    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList getLibros() {
        return libros;
    }

    public void setLibros(ArrayList libros) {
        this.libros = libros;
    }

    public ArrayList getStands() {
        return stands;
    }

    public void setStands(ArrayList stands) {
        this.stands = stands;
    }
    
    public void addStand(Stand stand){
        this.stands.add(stand);
    }
    
}
