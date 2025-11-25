using System;

namespace C_.clases_abstractas
{
    internal abstract class Mamiferos
    {
        public String nombre;
        public byte edad;

        // Constructor con parametros
        public Mamiferos(String nombre, byte edad)
        {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Metodos
        public abstract void amamantar();
    }
}
