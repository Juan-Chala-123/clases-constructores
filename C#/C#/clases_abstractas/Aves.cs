using System;

namespace C_.clases_abstractas
{
    internal abstract class Aves
    {
        public String nombre;
        public String color;
        public String pico;

        // Constructor con parametros
        public Aves(String nombre, String color, String pico)
        {
            this.nombre = nombre;
            this.color = color;
            this.pico = pico;
        }

        // Metedo abstracto
        public abstract void ponerHuevo();
    }
}
