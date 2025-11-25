using C_.clases_abstractas;
using C_.interfaces;
using System;

namespace C_.clases
{
    internal class Cigueña : Aves, IVolar, IHabitat, IMigrar
    {
        // Constructor con parametros
        public Cigueña(String nombre, String color, String pico)
        : base(nombre, color, pico)
        {
        }

        // Constructor sin parametros
        public Cigueña() : base("", "", "")
        {
            this.nombre = "Cigueña";
            this.color = "Blanco";
            this.pico = "Conico";
        }

        // Constructor copia
        public Cigueña(Cigueña a) : base("", "", "")
        {
            this.nombre = a.nombre;
            this.color = a.color;
            this.pico = a.pico;
        }

        // Destructor
        ~Cigueña()
        {
            Console.WriteLine("Destructor...");
        }

        public override void ponerHuevo()
        {
            Console.WriteLine("Ponen entre 5 y 10");
        }

        public override void volar()
        {
            Console.WriteLine("La ave vuela.");
        }

        public override void migrar()
        {
            Console.WriteLine("Migran por alimento, reproduccion y evitar el clima extremo.");
        }

        public override void habitat()
        {
            Console.WriteLine("Bosques, Ecosistemas acuáticos...");
        }
    }
}
