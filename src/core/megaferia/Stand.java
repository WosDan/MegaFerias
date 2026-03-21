/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia;

import core.megaferia.editorial.Editorial;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Stand {
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(int id, float precio) {
        this.id = id;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList editoriales) {
        this.editoriales = editoriales;
    }
    
    
}
