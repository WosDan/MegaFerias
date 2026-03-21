/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import core.megaferia.MegaFeria;
import core.megaferia.editorial.Editorial;
import core.persona.Gerente;

/**
 *
 * @author danie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MegaFeria megaferia = new MegaFeria();
        
        megaferia.crearStand(0, 1000);
        megaferia.crearStand(1, 2000);
        megaferia.crearStand(2, 1500);
        megaferia.crearStand(3, 1000);
        megaferia.crearStand(4, 2000);
        
        Gerente gerente = new Gerente("Eduardo", 0);
        Gerente gerente2 = new Gerente("Sebastian", 1);
        Gerente gerente3 = new Gerente("Daniel", 2);
        Gerente gerente4 = new Gerente("Andoceano", 3);
        Gerente gerente5 = new Gerente("Cristina", 4);
        
        Editorial editorial = new Editorial("000000", "Planeta", "N/A", gerente);
        Editorial editorial2 = new Editorial("000001", "Planeta", "N/A", gerente2);
        Editorial editorial3 = new Editorial("000002", "Planeta", "N/A", gerente3);
        Editorial editorial4 = new Editorial("000003", "Planeta", "N/A", gerente4);
        Editorial editorial5 = new Editorial("000004", "Planeta", "N/A", gerente5);
        
    }
    
}
