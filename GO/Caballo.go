package main

import "fmt"

type Caballo struct {
	BaseMamiferos
}

// Constructor con parametros
func NewCaballo(nombre string, edad int) * Caballo {
	return &Caballo{
		BaseMamiferos: *NewBaseMamiferos(nombre, edad),
	}
}

// Constructor sin parametros
func NewCaballoSinParemetros() *Caballo {
	return &Caballo{
		BaseMamiferos: *NewBaseMamiferos("Pegaso", 12),
	}
}

// Constructor copia
func NewCaballoCopia(copia *Caballo) *Caballo {
	return &Caballo{
		BaseMamiferos: *NewBaseMamiferos(
			copia.GetNombre(),
			copia.GetEdad(),
		),
	}
}

// Destructor
func (c *Caballo) Close() error {
	fmt.Printf("Destructor...")
	return nil
}

// Metodo de la clase padre
func (c *Caballo) Amamantar() string {
	return "El caballo amamanta a sus crias."
}

// Metodos de las interfaces
func (c *Caballo) Habitat() string {
	return "De acuerdo a sus origenes, como tambien de manera global."
}

func (c *Caballo) Reproducirse() string {
	return "Se reproducen sexualmente."
}