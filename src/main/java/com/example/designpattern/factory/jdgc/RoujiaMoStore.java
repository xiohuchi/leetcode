package com.example.designpattern.factory.jdgc;

/**
 * Created by jingbin on 2016/10/22.
 * 简单工厂模式
 */

public class RoujiaMoStore {

    private SimpleRoujiaMoFactory factory;

    public RoujiaMoStore(SimpleRoujiaMoFactory factory) {
        this.factory = factory;
    }

    public void sellRoujiaMo(String type) {

        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
    }
}
