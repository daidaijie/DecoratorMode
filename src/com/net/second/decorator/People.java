package com.net.second.decorator;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class People {
    public People() {
    }

    private String name;

    public People(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
