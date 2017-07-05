package com.avantica.tutorial.designpatterns.abstractFactory2;

/**
 * Created by DIego on 7/4/2017.
 */
public class Factory {
    public static Vehiculo getFactory(int type){
        VehiculoOfTransport factory = null;

        switch (type) {
            case 1:
                factory = new FabricaTaxis();
                break;
            case 2:
                factory = new FabricaMicros();
                break;
            default:
                throw new IllegalArgumentException("Factory not found");
        }
        return factory.createVehicule();
    }
}
