using System;

namespace C_.clases_abstractas
{
    internal abstract class Peces
    {
        public String nombre;
        public byte aletas; // Cantidad
        public byte branquias; // Cantidad

        // Constructor con parametros
        public Peces(String nombre, byte aletas, byte branquias)
        {
            this.nombre = nombre;
            this.aletas = aletas;
            this.branquias = branquias;
        }

        // Metodo abstracto
        public abstract void escamas();
    }
}
