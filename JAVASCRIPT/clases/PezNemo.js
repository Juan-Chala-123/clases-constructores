import { Peces } from "../clases-abstractas/Peces.js"
import { IHabitat } from "../interfaces/IHabitat.js"
import { IReproducirse } from "../interfaces/IReproducirse.js"
import { IPresa } from "../interfaces/IPresa.js"
import { IMigrar } from "../interfaces/IMigrar.js"

export class PezNemo extends Peces {
    // Constructor con parametros
    constructor(nombre = "Pez Nemo", aletas = 2, branquias = 2) {
        super(nombre, aletas, branquias)
    }

    // Constructor copia
    clone() {
        return new PezNemo(this.nombre, this.aletas, this.branquias)
    }

    // Destructor 
    destroy() {
        console.log("Destructor...")
        this.nombre = false
        this.aletas = false
        this.branquias = false
    }

    // Metodo de la clase padre
    escamas() {
        console.log("Tiene escamas.")
    }

    // Metodos implementados de las interfaces
    habitat() {
        console.log("Mares y Oceanos.")
    }

    reproducirse() {
        console.log("Reproduccion Ovipara, Vivipara y Ovovivipara.")
    }

    presa() {
        console.log("Animales mas grandes dentro del mar. Como tambien es presa de los humanos.")
    }

    migrar() {
        console.log("Migran por diversas ocasiones.")
    }
}