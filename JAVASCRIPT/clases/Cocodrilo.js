import { Reptiles } from "../clases-abstractas/Reptiles.js"
import { IReproducirse } from "../interfaces/IReproducirse.js"
import { IHabitat } from "../interfaces/IHabitat.js"

export class Cocodrilo extends Reptiles {
    // Constructor con parametros
    constructor(nombre = "Cocodrilo Dante", piel  ="Piel seca y escamosa") {
        super(nombre, piel)
    }

    // Constructor copia
    clone() {
        return new Cocodrilo(this.nombre, this.piel)
    }

    // Destructor
    destroy() {
        console.log("Destructor...")
        this.nombre = false
        this.piel = false
    }

    // Metodo de la clase padre
    ponerHuevos() {
        console.log("Ponen entre 14 y 40 huevos al año.")
    }

    // Metodos implementados de las interfaces
    reproducirse() {
        console.log("Se reproducen sexualmente, son oviparos.")
    }

    habitat() {
        console.log("Rios.")
    }
}