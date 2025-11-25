using C_.clases_abstractas;
using C_.interfaces;
using System;

namespace C_.clases
{
    internal class PezNemo : Peces, IHabitat, IReproducirse, IPresa, IMigrar
    {
        // Constructor con parametros
        public PezNemo(String nombre, byte aletas, byte branquias) : base(nombre, aletas, branquias)
        {
        }

        // Constructor sin parametros
        public PezNemo() : base("", (byte)3, (byte)2)
        {
            this.nombre = "Pez Nemo";
            this.aletas = 3;
            this.branquias = 2;
        }

        // Constructor copia
        public PezNemo(PezNemo p) : base("", (byte)0, (byte)0)
        {
            this.nombre = p.nombre;
            this.aletas = p.aletas;
            this.branquias = p.branquias;
        }

        // Destructor
        ~PezNemo()
        {
            Console.WriteLine("Destructor...");
        }

        // Metodo de la clase padre sobreescrito
        public override void escamas()
        {
            Console.WriteLine("Tiene escamas.");
        }

        // Metodos implementados de las interfaces
        public void habitat()
        {
            Console.WriteLine("Mares y Oceanos.");
        }

        public void reproducirse()
        {
            Console.WriteLine("Reproduccion Ovipara, Vivipara y Ovovivipara.");
        }

        public void presa()
        {
            Console.WriteLine("Animales mas grandes dentro del mar. Como tambien es presa de los humanos.");
        }

        public void migrar()
        {
            Console.WriteLine("Migran por diversas ocasiones.");
        }
    }
}
