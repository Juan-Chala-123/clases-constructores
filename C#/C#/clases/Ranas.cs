using C_.clases_abstractas;
using C_.interfaces;
using System;

namespace C_.clases
{
    internal class Ranas : Anfibios, IHabitat, IReproducirse, IPresa
    {
        // Constructor con parametros
        public Ranas(String nombre, String piel) : base(nombre, piel)
        {
        }

        // Constructor sin parametros
        public Ranas() : base("", "")
        {
            this.nombre = "Renacuajo paseador";
            this.piel = "Delgada, frágil y permeable";
        }

        // Constructor copia
        public Ranas(Ranas r) : base("", "")
        {
            this.nombre = r.nombre;
            this.piel = r.piel;
        }

        // Destructor
        ~Ranas()
        {
            Console.WriteLine("Destructor...");
        }

        // Metodos sobreescritos
        public override void metamorforsis()
        {
            Console.WriteLine("Proceso de transformacion en cuatro etapas principales: huevo, renacuajo, renacuajo con patas y rana adulta.");
        }

        // Metodos implementados de las interfaces
        public void habitat()
        {
            Console.WriteLine("Lugares frescos y húmedos.");
        }

        public void reproducirse()
        {
            Console.WriteLine("Se reproducen sexualmente.");
        }

        public void presa()
        {
            Console.WriteLine("Son presas de las aves y serpientes.");
        }
    }
}
