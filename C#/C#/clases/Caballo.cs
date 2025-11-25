using C_.clases_abstractas;
using C_.interfaces;
using System;

namespace C_.clases
{
    internal class Caballo : Mamiferos, IHabitat, IReproducirse
    {
        // Constructor con parametros
        public Caballo(String nombre, byte edad) : base(nombre, edad)
        {

        }

        // Constructor sin parametros
        public Caballo() : base("", (byte)12)
        {
            this.nombre = "Pegaso";
            this.edad = 12;
        }

        // Constructor copia
        public Caballo(Caballo c) : base("", (byte)12)
        {
            this.nombre = c.nombre;
            this.edad = c.edad;
        }

        // Destructor
        ~Caballo()
        {
            Console.WriteLine("Destructor...");
        }

        // Metodo sobreescrito
        public override void amamantar()
        {
            Console.WriteLine("El caballo amamanta a sus crias.");
        }

        // Metodos implementados de las interfaces
        public void habitat()
        {
            Console.WriteLine("De acuerdo a sus origenes, como tambien de manera global.");
        }

        public void reproducirse()
        {
            Console.WriteLine("Se reproducen sexualmente.");
        }
    }
}
