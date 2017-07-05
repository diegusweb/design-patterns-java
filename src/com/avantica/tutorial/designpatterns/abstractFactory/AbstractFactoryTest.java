package com.avantica.tutorial.designpatterns.abstractFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DIego on 7/4/2017.
 */
public class AbstractFactoryTest  {

    @Test
    public void testCanCreateJsonText()
    {
        JsonFactory demo = new JsonFactory();
        Text demos = demo.createText("demooo");

        Assert.assertSame(demos.getClass(), JsonText.class);
    }

    @Test
    public void testCanCreateHtmlext()
    {
        HtmlFactory demo = new HtmlFactory();
        Text demos = demo.createText("demoo");

        Assert.assertSame(demos.getClass(), HtmlText.class);
    }

    @Test
    public void testCanCreateHtmlTextIsNotJsonText()
    {
        HtmlFactory demo = new HtmlFactory();
        Text demos = demo.createText("demoo");

        Assert.assertNotSame(demos.getClass(), JsonText.class);
    }
}
