import { Caballo } from "./clases/Caballo.js"
import { Cigueña } from "./clases/Cigueña.js"
import { Cocodrilo } from "./clases/Cocodrilo.js"
import { PezNemo } from "./clases/PezNemo.js"
import { Ranas } from "./clases/Ranas.js"

// Instancias de la clase Caballo
console.log("Mamiferos - Caballos")
const c1 = new Caballo("Spirit", 5)
const c2 = new Caballo() // Toma los valores por defecto
const c3 = c1.clone()

console.log("Constructor con parametros: ")
console.log("Nombre: " + c1.nombre + "\nEdad: " + c1.edad)

console.log("\nConstructor sin parametros");
console.log("Nombre: " + c2.nombre + "\nEdad: " + c2.edad);
        
console.log("\nConstructor copia");
console.log("Nombre: " + c3.nombre + "\nEdad: " + c3.edad);

// Metodo abstracto heredado de la clase padre Mamifero
c1.amamantar();
// Metodos implementados de las interfaces
c2.habitat();
c3.reproducirse();

// Instnacia de la clase Cigueña
console.log("\n\nAves - Cigueña")
const ci1 = new Cigueña("Fenix", "Negra", "Largo, recto y afilado")
const ci2 = new Cigueña()
const ci3 = ci1.clone()
        
console.log("Constructor con parametros");
console.log("Nombre: " + ci1.nombre + "\nColor: " + ci1.color + "\nForma Pico: " + ci1.pico);
        
console.log("\nConstructor sin parametros");
console.log("Nombre: " + ci2.nombre + "\nColor: " + ci2.color + "\nForma Pico: " + ci2.pico);
        
console.log("\nConstructor copia");
console.log("Nombre: " + ci3.nombre + "\nColor: " + ci3.color + "\nForma Pico: " + ci3.pico);
        
ci2.ponerHuevo();
ci1.volar();
ci2.habitat();
ci3.migrar();
        
        
// Instancia de la clase Cocodrilo
console.log("\n\nCocodrilo - Reptil");
const co1 = new Cocodrilo("Tic-Tac", "Negra y escamosa")
const co2 = new Cocodrilo()
const co3 = co1.clone()
        
console.log("Constructor con parametros")
console.log("Nombre: " + co1.nombre + "\nPiel: " + co1.piel)
        
console.log("\nConstructor sin parametros")
console.log("Nombre: " + co2.nombre + "\nPiel: " + co2.piel)
        
console.log("\nConstructor copia")
console.log("Nombre: " + co3.nombre + "\nPiel: " + co3.piel)
        
co1.reproducirse()
co2.habitat()
        
        
// Intancia de la clase Pez Nemo
console.log("\n\nPez Nemo - Pez")
const p1 = new PezNemo("Doris", 6, 2)
const p2 = new PezNemo()
const p3 = p1.clone()
        
console.log("Constructor con parametros")
console.log("Nombre: " + p1.nombre + "\nAletas: " + p1.aletas + "\nBranquias: " + p1.branquias)
        
console.log("\nConstructor sin parametros")
console.log("Nombre: " + p2.nombre + "\nAletas: " + p2.aletas + "\nBranquias: " + p2.branquias)
        
console.log("\nConstructor copia")
console.log("Nombre: " + p3.nombre + "\nAletas: " + p3.aletas + "\nBranquias: " + p3.branquias)
        
// Metodo heredado
p3.escamas()
        
// Interfaces
p1.reproducirse()
p2.habitat()
p3.migrar()
p2.presa()
        
// Instancia de la clase Ranas
console.log("\n\nRanas - Anfibios");
const r1 = new Ranas("Principe Naveen", "Verde oliva con variaciones de tono en el cuerpo")
const r2 = new Ranas()
const r3 = r1.clone()
        
console.log("Constructor con parametros")
console.log("Nombre: " + r1.nombre + "\nPiel: " + r1.piel)
        
console.log("\nConstructor sin parametros")
console.log("Nombre: " + r2.nombre + "\nPiel: " + r2.piel)
        
console.log("\nConstructor copia")
console.log("Nombre: " + r3.nombre + "\nPiel: " + r3.piel)
        
// Metedos heredados
r3.metamorfosis()
        
// Interfaes
r1.reproducirse()
r2.habitat()
r3.presa()