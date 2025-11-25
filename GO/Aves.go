package main

// Interface para los métodos abstractos
type Aves interface {
	PonerHuevo() string
}

// Struct “base” que simula la clase padre
type BaseAves struct {
	Nombre string
	Color string
	Pico string
}

// Constructor para BaseAves
func NewBaseAves(nombre, color, pico string) *BaseAves {
	return &BaseAves{
		Nombre: nombre,
		Color: color,
		Pico: pico,
	}
}