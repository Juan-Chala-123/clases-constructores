/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP;

import clases.Caballo;
import clases.Cigueña;
import clases.Cocodrilo;
import clases.PezNemo;
import clases.Ranas;

/**
 *
 * @author CHALA RAMIREZ
 */
public class App {
    public static void main(String[] args) {
        // Instancias de la clase Caballo
        System.out.println("Mamiferos - Caballos");
        Caballo c1 = new Caballo("Spirit", (byte) 5);
        Caballo c2 = new Caballo();
        Caballo c3 = new Caballo(c1);
        
        System.out.println("Constructor con parametros");
        System.out.println("Nombre: " + c1.nombre + " "
                + "\nEdad: " + c1.edad);
        
        System.out.println("\nConstructor sin parametros");
        System.out.println("Nombre: " + c2.nombre + 
                "\nEdad: " + c2.edad);
        
        System.out.println("\nConstructor copia");
        System.out.println("Nombre: " + c3.nombre
                + "\nEdad: " + c3.edad);
        
        // Metodo abstracto heredado de la clase padre Mamifero
        c1.amamantar();
        
        // Metodos implementados de las interfaces
        c2.habitat();
        c3.reproducirse();
        
        
        // Instnacia de la clase Cigueña
        System.out.println("\n\nAves - Cigueña");
        Cigueña ci1 = new Cigueña("Fenix", "Negra", "Largo, recto y afilado");
        Cigueña ci2 = new Cigueña();
        Cigueña ci3 = new Cigueña(ci1);
        
        System.out.println("Constructor con parametros");
        System.out.println("Nombre: " + ci1.nombre + "\nColor: " + ci1.color + "\nForma Pico: " + ci1.pico);
        
        System.out.println("\nConstructor sin parametros");
        System.out.println("Nombre: " + ci2.nombre + "\nColor: " + ci2.color + "\nForma Pico: " + ci2.pico);
        
        System.out.println("\nConstructor copia");
        System.out.println("Nombre: " + ci3.nombre + "\nColor: " + ci3.color + "\nForma Pico: " + ci3.pico);
        
        ci2.ponerHuevo();
        ci1.volar();
        ci2.habitat();
        ci3.migrar();
        
        
        // Instancia de la clase Cocodrilo
        System.out.println("\n\nCocodrilo - Reptil");
        Cocodrilo co1 = new Cocodrilo("Tic-Tac", "Negra y escamosa");
        Cocodrilo co2 = new Cocodrilo();
        Cocodrilo co3 = new Cocodrilo(co1);
        
        System.out.println("Constructor con parametros");
        System.out.println("Nombre: " + co1.nombre + "\nPiel: " + co1.piel);
        
        System.out.println("\nConstructor sin parametros");
        System.out.println("Nombre: " + co2.nombre + "\nPiel: " + co2.piel);
        
        System.out.println("\nConstructor copia");
        System.out.println("Nombre: " + co3.nombre + "\nPiel: " + co3.piel);
        
        co1.reproducirse();
        co2.habitat();
        
        
        // Intancia de la clase Pez Nemo
        System.out.println("\n\nPez Nemo - Pez");
        PezNemo p1 = new PezNemo("Doris", (byte) 6, (byte) 2);
        PezNemo p2 = new PezNemo();
        PezNemo p3 = new PezNemo(p1);
        
        System.out.println("Constructor con parametros");
        System.out.println("Nombre: " + p1.nombre + "\nAletas: " + p1.aletas + "\nBranquias: " + p1.branquias);
        
        System.out.println("\nConstructor sin parametros");
        System.out.println("Nombre: " + p2.nombre + "\nAletas: " + p2.aletas + "\nBranquias: " + p2.branquias);
        
        System.out.println("\nConstructor copia");
        System.out.println("Nombre: " + p3.nombre + "\nAletas: " + p3.aletas + "\nBranquias: " + p3.branquias);
        
        // Metodo heredado
        p3.escamas();
        
        // Interfaces
        p1.reproducirse();
        p2.habitat();
        p3.migrar();
        p2.presa();
        
        // Instancia de la clase Ranas
        System.out.println("\n\nPez Nemo - Pez");
        Ranas r1 = new Ranas("Principe Naveen", "Verde oliva con variaciones de tono en el cuerpo");
        Ranas r2 = new Ranas();
        Ranas r3 = new Ranas(r1);
        
        System.out.println("Constructor con parametros");
        System.out.println("Nombre: " + r1.nombre + "\nPiel: " + r1.piel);
        
        System.out.println("\nConstructor sin parametros");
        System.out.println("Nombre: " + r2.nombre + "\nPiel: " + r2.piel);
        
        System.out.println("\nConstructor copia");
        System.out.println("Nombre: " + r3.nombre + "\nPiel: " + r3.piel);
        
        // Metedos heredados
        r3.metamorforsis();
        
        // Interfaes
        r1.reproducirse();
        r2.habitat();
        r3.presa();
    }
}
