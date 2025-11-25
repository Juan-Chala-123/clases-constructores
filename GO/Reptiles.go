package main

import "fmt"

// Interface para los métodos abstractos
type Reptiles interface {
	PonerHuevos() string
}

// Struct “base” que simula la clase padre
type BaseReptiles struct {
	Nombre string 
	Piel string
}

// Metodo concreto de BaseReptiles
func (b BaseReptiles) Sangre() {
	fmt.Println("Sangre fria.")
}

// Constructor para BaseReptiles
func NewBaseReptiles(nombre, piel string) *BaseReptiles {
	return &BaseReptiles{
		Nombre: nombre,
		Piel: piel,
	}
}