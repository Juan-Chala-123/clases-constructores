package main

// Interface para los métodos abstractos
type Anfibios interface {
	Metamorfosis() string
}

// Struct “base” que simula la clase padre
type BaseAnfibios struct {
	Nombre string
	Piel string
}

// Constructor para BaseAnfibios
func NewBaseAnfibios(nombre, piel string) *BaseAnfibios {
	return &BaseAnfibios{
		Nombre: nombre,
		Piel: piel,
	}
}