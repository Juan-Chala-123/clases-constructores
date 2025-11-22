/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_abstractas;

/**
 *
 * @author CHALA RAMIREZ
 */
public abstract class Reptiles {
    public String nombre;
    public String piel;

    public Reptiles(String nombre, String piel) {
        this.nombre = nombre;
        this.piel = piel;
    }
    
    // Metodo abstracto
    public abstract void ponerHuevos();
    
    public void sangre() {
        System.out.println("Sangre fria.");
    };
}
