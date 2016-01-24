package com.net.first;

import com.net.first.decorator.Component;
import com.net.first.decorator.ConcreteComponent;
import com.net.first.decorator.ConcreteDecoratorA;
import com.net.first.decorator.ConcreteDecoratorB;

/**
 * Created by daidaijie on 2016/1/24.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();


    }
}
