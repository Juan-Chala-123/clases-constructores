/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_abstractas;

/**
 *
 * @author CHALA RAMIREZ
 */
public abstract class Anfibios {
    public String nombre;
    public String piel;
    
    // Constructor con parametros
    public Anfibios(String nombre, String piel) {
        this.nombre = nombre;
        this.piel = piel;
    }
    
    public abstract void metamorforsis();
}
