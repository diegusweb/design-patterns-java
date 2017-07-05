package com.avantica.tutorial.designpatterns.abstractFactory2;

/**
 * Created by DIego on 7/4/2017.
 */
public class Bus implements Vehiculo {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public void codVehicule() {
        System.out.println("El Codigo del Bus es : "+getCode());
    }

    @Override
    public int generateCod() {
        int codigoBus=(int) (Math.random()*9999);
        return codigoBus;
    }
}
