/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_abstractas;

import interfaces.IVehiculo;
/**
 *
 * @author CHALA RAMIREZ
 */
public abstract class Vehiculo implements IVehiculo{
    
    

    // Metodos implementados por la interfaz IVehiculo
    @Override
    public void arrancar() {
        System.out.println("El vehiculo arranco.");
    }

    @Override
    public void detener() {
        System.out.println("El vehiculo se detuvo.");
    }
    
}
