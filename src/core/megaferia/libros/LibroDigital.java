/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia.libros;

import core.megaferia.editorial.Editorial;
import core.persona.Autor;
import java.util.ArrayList;

/**
 *  
 * @author danie
 */
public class LibroDigital extends Libro{
    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos;

    public LibroDigital(boolean hasHipervinculo, ArrayList<String> hipervinculos, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = hipervinculos;
    }

    public boolean isHasHipervinculo() {
        return hasHipervinculo;
    }

    public void setHasHipervinculo(boolean hasHipervinculo) {
        this.hasHipervinculo = hasHipervinculo;
    }

    public ArrayList<String> getHipervinculos() {
        return hipervinculos;
    }

    public void setHipervinculos(ArrayList<String> hipervinculos) {
        this.hipervinculos = hipervinculos;
    }
}
