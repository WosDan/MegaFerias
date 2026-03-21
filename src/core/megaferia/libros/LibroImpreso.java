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
public class LibroImpreso extends Libro{
    private int paginas;
    private int numEjemplares;

    public LibroImpreso(int paginas, int numEjemplares, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.paginas = paginas;
        this.numEjemplares = numEjemplares;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }
    
    
}
