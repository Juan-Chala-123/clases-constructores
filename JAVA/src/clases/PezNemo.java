/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases_abstractas.Peces;
import interfaces.IHabitat;
import interfaces.IMigrar;
import interfaces.IPresa;
import interfaces.IReproducirse;

/**
 *
 * @author CHALA RAMIREZ
 */
public class PezNemo extends Peces implements IHabitat, IReproducirse, IPresa, IMigrar {

    // Constructor con parametros
    public PezNemo(String nombre, byte aletas, byte branquias) {
        super(nombre, aletas, branquias);
    }
    
    // Constructor sin parametros
    public PezNemo() {
        super("", (byte) 3, (byte) 2);
        this.nombre = "Pez Nemo";
        this.aletas = 3;
        this.branquias = 2;
    }
    
    // Constructor copia
    public PezNemo(PezNemo p) {
        super("", (byte) 0, (byte) 0);
        this.nombre = p.nombre;
        this.aletas = p.aletas;
        this.branquias = p.branquias;
    }
    
    // Destructor
    public void close() {
        System.out.println("Destructor...");
    }
    
    @Override
    public void escamas() {
        System.out.println("Tiene escamas.");
    }

    // Metodos implementados de las interfaces
    @Override
    public void habitat() {
        System.out.println("Mares y Oceanos.");
    }

    @Override
    public void reproducirse() {
        System.out.println("Reproduccion Ovipara, Vivipara y Ovovivipara.");
    }

    @Override
    public void presa() {
        System.out.println("Animales mas grandes dentro del mar. Como tambien son presa de los humanos.");
    }

    @Override
    public void migrar() {
        System.out.println("Migran por diversas ocasiones.");
    }
}
