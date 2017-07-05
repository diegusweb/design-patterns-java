package com.avantica.tutorial.designpatterns.singleton;

/**
 * Created by DIego on 7/4/2017.
 */

import org.junit.Assert;
import org.junit.Test;

public class DesignPatternsShowCase {

    @Test
    public void singleton() {
        SingletonService instance = SingletonService.getInstance();
        SingletonService sameInstance = SingletonService.getInstance();

        Assert.assertTrue(instance == sameInstance);
    }

}