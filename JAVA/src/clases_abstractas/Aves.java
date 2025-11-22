/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_abstractas;

/**
 *
 * @author CHALA RAMIREZ
 */
public abstract class Aves{
    public String nombre;
    public String color;
    public String pico;
    
    // Constructor con parametros
    public Aves(String nombre, String color, String pico) {
        this.nombre = nombre;
        this.color = color;
        this.pico = pico;
    }
    
    // Constructor sin parametros
    public Aves() {
        this.nombre = "Michi";
        this.color = "Blanco";
        this.pico = "Conico";
    }
    
    // Constructor copia
    public Aves(Aves a) {
        this.nombre = a.nombre;
        this.color = a.color;
        this.pico = a.pico;
    }
    
    // Destructor
    public void finalize() {
        System.out.println("Codigo Borrado.");
    }
    
    // Metedo abstracto
    public abstract void ponerHuevo();
}
