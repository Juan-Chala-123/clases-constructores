using C_.clases;
using System;

namespace C_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Instancias de la clase Caballo
            Console.WriteLine("Mamiferos - Caballos");
            Caballo c1 = new Caballo("Spirit", (byte)5);
            Caballo c2 = new Caballo();
            Caballo c3 = new Caballo(c1);

            Console.WriteLine("Constructor con parametros");
            Console.WriteLine("Nombre: " + c1.nombre + "\nEdad: " + c1.edad);

            Console.WriteLine("\nConstructor sin parametros");
            Console.WriteLine("Nombre: " + c2.nombre + "\nEdad: " + c2.edad);

            Console.WriteLine("\nConstructor copia");
            Console.WriteLine("Nombre: " + c3.nombre + "\nEdad: " + c3.edad);

            // Metodo abstracto heredado de la clase padre Mamifero
            c1.amamantar();

            // Metodos implementados de las interfaces
            c2.habitat();
            c3.reproducirse();


            // Instnacia de la clase Cigueña
            Console.WriteLine("\n\nAves - Cigueña");
            Cigueña ci1 = new Cigueña("Fenix", "Negra", "Largo, recto y afilado");
            Cigueña ci2 = new Cigueña();
            Cigueña ci3 = new Cigueña(ci1);

            Console.WriteLine("Constructor con parametros");
            Console.WriteLine("Nombre: " + ci1.nombre + "\nColor: " + ci1.color + "\nForma Pico: " + ci1.pico);

            Console.WriteLine("\nConstructor sin parametros");
            Console.WriteLine("Nombre: " + ci2.nombre + "\nColor: " + ci2.color + "\nForma Pico: " + ci2.pico);

            Console.WriteLine("\nConstructor copia");
            Console.WriteLine("Nombre: " + ci3.nombre + "\nColor: " + ci3.color + "\nForma Pico: " + ci3.pico);

            ci2.ponerHuevo();
            ci1.volar();
            ci2.habitat();
            ci3.migrar();


            // Instancia de la clase Cocodrilo
            Console.WriteLine("\n\nCocodrilo - Reptil");
            Cocodrilo co1 = new Cocodrilo("Tic-Tac", "Negra y escamosa");
            Cocodrilo co2 = new Cocodrilo();
            Cocodrilo co3 = new Cocodrilo(co1);

            Console.WriteLine("Constructor con parametros");
            Console.WriteLine("Nombre: " + co1.nombre + "\nPiel: " + co1.piel);

            Console.WriteLine("\nConstructor sin parametros");
            Console.WriteLine("Nombre: " + co2.nombre + "\nPiel: " + co2.piel);

            Console.WriteLine("\nConstructor copia");
            Console.WriteLine("Nombre: " + co3.nombre + "\nPiel: " + co3.piel);

            co1.reproducirse();
            co2.habitat();


            // Intancia de la clase Pez Nemo
            Console.WriteLine("\n\nPez Nemo - Pez");
            PezNemo p1 = new PezNemo("Doris", (byte)6, (byte)2);
            PezNemo p2 = new PezNemo();
            PezNemo p3 = new PezNemo(p1);

            Console.WriteLine("Constructor con parametros");
            Console.WriteLine("Nombre: " + p1.nombre + "\nAletas: " + p1.aletas + "\nBranquias: " + p1.branquias);

            Console.WriteLine("\nConstructor sin parametros");
            Console.WriteLine("Nombre: " + p2.nombre + "\nAletas: " + p2.aletas + "\nBranquias: " + p2.branquias);

            Console.WriteLine("\nConstructor copia");
            Console.WriteLine("Nombre: " + p3.nombre + "\nAletas: " + p3.aletas + "\nBranquias: " + p3.branquias);

            // Metodo heredado
            p3.escamas();

            // Interfaces
            p1.reproducirse();
            p2.habitat();
            p3.migrar();
            p2.presa();

            // Instancia de la clase Ranas
            Console.WriteLine("\n\nPez Nemo - Pez");
            Ranas r1 = new Ranas("Principe Naveen", "Verde oliva con variaciones de tono en el cuerpo");
            Ranas r2 = new Ranas();
            Ranas r3 = new Ranas(r1);

            Console.WriteLine("Constructor con parametros");
            Console.WriteLine("Nombre: " + r1.nombre + "\nPiel: " + r1.piel);

            Console.WriteLine("\nConstructor sin parametros");
            Console.WriteLine("Nombre: " + r2.nombre + "\nPiel: " + r2.piel);

            Console.WriteLine("\nConstructor copia");
            Console.WriteLine("Nombre: " + r3.nombre + "\nPiel: " + r3.piel);

            // Metedos heredados
            r3.metamorforsis();

            // Interfaes
            r1.reproducirse();
            r2.habitat();
            r3.presa();
        }
    }
}
