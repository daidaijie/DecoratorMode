package com.net.first.decorator;

/**
 * Created by daidaijie on 2016/1/24.
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;


    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
