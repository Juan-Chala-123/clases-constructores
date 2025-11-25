package main

// Interface para los métodos abstractos
type Peces interface {
	Escamas() string
}

// Struct “base” que simula la clase padre
type BasePeces struct {
	Nombre string
	Aletas int
	Branquias int 
}

// Constructor para BasePeces
func NewBasePeces(nombre string, aletas, branquias int) *BasePeces {
	return &BasePeces{
		Nombre: nombre, 
		Aletas: aletas,
		Branquias: branquias,
	}
}