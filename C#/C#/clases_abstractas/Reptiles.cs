using System;

namespace C_.clases_abstractas
{
    internal abstract class Reptiles
    {
        public String nombre;
        public String piel;

        public Reptiles(String nombre, String piel)
        {
            this.nombre = nombre;
            this.piel = piel;
        }

        // Metodo abstracto
        public abstract void ponerHuevos();

        public void sangre()
        {
            Console.WriteLine("Sangre fria.");
        }
    }
}
