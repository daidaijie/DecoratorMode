package com.net.first.decorator;

/**
 * Created by daidaijie on 2016/1/24.
 */
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
