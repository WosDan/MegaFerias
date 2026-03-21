/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia.libros;

import core.megaferia.editorial.Editorial;
import core.persona.Autor;
import core.persona.Narrador;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class AudioLibro extends Libro{
    private int duracion;
    private Narrador narrador;

    public AudioLibro(int duracion, Narrador narrador, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.duracion = duracion;
        this.narrador = narrador;
        narrador.addAudioLibro(this);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Narrador getNarrador() {
        return narrador;
    }

    public void setNarrador(Narrador narrador) {
        this.narrador = narrador;
    }
}
