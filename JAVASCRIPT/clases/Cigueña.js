import { Aves } from "../clases-abstractas/Aves.js"
import { IVolar } from "../interfaces/IVolar.js"
import { IMigrar } from "../interfaces/IMigrar.js"
import { IHabitat } from "../interfaces/IHabitat.js"

export class Cigueña extends Aves {
    // Constructor con parametros
    constructor(nombre = "Cigueña", color = "Blanco", pico = "Conico") {
        super(nombre, color, pico)
    }

    //Constructor copia 
    clone() {
        return new Cigueña(this.nombre, this.color, this.pico)
    }

    // Destructor
    destroy() {
        console.log("Destructor...")
        this.nombre = false
        this.color = false
        this.pico = false
    }

    // Metodo de la clase padre
    ponerHuevo() {
        console.log("Ponen entre 5 y 10")
    }

    // Metodo implementado de las interfaces
    volar() {
        console.log("La ave vuela.")
    }

    migrar() {
        console.log("Migran por alimento, reproduccion y evitar el clima extremo.")
    }

    habitat() {
        console.log("Bosques, Ecosistemas acuáticos...")
    }
}