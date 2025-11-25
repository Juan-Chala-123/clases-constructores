package main

import "fmt"

type Cigueña struct {
	BaseAves
}

// Constructor con parametros
func NewCigueña(nombre, color, pico string) *Cigueña {
	return &Cigueña{
		BaseAves: *NewBaseAves(nombre, color, pico),
	}
}

// Construtor sin parametros
func NewCigueñaSinParametros() *Cigueña {
	return &Cigueña{
		BaseAves: *NewBaseAves("Cigueña", "Blanco", "Conico"),
	}
}

// Constructor copia
func NewCigueñaCopia(copia *Cigueña) *Cigueña {
	return &Cigueña{
		BaseAves: *NewBaseAves(
			copia.Nombre,
			copia.Color,
			copia.Pico,
		),
	}
}

// Destructor
func (c *Cigueña) Close() error {
	fmt.Printf("Destructor...")
	return nil
}

// Metodo de la clase padre
func (c *Cigueña) PonerHuevo() string {
	return "Ponen entre 5 y 10"
}

// Metodos de las interfaces
func (c *Cigueña) Volar() string {
	return "La ave vuela."
}

func (c *Cigueña) Migrar() string {
	return "Migran por alimento, reproduccion y evitar el clima extremo."
}

func (c *Cigueña) Habitat() string {
	return "Bosques, Ecosistemas acuáticos..."
}