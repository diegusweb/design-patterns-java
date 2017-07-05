package com.avantica.tutorial.designpatterns.abstractFactory2;

/**
 * Created by DIego on 7/4/2017.
 */
public class FabricaDeVehiculos {

    public static void createFabricVihicule(VehiculoOfTransport factory)
    {
        Vehiculo objetoVehicule = factory.createVehicule();
        objetoVehicule.codVehicule();
    }
}
