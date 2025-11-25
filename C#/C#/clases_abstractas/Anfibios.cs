using System;

namespace C_.clases_abstractas
{
    internal abstract class Anfibios
    {
        public String nombre;
        public String piel;

        // Constructor con parametros
        public Anfibios(String nombre, String piel)
        {
            this.nombre = nombre;
            this.piel = piel;
        }

        public abstract void metamorforsis();
    }
}
