/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases_abstractas.Aves;
import interfaces.IHabitat;
import interfaces.IMigrar;
import interfaces.IVolar;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Cigueña extends Aves implements IVolar, IMigrar, IHabitat {

    // Constructor con parametros
    public Cigueña(String nombre, String color, String pico) {
        super(nombre, color, pico);
    }
    
    // Constructor sin parametros
    public Cigueña() {
        super("", "", "");
        this.nombre = "Cigueña";
        this.color = "Blanco";
        this.pico = "Conico";
    }
    
    // Constructor copia
    public Cigueña(Cigueña a) {
        super("", "", "");
        this.nombre = a.nombre;
        this.color = a.color;
        this.pico = a.pico;
    }
    
    // Destructor
    public void close() {
        System.out.println("Destructor...");
    }
    
    @Override
    public void ponerHuevo() {
        System.out.println("Ponen entre 5 y 10");
    }

    @Override
    public void volar() {
        System.out.println("La ave vuela.");
    }

    @Override
    public void migrar() {
        System.out.println("Migran por alimento, reproduccion y evitar el clima extremo.");
    }

    @Override
    public void habitat() {
        System.out.println("Bosques, Ecosistemas acuáticos...");
    }
}
