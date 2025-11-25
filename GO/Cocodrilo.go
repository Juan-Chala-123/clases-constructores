package main

import "fmt"

type Cocodrilo struct {
	BaseReptiles
}

// Constructor con parametros
func NewCocodrilo(nombre, piel string) * Cocodrilo {
	return &Cocodrilo{
		BaseReptiles: *NewBaseReptiles(nombre, piel),
	}
}

// Constructor sin parametros
func NewCocodriloSinParametros() *Cocodrilo {
	return &Cocodrilo{
		BaseReptiles: *NewBaseReptiles("Cocodrilo Dante", "Piel seca y escamosa"),
	}
}

// Constructor copia
func NewCocodriloCopia(copia *Cocodrilo) *Cocodrilo {
	return &Cocodrilo{
		BaseReptiles: *NewBaseReptiles(
			copia.Nombre,
			copia.Piel,
		),
	}
}

// Destructor
func (c *Cocodrilo) Close() error {
	fmt.Printf("Destructor...")
	return nil
}

// Metodo de la clase padre
func (c *Cocodrilo) PonerHuevos() string {
	return "Ponen entre 14 y 40 huevos al año."
}

// Metodos de las interfaces
func (c *Cocodrilo) Habitat() string {
	return "Rios."
}

func (c *Cocodrilo) Reproducirse() string {
	return "Se reproducen sexualmente, son oviparos."
}