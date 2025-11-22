/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_abstractas;

/**
 *
 * @author CHALA RAMIREZ
 */
public abstract class Peces {
    public String nombre;
    public byte aletas; // Cantidad
    public byte branquias; // Cantidad
    
    // Constructor con parametros
    public Peces(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodo abstracto
    public abstract void escamas();
}
