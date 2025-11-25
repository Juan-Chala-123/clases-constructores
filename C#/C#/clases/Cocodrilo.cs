using C_.clases_abstractas;
using C_.interfaces;
using System;

namespace C_.clases
{
    internal class Cocodrilo : Reptiles, IHabitat, IReproducirse
    {
        // Constructor con parametros
        public Cocodrilo(String nombre, String piel) : base(nombre, piel)
        {
        }

        // Constructor sin parametros
        public Cocodrilo() : base("", "")
        {
            this.nombre = "Cocodrilo Dante";
            this.piel = "Piel seca y escamosa";
        }

        // Constructor copia
        public Cocodrilo(Cocodrilo c) : base("", "")
        {
            this.nombre = c.nombre;
            this.piel = c.piel;
        }

        // Destructor
        ~Cocodrilo()
        {
            Console.WriteLine("Destructor...");
        }

        // Metodos sobreescritos
        public override void ponerHuevos()
        {
            Console.WriteLine("Ponen entre 14 y 40 huevos al año.");
        }

        // Metodos implementados de las Interfaces
        public override void reproducirse()
        {
            Console.WriteLine("Se reproducen sexualmente, son oviparos.");
        }

        public override void habitat()
        {
            Console.WriteLine("Rios.");
        }
    }
}
