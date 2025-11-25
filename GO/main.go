package main

import "fmt"

func main() {
	// Instancias de la clase Caballo
	fmt.Println("Mamiferos - Caballos")
	c1 := NewCaballo("Spirit", 5)
	c2 := NewCaballoSinParemetros()
	c3 := NewCaballoCopia(c1)
	
	fmt.Println("Constructor con parametros")
	fmt.Printf("Nombre: %s\nEdad: %d\n", c1.GetNombre(), c1.GetEdad())
	
	fmt.Println("\nConstructor sin parametros")
	fmt.Printf("Nombre: %s\nEdad: %d\n", c2.GetNombre(), c2.GetEdad())
	
	fmt.Println("\nConstructor copia")
	fmt.Printf("Nombre: %s\nEdad: %d\n", c3.GetNombre(), c3.GetEdad())
	
	// Metodo abstracto heredado de la clase padre Mamifero
	c1.Amamantar()
	
	// Metodos implementados de las interfaces
	c2.Habitat()
	c3.Reproducirse()
	
	
	// Instancia de la clase Cigueña
	fmt.Println("\n\nAves - Cigueña")
	ci1 := NewCigueña("Fenix", "Negra", "Largo, recto y afilado")
	ci2 := NewCigueñaSinParametros()
	ci3 := NewCigueñaCopia(ci1)
	
	fmt.Println("Constructor con parametros")
	fmt.Printf("Nombre: %s\nColor: %s\nForma Pico: %s\n", ci1.Nombre, ci1.Color, ci1.Pico)
	
	fmt.Println("\nConstructor sin parametros")
	fmt.Printf("Nombre: %s\nColor: %s\nForma Pico: %s\n", ci2.Nombre, ci2.Color, ci2.Pico)
	
	fmt.Println("\nConstructor copia")
	fmt.Printf("Nombre: %s\nColor: %s\nForma Pico: %s\n", ci3.Nombre, ci3.Color, ci3.Pico)
	
	ci2.PonerHuevo()
	ci1.Volar()
	ci2.Habitat()
	ci3.Migrar()
	
	
	// Instancia de la clase Cocodrilo
	fmt.Println("\n\nCocodrilo - Reptil")
	co1 := NewCocodrilo("Tic-Tac", "Negra y escamosa")
	co2 := NewCocodriloSinParametros()
	co3 := NewCocodriloCopia(co1)
	
	fmt.Println("Constructor con parametros")
	fmt.Printf("Nombre: %s\nPiel: %s\n", co1.Nombre, co1.Piel)
	
	fmt.Println("\nConstructor sin parametros")
	fmt.Printf("Nombre: %s\nPiel: %s\n", co2.Nombre, co2.Piel)
	
	fmt.Println("\nConstructor copia")
	fmt.Printf("Nombre: %s\nPiel: %s\n", co3.Nombre, co3.Piel)
	
	co1.Reproducirse()
	co2.Habitat()
	
	
	// Instancia de la clase Pez Nemo
	fmt.Println("\n\nPez Nemo - Pez")
	p1 := NewPezNemo("Doris", 6, 2)
	p2 := NewPezNemoSinParametros()
	p3 := NewPezNemoCopia(p1)
	
	fmt.Println("Constructor con parametros")
	fmt.Printf("Nombre: %s\nAletas: %d\nBranquias: %d\n", p1.Nombre, p1.Aletas, p1.Branquias)
	
	fmt.Println("\nConstructor sin parametros")
	fmt.Printf("Nombre: %s\nAletas: %d\nBranquias: %d\n", p2.Nombre, p2.Aletas, p2.Branquias)
	
	fmt.Println("\nConstructor copia")
	fmt.Printf("Nombre: %s\nAletas: %d\nBranquias: %d\n", p3.Nombre, p3.Aletas, p3.Branquias)
	
	// Metodo heredado
	p3.Escamas()
	
	// Interfaces
	p1.Reproducirse()
	p2.Habitat()
	p3.Migrar()
	p2.Presa()
	
	// Instancia de la clase Ranas
	fmt.Println("\n\nRanas - Anfibio")
	r1 := NewRanas("Principe Naveen", "Verde oliva con variaciones de tono en el cuerpo")
	r2 := NewRanasSinParemetros()
	r3 := NewRanasCopia(r1)
	
	fmt.Println("Constructor con parametros")
	fmt.Printf("Nombre: %s\nPiel: %s\n", r1.Nombre, r1.Piel)
	
	fmt.Println("\nConstructor sin parametros")
	fmt.Printf("Nombre: %s\nPiel: %s\n", r2.Nombre, r2.Piel)
	
	fmt.Println("\nConstructor copia")
	fmt.Printf("Nombre: %s\nPiel: %s\n", r3.Nombre, r3.Piel)
	
	// Metodos heredados
	r3.Metamorfosis()
	
	// Interfaces
	r1.Reproducirse()
	r2.Habitat()
	r3.Presa()
}