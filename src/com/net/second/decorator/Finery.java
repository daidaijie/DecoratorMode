package com.net.second.decorator;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Finery extends People {

    protected People component;


    public void Decorate(People component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
