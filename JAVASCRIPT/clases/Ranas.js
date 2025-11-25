import { Anfibios } from "../clases-abstractas/Anfibios.js"
import { IHabitat } from "../interfaces/IHabitat.js"
import { IReproducirse } from "../interfaces/IReproducirse.js"
import { IPresa } from "../interfaces/IPresa.js"

export class Ranas extends Anfibios {
    // Constructor con parametros
    constructor(nombre = "Renacuajo paseador", piel = "Delgada, frágil y permeable") {
        super(nombre, piel)
    }

    // Constructor copia - Una manera de realizarlo en javascript es mediante un metodo clone
    clone() {
        return new Ranas(this.nombre, this.piel)
    }

    // Simulacion del destructor
    destroy() {
        console.log("Destructor...")
        this.nombre = false
        this.piel = false
    }

    // Metodo de la clase padre
    metamorfosis() {
        console.log("Proceso de transformacion en cuatro etapas principales: huevo, renacuajo, renacuajo con patas y rana adulta.")
    }

    // Metodos de las interfaces
    habitat() {
        console.log("Lugares frescos y húmedos.")
    }

    reproducirse() {
        console.log("Se reproducen sexualmente.")
    }

    presa() {
        console.log("Son presas de las aves y serpientes.")
    }
}