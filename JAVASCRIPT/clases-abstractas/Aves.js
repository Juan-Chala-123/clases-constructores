export class Aves {
    nombre
    color
    pico

    constructor(nombre, color, pico) {
        this.nombre = nombre
        this.color = color
        this.pico = pico
    }

    // Metodo abstracto
    ponerHuevo() {
        console.log("...")
    }
}