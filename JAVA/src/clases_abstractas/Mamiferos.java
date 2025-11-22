/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_abstractas;

/**
 *
 * @author CHALA RAMIREZ
 */
public abstract class Mamiferos{
    public String nombre;
    public byte edad;
    
    // Constructor con parametros
    public Mamiferos(String nombre, byte edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Metodos
    public abstract void amamantar();
}
