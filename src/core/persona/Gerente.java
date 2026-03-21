/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.megaferia.editorial.Editorial;

/**
 *
 * @author danie
 */
public class Gerente extends Persona{
    private Editorial editorial;

    public Gerente(String nombre, int cedula) {
        super(nombre, cedula);
    }
    
    public Gerente(Editorial editorial, String nombre, int cedula) {
        super(nombre, cedula);
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
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
