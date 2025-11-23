/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases_abstractas.Reptiles;
import interfaces.IHabitat;
import interfaces.IReproducirse;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Cocodrilo extends Reptiles implements IReproducirse, IHabitat {
    
    // Constructor con parametros
    public Cocodrilo(String nombre, String piel) {
        super(nombre, piel);
    }
    
    // Constructor sin parametros
    public Cocodrilo() {
        super("", "");
        this.nombre = "Cocodrilo 1";
        this.piel = "Piel seca y escamosa";
    }
    
    // Constructor copia
    public Cocodrilo(Cocodrilo c) {
        super("", "");
        this.nombre = c.nombre;
        this.piel = c.piel;
    }
    
    // Destructor
    public void close() {
        System.out.println("Destructor...");
    }
    
    // Metodos sobreescritos
    @Override
    public void ponerHuevos() {
        System.out.println("Ponen entre 14 y 40 huevos al año.");
    }

    // Metodos implementados de las Interfaces
    @Override
    public void reproducirse() {
        System.out.println("Se reproducen sexualmente, son oviparos.");
    }

    @Override
    public void habitat() {
        System.out.println("Rios.");
    }
}
