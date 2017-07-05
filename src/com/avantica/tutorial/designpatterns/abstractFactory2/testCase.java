package com.avantica.tutorial.designpatterns.abstractFactory2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DIego on 7/4/2017.
 */
public class testCase {

    @Test
    public void testCaseDemo() {

        Vehiculo ve = Factory.getFactory(1);

        Assert.assertSame(ve.getClass(), Taxi.class);
    }
}
