/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases_abstractas.Mamiferos;
import interfaces.IHabitat;
import interfaces.IReproducirse;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Caballo extends Mamiferos implements IHabitat, IReproducirse {

    // Constructor con parametros
    public Caballo(String nombre, byte edad) {
        super(nombre, edad);
    }
    
    // Constructor sin parametros
    public Caballo() {
        super("", (byte) 12);
        this.nombre = "Pegaso";
        this.edad = 12;
    }
    
    // Constructor copia
    public Caballo(Caballo c) {
        super("", (byte) 12);
        this.nombre = c.nombre;
        this.edad = c.edad;
    }
    
    // Destructor
    public void close() {
        System.out.println("Destructor...");
    }

    // Metodo sobreescrito
    @Override
    public void amamantar() {
        System.out.println("El caballo amamanta a sus crias.");
    }

    // Metodos implementados de las interfaces
    @Override
    public void habitat() {
        System.out.println("De acuerdo a sus origenes, como tambien de manera global.");
    }

    @Override
    public void reproducirse() {
        System.out.println("Se reproducen sexualmente.");
    }
}
