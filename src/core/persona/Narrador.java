/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.megaferia.libros.AudioLibro;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Narrador extends Persona{
    private ArrayList<AudioLibro> audiolibros;

    public Narrador(String nombre, int cedula) {
        super(nombre, cedula);
        this.audiolibros = new ArrayList<AudioLibro>();
    }
    
    public void addAudioLibro(AudioLibro audiolibro){
        audiolibros.add(audiolibro);
    }

    public ArrayList<AudioLibro> getAudiolibros() {
        return audiolibros;
    }

    public void setAudiolibros(ArrayList<AudioLibro> audiolibros) {
        this.audiolibros = audiolibros;
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
