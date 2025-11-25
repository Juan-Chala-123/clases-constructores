package main

import "fmt"

type Ranas struct {
	BaseAnfibios
}

// Constructor con parametros
func NewRanas(nombre, piel string) *Ranas {
	return &Ranas{
		BaseAnfibios: *NewBaseAnfibios(nombre, piel),
	}
}

// Constructor sin parametros
func NewRanasSinParemetros() *Ranas {
	return &Ranas{
		BaseAnfibios: *NewBaseAnfibios("Renacuajo paseador", "Delgada, frágil y permeable"),
	}
}

// Constructor copia
func NewRanasCopia(copia *Ranas) *Ranas {
	return &Ranas{
		BaseAnfibios: *NewBaseAnfibios(
			copia.Nombre,
			copia.Piel,
		),
	}
}

// Destructor
func (c *Ranas) Close() error {
	fmt.Printf("Destructor...")
	return nil
}

// Metodo de la clase padre
func (c *Ranas) Metamorfosis() string {
	return "Proceso de transformacion en cuatro etapas principales: huevo, renacuajo, renacuajo con patas y rana adulta."
}

// Metodos de las interfaces
func (c *Ranas) Habitat() string {
	return "DLugares frescos y húmedos."
}

func (c *Ranas) Reproducirse() string {
	return "Se reproducen sexualmente."
}

func (c *Ranas) Presa() string {
	return "Son presas de las aves y serpientes."
}