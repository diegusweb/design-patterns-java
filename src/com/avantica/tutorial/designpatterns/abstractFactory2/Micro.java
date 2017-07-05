package com.avantica.tutorial.designpatterns.abstractFactory2;

/**
 * Created by DIego on 7/4/2017.
 */
public class Micro implements Vehiculo {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public void codVehicule() {
        System.out.println("El Codigo del Micro es : "+getCode());
    }

    @Override
    public int generateCod() {
        int codigoBuseta=(int) (Math.random()*9999);
        return codigoBuseta;
    }
}
