using System;
using inerfaces;

namespace clases_abstractas
{
    internal abstract class Vehiculo : IVehiculo
    {
        private String nombre;
        private String marca;
        private int modelo;
        private String color;

        // Constructor con parametros
        public Vehiculo(String nombre, String marca, int modelo, String color)
        {
            this.nombre = nombre;
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
        }

        // Constructor sin parametros
        public Vehiculo()
        {
            nombre = "Desconocido";
            marca = "Desconocido";
            modelo = 0;
            color = "Desconocido";
        }

        // Constructor copia
        public Vehiculo(Vehiculo v)
        {
            nombre = v.nombre;
            marca = v.marca;
            modelo = v.modelo;
            color = v.color;
        }

        // Destructor
        ~Vehiculo()
        {
            Console.WriteLine("Codigo Borrado...");
        }

        // Metodos abstractos
        //public abstract void arrancar();
        //public abstract void detener();
    }
}
