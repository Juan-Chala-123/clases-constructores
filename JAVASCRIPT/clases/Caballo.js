import { Mamiferos } from "../clases-abstractas/Mamiferos.js"
import { IHabitat } from "../interfaces/IHabitat.js"
import { IReproducirse } from "../interfaces/IReproducirse.js"

export class Caballo extends Mamiferos {
    // Constructor con parametros
    constructor(nombre = "Pegaso", edad = 12) {
        super(nombre, edad)
    }

    // Constructor sin parametros
    //constructor() {
    //    super("", 0)
    //    this.nombre = "Pegaso"
    //    this.edad = 12
    //}

    // Constructor copia
    clone() {
        return new Caballo(this.nombre, this.edad)
    }

    // Destructor
    destroy() {
        console.log("Destructor...")
        this.nombre = false
        this.edad = false
    }

    //Metodo de la clase padre
    amamantar() {
        console.log("El caballo amamanta a sus crias.")
    }

    // Metodos implementados de las interfaces
    habitat() {
        console.log("De acuerdo a sus origenes, como tambien de manera global.")
    }

    reproducirse() {
        console.log("Se reproducen sexualmente.")
    }
}