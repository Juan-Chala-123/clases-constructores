package main

// Interface para los métodos abstractos
type Mamiferos interface {
	Amamantar() string
}

// Struct “base” que simula la clase padre
type BaseMamiferos struct {
	Nombre string
	Edad int
}

// Constructor para BaseMamiferos
func NewBaseMamiferos(nombre string, edad int) *BaseMamiferos {
	return &BaseMamiferos{
		Nombre: nombre, 
		Edad: edad,
	}
}

// Simuacion de metodos getters
func (b *BaseMamiferos) GetNombre() string {
    return b.Nombre
}

func (b *BaseMamiferos) GetEdad() int {
    return b.Edad
}