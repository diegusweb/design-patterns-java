package com.avantica.tutorial.designpatterns.abstractFactory;

/**
 * Created by DIego on 7/4/2017.
 */
public class HtmlFactory extends AbstractFactory {
    @Override
    Text createText(String texto) {
        return new HtmlText(texto);
    }
}
