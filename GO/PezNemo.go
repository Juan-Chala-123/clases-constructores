package main

import "fmt"

type PezNemo struct {
	BasePeces
}

// Constructor con parametros
func NewPezNemo(nombre string, aletas, branquias int) *PezNemo {
	return &PezNemo{
		BasePeces: *NewBasePeces(nombre, aletas, branquias),
	}
}

// Constructor sin parametros (default)
func NewPezNemoSinParametros() *PezNemo {
	return &PezNemo{
		BasePeces: *NewBasePeces("Pez Nemo", 3, 2),
	}
}

// Constructor copia
func NewPezNemoCopia(copia *PezNemo) *PezNemo {
	return &PezNemo{
		BasePeces: *NewBasePeces(
			copia.Nombre,
			copia.Aletas,
			copia.Branquias,
		),
	}
}

// Destrcutor
func (c *PezNemo) Close() error {
	fmt.Printf("Destructor...")
	return nil
}

// Metodo de la clase padre
func (c *PezNemo) Escamas() string {
	return "Tiene escamas."
}

// Metodos de las interfaces
func (c *PezNemo) Habitat() string {
	return "Mares y Oceanos."
}

func (c *PezNemo) Reproducirse() string {
	return "Reproduccion Ovipara, Vivipara y Ovovivipara."
}

func (c *PezNemo) Presa() string {
	return "Animales mas grandes dentro del mar. Como tambien son presa de los humanos."
}

func (c *PezNemo) Migrar() string {
	return "Migran por diversas ocasiones."
}