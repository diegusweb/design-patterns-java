package com.avantica.tutorial.designpatterns.singleton;

/**
 * Created by DIego on 7/4/2017.
 */
public class SingletonService {

    private static SingletonService service = null;

    private SingletonService() {
    }

    public static SingletonService getInstance() {
        if (service == null) {
            service = new SingletonService();
        }
        return service;
    }
}