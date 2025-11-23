/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases_abstractas.Anfibios;
import interfaces.IHabitat;
import interfaces.IPresa;
import interfaces.IReproducirse;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Ranas extends Anfibios implements IHabitat, IReproducirse, IPresa {

    // Constructor con parametros
    public Ranas(String nombre, String piel) {
        super(nombre, piel);
    }
    
    // Constructor sin parametros
    public Ranas() {
        super("", "");
        this.nombre = "Renacuajo paseador";
        this.piel = "Delgada, frágil y permeable";
    }
    
    // Constructor copia
    public Ranas(Ranas r) {
        super("", "");
        this.nombre = r.nombre;
        this.piel = r.piel;
    }
    
    // Destructor
    public void close() {
        System.out.println("Destructor...");
    }

    // Metodos sobreescritos
    @Override
    public void metamorforsis() {
        System.out.println("Proceso de transformacion en cuatro etapas principales: huevo, renacuajo, renacuajo con patas y rana adulta.");
    }

    // Metodos implementados de las interfaces
    @Override
    public void habitat() {
        System.out.println("Lugares frescos y húmedos.");
    }

    @Override
    public void reproducirse() {
        System.out.println("Se reproducen sexualmente.");
    }

    @Override
    public void presa() {
        System.out.println("Son presas de las aves y serpientes.");
    }
    
}
