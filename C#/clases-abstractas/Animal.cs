using System;

namespace clases_abstractas
{
    internal abstract class Animal
    {
        private String nombre;
        private String raza;
        private String color;

        // Constructor con parametros
        public Animal(String nombre, String raza, String color)
        {
            this.nombre = nombre;
            this.raza = raza;
            this.color = color;
        }

        // Constructor sin parametros
        public Animal()
        {
            nombre = "Desconocido";
            raza = "Desconocido";
            color = "Desconocido";
        }

        // Constructor copia
        public Animal(Animal a)
        {
            nombre = a.nombre;
            raza = a.raza;
            color = a.color;
        }

        // Destructor
        ~Animal()
        {
            Console.WriteLine("Codigo Borrado...");
        }

        // Metodos abstractos
        //public abstract void comer();
        //public abstract void hacerSonido();
    }
}
